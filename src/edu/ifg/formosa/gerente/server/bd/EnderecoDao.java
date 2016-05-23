package edu.ifg.formosa.gerente.server.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.ifg.formosa.gerente.shared.Endereco;
import edu.ifg.formosa.gerente.shared.Estado;
import edu.ifg.formosa.gerente.shared.Evento;



public class EnderecoDao {
	
	public static ArrayList<Estado> buscaEstadoListBox(){
		Estado estado = new Estado();
		Connection con = null;
		try{
			PreparedStatement stmt = new ConnectionFactory().getConnection().prepareStatement("select"
					+ "* from estado");
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()){
				estado.setNomeEstado(rs.getString("nomeestado"));
				
				ArrayList<Estado> estados = new ArrayList<Estado>();
				estados.add(estado);
				return estados;
				
			}
			
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	/**
	 * 	System.out.println(e.getIdEvento());
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
	             evento.getEndereco().setNomeCidade(rs.getString("nomeCidade"));
	             evento.getEndereco().setNomeEstado(rs.getString("nomeEstado"));
	           
	            
	         }
	         rs.close();
	         stmt.close();
	     } catch (SQLException ex) {
	         throw new RuntimeException(ex);
	     }
		return evento;
	 * @param endereco
	 * @return
	 */
	public int inserir( Endereco endereco){
		
		Connection con = null;
		int idEndereco = 0;
		
		try{
			String sql = "insert into estado(nomeestado) values (?)";
			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	
			stmt.setString(1, endereco.getNomeEstado());
			
			stmt.executeUpdate();
			
			ResultSet rs = stmt.getGeneratedKeys();
			int idEstado = 0;
			if(rs.next()){
				idEstado = rs.getInt("idEstado");
			}
			System.out.println(idEstado);
			
			String sql1 = "insert into Cidade(nomeCidade,idEstado) values(?,?)";
			stmt = con.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, endereco.getNomeCidade());
			
			 stmt.setInt(2,idEstado);
			 stmt.executeUpdate();
			 
			    rs = stmt.getGeneratedKeys();
			    int idCidade = 0;
				if(rs.next()){
					idCidade = rs.getInt("idCidade");
				}
				System.out.println(idCidade);
				
				String sql2 = "insert into endereco(cep,numero,bairro,localDoEvento,endereco,idCidade)"+
				               "values(?,?,?,?,?,?)";
				stmt = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
				stmt.setString(1, endereco.getCep());
				stmt.setString(2, endereco.getNumero());
				stmt.setString(3,endereco.getBairro());
				stmt.setString(4, endereco.getLocalDoEvento());
				stmt.setString(5, endereco.getEndereco());
				stmt.setInt(5, idCidade);
				
				stmt.executeUpdate();
				
				rs = stmt.getGeneratedKeys();
				
				if(rs.next()){
					idEndereco = rs.getInt("idendereco");
				}
				System.out.println(idEndereco);
				  
				
		 } catch (Exception e) {
			 System.out.println(e.getMessage());
	         throw new RuntimeException("falha ao tentar executar um comando no BD. Verifique sua conexão");
	     }finally{
	    	 try {
				con.close();
			} catch (Exception e) {
				throw new RuntimeException("não foi possível fechar a conexão com o BD");
			}
	     }
		return idEndereco;
	 }
	
}
		
	