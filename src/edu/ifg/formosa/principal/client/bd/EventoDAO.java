package edu.ifg.formosa.principal.client.bd;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import edu.ifg.formosa.principal.shared.Endereco;
import edu.ifg.formosa.principal.shared.Evento;


public class EventoDAO {

	
	
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
	            Endereco endereco = new Endereco();
	            
	             evento.setIdEvento(rs.getInt("idEvento"));
	             evento.setNomeEvento(rs.getString("nomeEvento"));
	             evento.setOrganizador(rs.getString("organizador"));
	             evento.setDescricao(rs.getString("descricao"));
	             evento.setEmailContato(rs.getString("emailContato"));
	             evento.setTelefoneContato(rs.getString("telefoneContato"));
	             evento.getIdEndereco().setBairro(rs.getString("bairro"));
	             evento.getIdEndereco().setCep(rs.getString("cep"));
	             evento.getIdEndereco().setNumero(rs.getString("numero"));
	             evento.getIdEndereco().getIdCidade().setNomeCidade(rs.getString("nomeCidade"));
	             evento.getIdEndereco().getIdCidade().getIdEstado().setNomeEstado(rs.getString("nomeEstado"));
	            
	             Calendar data = Calendar.getInstance();
	             data.setTime(rs.getDate("dataInicio"));
	             evento.setDataInicio(data);
	             
	             Calendar data1 = Calendar.getInstance();
	             data1.setTime(rs.getDate("dataEncerra"));
	             evento.setDataEncerra(data1);
	             
	             
	            
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
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataInicio"));
				evento.setDataInicio(data);

				Vector<String> colunas = new Vector<String>();
				colunas.add(""+evento.getIdEvento());
				colunas.add(evento.getNomeEvento());
				colunas.add(evento.getOrganizador());
				colunas.add(evento.getDescricao());
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				colunas.add(sdf.format(evento.getDataInicio().getTime()));

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
			
			stmt.setDate(6, new Date(evento.getDataInicio()
					.getTimeInMillis()));
			stmt.setDate(7, new Date(evento.getDataEncerra()
					.getTimeInMillis()));
					
			stmt.setInt(8, evento.getIdEvento());
			//System.out.println(stmt.toString());

			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Evento: " +e.getMessage());
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