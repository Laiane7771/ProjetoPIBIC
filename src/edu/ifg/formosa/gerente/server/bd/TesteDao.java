package edu.ifg.formosa.gerente.server.bd;

import java.sql.SQLException;
import java.util.ArrayList;

import edu.ifg.formosa.gerente.shared.Gerente;

public class TesteDao {
	
	public static void main(String[]args) throws SQLException{
		
		Gerente gerente = new Gerente();
		gerente.getUsuario().setIdUsuario(6);
		
		GerenteDao gerenteDao = new GerenteDao();
		ArrayList<String> nome = gerenteDao.buscaNomeGerente(gerente);
		System.out.println(nome);
		
	}
}
