package br.com.agenda.factory;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	// Nome do usuário do mysql
	private static final String USERNAME = "root";

	// Senha do banco
	private static final String PASSWORD = "";

	// Caminho banco de dados, porta, nome do banco de dados
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";

	/*
	 * Conexão com o banco de dados
	 */
	public static Connection createConnectionToMYSQL() throws Exception {
		// Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");

		// Cria a Conexão com o banco de dados
		Connection connection = (Connection) DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		return connection;
	}

	public static void main(String[] args) throws Exception {

		// Recuperar uma Conexão com o banco de dados
		Connection con = createConnectionToMYSQL();

		// Testar se a Conexão é nula
		if (con != null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
	}

}
