package edu.ifg.formosa.principal.server.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import edu.ifg.formosa.principal.shared.Gerente;


public class GerenteDao {

	public static Gerente buscaLogineSenha(){
		String sql ="SELECT usuario.nome, gerente.matriculaSiape FROM usuario"+
					"INNER JOIN gerente ON usuario.idUsuario = gerente.idUsuario";
		Connection con = null;
		try{
			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			Gerente gerente = new Gerente();

			while(rs.next()){
				gerente.setCpf(rs.getString("cpf"));
				gerente.setSenha(rs.getString("senha"));
				
			}
			//return gerente1;
		}catch(Exception e){
			System.out.println(e.getMessage());
			throw new RuntimeException("falha ao tentar executar um comando no BD. Verifique sua conexão");
		}finally{
			try {
				con.close();
			} catch (Exception e) {
				throw new RuntimeException("não foi possível fechar a conexão com o BD");
			}
		}
		return null;
	}
}
