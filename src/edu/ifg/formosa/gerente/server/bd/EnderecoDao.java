package edu.ifg.formosa.gerente.server.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class EnderecoDao {
	
	public int inserir(edu.ifg.formosa.gerente.shared.Endereco endereco){
		
		Connection con = null;
		int idEndereco = 0;
		
		try{
			String sql = "insert into estado"+
					"(nomeestado) values (?)";
			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	
			stmt.setString(1, endereco.getCidade().getEstado().getNomeEstado());
			
			stmt.executeUpdate();
			
			ResultSet rs = stmt.getGeneratedKeys();
			int idEstado = 0;
			if(rs.next()){
				idEstado = rs.getInt("idestado");
			}
			System.out.println(idEstado);
			
			String sql1 = "insert into Cidade(nomeCidade,idEstado) values(?,?)";
			stmt = con.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, endereco.getCidade().getNomeCidade());
			
			 stmt.setInt(2,idEstado);
			 stmt.executeUpdate();
			 
			    rs = stmt.getGeneratedKeys();
			    int idCidade = 0;
				if(rs.next()){
					idCidade = rs.getInt("idcidade");
				}
				System.out.println(idCidade);
				
				String sql2 = "insert into endereco (cep,numero,bairro,localDoEvento,idCidade)"+
				               "values(?,?,?,?,?)";
				stmt = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
				stmt.setString(1, endereco.getCep());
				stmt.setString(2, endereco.getNumero());
				stmt.setString(3,endereco.getBairro());
				stmt.setString(4, endereco.getLocalDoEvento());
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
		
	