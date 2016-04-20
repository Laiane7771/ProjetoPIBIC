package edu.ifg.formosa.principal.client.bd;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ConnectionFactory {
	 public Connection getConnection() {
	        try {
	            return DriverManager.getConnection(
	            		"jdbc:postgresql://localhost:5432/Eventif", "postgres","12345");
	        } catch (Exception e) {
	            throw new RuntimeException("falha ao tentar acessar o BD. Verifique sua conexão");
	        }
	    }
}
