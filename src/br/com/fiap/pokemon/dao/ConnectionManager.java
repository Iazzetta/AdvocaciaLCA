package br.com.fiap.pokemon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe representando a conexão com banco de dados Oracle
 * @author Docau
 *
 */

public class ConnectionManager {

	private static ConnectionManager instance;
	public Connection connection;

	private ConnectionManager() {

	}

	public static ConnectionManager getInstance() {

		if (instance == null) {

			instance = new ConnectionManager();

		}

		return instance;

	}

	public Connection getConnection() {

		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM","pqpfdp"); //NOME DO BANCO XE
			System.out.println("Conectado ao banco.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Não foi possivel conectar no banco de dados: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Não foi possivel encontrar a Classe: " + e.getMessage());
		}

		return connection;
	}
	
	

}
