package edu.ifg.formosa.gerente.server.bd;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import edu.ifg.formosa.gerente.shared.Gerente;

public class GerenteDao {

	public ArrayList<String> buscaNomeGerente(Gerente idGerente) throws SQLException{
		ArrayList<String> nomeDeGerente = new ArrayList<String>();
		try{

			PreparedStatement stmt = new ConnectionFactory().getConnection().
					prepareStatement("SELECT usuario.idusuario, usuario.nomePessoa, gerente.idGerente FROM usuario"+
							"INNER JOIN gerente ON pessoa.idUsuario = usuario.idUsuario where="+idGerente.getIdGerente());

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				Gerente gerente = new Gerente();
				gerente = null;
				gerente.getUsuario().setNome(rs.getString("nomePessoa"));
				gerente.getUsuario().setIdUsuario(rs.getInt("idUsuario"));
				nomeDeGerente.add(gerente.getUsuario().getNome());
				
			}
			rs.close();
			stmt.close();
			return nomeDeGerente;
		}catch(SQLException e){

		}
		return null;
	}

}
