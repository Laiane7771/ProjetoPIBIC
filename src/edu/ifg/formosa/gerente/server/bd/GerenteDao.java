package edu.ifg.formosa.gerente.server.bd;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import edu.ifg.formosa.gerente.shared.Gerente;

public class GerenteDao {

	public static ArrayList<String> buscaNomeGerente(Gerente idGerente) throws SQLException{
		ArrayList<String> nomeDeGerente = new ArrayList<String>();
		try{

			PreparedStatement stmt = new ConnectionFactory().getConnection().
					prepareStatement("SELECT usuario.idusuario, usuario.nomePessoa, gerente.idGerente FROM usuario"+
							"INNER JOIN gerente ON pessoa.idUsuario = usuario.idUsuario where="+idGerente.getIdGerente());

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				Gerente gerente = new Gerente();
				gerente.setNome(rs.getString("nomePessoa"));
				gerente.setIdUsuario(rs.getInt("idUsuario"));
				nomeDeGerente.add(gerente.getNome());
				
			}
			rs.close();
			stmt.close();
			return nomeDeGerente;
		}catch(SQLException e){

		}
		return null;
	}

	
}
