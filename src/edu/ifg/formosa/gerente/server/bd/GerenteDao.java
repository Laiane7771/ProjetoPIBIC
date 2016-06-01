package edu.ifg.formosa.gerente.server.bd;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import edu.ifg.formosa.gerente.shared.Gerente;

public class GerenteDao {

	public static ArrayList<String> buscaNomeGerente(Gerente gerente) throws SQLException{
		ArrayList<String> nomeDeGerente = new ArrayList<String>();
		try{

			PreparedStatement stmt = new ConnectionFactory().getConnection().
					prepareStatement("SELECT usuario.idusuario, usuario.nomePessoa, gerente.idGerente FROM usuario"+
							"INNER JOIN gerente ON usuario.idUsuario = gerente.idUsuario where="+gerente.getIdGerente());

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				Gerente gerente2 = new Gerente();
				gerente2.setNome(rs.getString("nomePessoa"));
				gerente2.setIdUsuario(rs.getInt("idUsuario"));
				nomeDeGerente.add(gerente.getNome());
				
			}
			rs.close();
			stmt.close();
			return nomeDeGerente;
		}catch(SQLException e){

		}
		return null;
	}

	public static Gerente buscaLogineSenha(Gerente gerente){
		String sql ="SELECT usuario.nome, gerente.matriculaSiape FROM usuario"+
					"INNER JOIN gerente ON usuario.idUsuario = gerente.idUsuario";
		Connection con = null;
		try{
			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			Gerente gerente1 = new Gerente();

			while(rs.next()){
				gerente1.setCpf(rs.getString("cpf"));
				gerente1.setSenha(rs.getString("senha"));
				
			}

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
