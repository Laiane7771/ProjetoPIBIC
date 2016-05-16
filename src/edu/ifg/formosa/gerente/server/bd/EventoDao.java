package edu.ifg.formosa.gerente.server.bd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;

import edu.ifg.formosa.gerente.shared.Endereco;
import edu.ifg.formosa.gerente.shared.Evento;




public class EventoDao {

	public int insira(Evento evento){

		EnderecoDao eDAO = new EnderecoDao();
		int idEndereco = eDAO.inserir(evento.getEndereco());
		Connection con = null;
		int idEvento  = 0;

		try{
			String sql = "insert into evento (nomeEvento, descricao, organizador, telefone, email, dataInicio, dataEncerra, idendereco) "+
					"values(?,?,?,?,?,?,?,?)";

			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1,evento.getNomeEvento());
			stmt.setString(2,evento.getDescricao());
			stmt.setString(3,evento.getOrganizador());
			stmt.setString(4, evento.getTelefoneContato());
			stmt.setString(5, evento.getEmailContato());
			/*stmt.setDate(6, new Date(
					evento.getDataInicio().getTimeInMillis()));
			stmt.setDate(7, new Date(
					evento.getDataEncerra().getTimeInMillis()));
			stmt.setInt(8, idEndereco);*/

			stmt.executeUpdate();

			ResultSet rs = stmt.getGeneratedKeys();
			rs = stmt.getGeneratedKeys();
			if(rs.next()){
				idEvento = rs.getInt("idevento");
			}
			System.out.println(idEvento);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException("falha ao tentar executar um comando no BD. Verifique sua conexão"+e.getMessage());
		}finally{
			try {
				con.close();
			} catch (Exception e) {
				throw new RuntimeException("não foi possível fechar a conexão com o BD");
			}
		}
		return idEvento;
	}
	
	public Evento buscaEvento(Evento e){
		System.out.println(e.getIdEvento());
		 Evento evento = new Evento();
		try {
	         PreparedStatement stmt = new ConnectionFactory().getConnection().
	                 prepareStatement("select * from evento inner join endereco on evento.idEndereco = endereco.idEndereco "
	                 		+ "inner join cidade on endereco.idCidade = cidade.idCidade inner join estado on cidade.idEstado = estado.idEstado where idEvento = "+e.getIdEvento());
	         ResultSet rs = stmt.executeQuery();
	 
	         if (rs.next()) {
	             // criando o objeto Contato
	            
	             evento.setIdEvento(rs.getInt("idEvento"));
	             evento.setNomeEvento(rs.getString("nomeEvento"));
	             evento.setOrganizador(rs.getString("organizador"));
	             evento.setDescricao(rs.getString("descricao"));
	             evento.setTelefoneContato(rs.getString("telefoneContato"));
	             evento.setEmailContato(rs.getString("emailContato"));
	             evento.getEndereco().setBairro(rs.getString("bairro"));
	             evento.getEndereco().setCep(rs.getString("cep"));
	             evento.getEndereco().setNumero(rs.getString("numero"));
	             evento.getEndereco().getCidade().setNomeCidade(rs.getString("nomeCidade"));
	             evento.getEndereco().getCidade().getEstado().setNomeEstado(rs.getString("nomeEstado"));
	            
	            /* Calendar data = Calendar.getInstance();
	             data.setTime(rs.getDate("dataInicio"));
	             evento.setDataInicio(data);
	             
	             Calendar data1 = Calendar.getInstance();
	             data1.setTime(rs.getDate("dataEncerra"));
	             evento.setDataEncerra(data1);*/
	            
	         }
	         rs.close();
	         stmt.close();
	     } catch (SQLException ex) {
	         throw new RuntimeException(ex);
	     }
		return evento;
	}

	public Vector<Vector<String>> buscaEventos(int id){

		try {
			Vector<Vector<String>> eventos = new Vector<Vector<String>>();
			PreparedStatement stmt = new ConnectionFactory().getConnection().
					prepareStatement("Select * from evento order by idEvento");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Contato
				Evento evento = new Evento();
				evento.setIdEvento(rs.getInt("idEvento"));
				evento.setNomeEvento(rs.getString("nomeEvento"));
				evento.setOrganizador(rs.getString("organizador"));
				evento.setDescricao(rs.getString("descricao"));

				Vector<String> colunas = new Vector<String>();
				colunas.add(""+evento.getIdEvento());
				colunas.add(evento.getNomeEvento());
				colunas.add(evento.getOrganizador());
				colunas.add(evento.getDescricao());

				// adicionando o objeto à lista
				eventos.add(colunas);
			}
			rs.close();
			stmt.close();
			return eventos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Vector<Vector<String>> buscaEventoNome(Evento event){
		try{
			Vector<Vector<String>> eventos = new Vector<Vector<String>>();
			PreparedStatement stmt = new ConnectionFactory().getConnection().
					prepareStatement("Select idEvento, nomeEvento, organizador, descricao, dataInicio from evento " +
							"where nomeEvento like '%"+event.getNomeEvento()+"%'");

			ResultSet rs = stmt.executeQuery();

			while(rs.next()){
				//criando o objeto Evento
				Evento evento =  new Evento();

				evento.setIdEvento(rs.getInt("idEvento"));
				evento.setNomeEvento(rs.getString("nomeEvento"));
				evento.setOrganizador(rs.getString("organizador"));
				evento.setDescricao(rs.getString("descricao"));
				// montando a data através do Calendar
				/*Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataInicio"));
				evento.setDataInicio(data);*/

				Vector<String> colunas = new Vector<String>();
				colunas.add(""+evento.getIdEvento());
				colunas.add(evento.getNomeEvento());
				colunas.add(evento.getOrganizador());
				colunas.add(evento.getDescricao());
				/*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				colunas.add(sdf.format(evento.getDataInicio().getTime()));*/

				eventos.add(colunas);
			}
			rs.close();
			stmt.close();
			return eventos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Evento evento) {
		String sql = "update evento set nomeevento= ?, descricao = ?, organizador = ?, telefone = ?, email = ?, datainicio=?, dataencerra=?" +
				"  where idevento = ?";

		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection().prepareStatement(sql);
			stmt.setString(1, evento.getNomeEvento());
			stmt.setString(2, evento.getDescricao());
			stmt.setString(3, evento.getOrganizador());
			stmt.setString(4, evento.getTelefoneContato());
			stmt.setString(5, evento.getEmailContato());
			
			/*stmt.setDate(6, new Date(evento.getDataInicio()
					.getTimeInMillis()));
			stmt.setDate(7, new Date(evento.getDataEncerra()
					.getTimeInMillis()));*/
					
			stmt.setInt(8, evento.getIdEvento());
			//System.out.println(stmt.toString());

			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Evento: " +e.getMessage());
			throw new RuntimeException(e);
		}
	}
	public void alteraEndereco(Endereco endereco){
		Connection con = null;
		
		try{
			String sql = "Update estado set nomeestado = ? where idEstado = ?";
			
			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, endereco.getCidade().getEstado().getNomeEstado());
			stmt.setInt(2, endereco.getCidade().getEstado().getIdEstado());
			
			stmt.executeUpdate();
			
			
			String sql1 = "Update Cidade set nomeCidade=? where idCidade = ?";
			stmt = con.prepareStatement(sql1);
			stmt.setString(1, endereco.getCidade().getNomeCidade());
			stmt.setInt(2,endereco.getCidade().getIdCidade());
			stmt.executeUpdate();
			
			
		String sql2 = "Update  endereco set  cep =?,numero=?, bairro=?,localDoEvento=? where idEndereco = ?";
		            
		stmt = con.prepareStatement(sql2);
		stmt.setString(1, endereco.getCep());
		stmt.setString(2, endereco.getNumero());
		stmt.setString(3,endereco.getBairro());
		stmt.setString(4, endereco.getLocalDoEvento());
		stmt.setInt(5,endereco.getIdEndereco());
		stmt.executeUpdate();
			
		System.out.println(stmt.toString());
        stmt.close();
    } catch (SQLException e) {
   	 System.out.println("Endereco: " + e.getMessage());
        throw new RuntimeException(e);
    }
		
   }
	public void remove(Evento evento) {
		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection().prepareStatement("delete from evento where idEvento=?");
			stmt.setInt(1, evento.getIdEvento());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}