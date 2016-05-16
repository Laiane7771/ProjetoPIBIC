package edu.ifg.formosa.gerente.server.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import edu.ifg.formosa.gerente.shared.Coordenador;
import edu.ifg.formosa.gerente.shared.Usuario;


public class CoordenadorDao {

	public String busca(Coordenador coordenador){
		String sql = "select usuario.nome, usuario.senha from usuario"
				+ "inner join coordenador on usuario.idUsuario = coordenador.idUsuario";

		Connection con = null;
		try{
			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			Usuario usuario = new Usuario();
			
			while(rs.next()){
				usuario.setCpf(rs.getString("cpf"));
				usuario.setSenha(rs.getString("senha"));
			}

		} catch (Exception e) {
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

	public Coordenador buscaPessoaPorCPF(Coordenador coordenador){
		String sql = "SELECT usuario.cpf, usuario.senha FROM pessoa INNER JOIN coordenador ON usuario.idUsuario = coordenador.idUsuario where usuario.cpf=?";
		Coordenador p = null;
		Connection con = null;
		try{
			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, coordenador.getUsuario().getCpf());
			ResultSet rs = stmt.executeQuery();

			if(rs.next()){
				coordenador = new Coordenador();
				coordenador.getUsuario().setCpf(rs.getString("cpf"));
				coordenador.getUsuario().setSenha(rs.getString("senha"));
			}

		} catch (Exception e) {
			throw new RuntimeException("Falha ao tentar executar um comando no BD. Verifique sua conexão");
		}finally{
			try {
				con.close();
			} catch (Exception e) {
				throw new RuntimeException("Não foi possível fechar a conexão com o BD");
			}
		}
		return p;
	}
	
	public void insereCoordenador(){
		
	}
}







