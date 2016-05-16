package edu.ifg.formosa.gerente.server.bd;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/Eventif", "root","novosemestre");
		} catch (Exception e) {
			throw new RuntimeException("falha ao tentar acessar o BD. Verifique sua conexão: " + e.getMessage());
		}
	}
}

