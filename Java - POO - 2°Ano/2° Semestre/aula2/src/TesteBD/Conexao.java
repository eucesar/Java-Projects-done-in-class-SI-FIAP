package TesteBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String user = "rm98007";
	private String password = "201104";
	private String driver = "oracle.jdbc.driver.OracleDriver"; //config driver do sql
	private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:" //subtituir o @ q eu usei para conexão do login do sql, subtituir 
			+ "1521:ORCL"; //o numero esta no sql e o orcl, esta no quando vou logar no bd da fiap
	
	//metodo retornando conection - conexão do bd
	//a palavra "Conection"" é uma conexão da propria linguagem
	public Connection connectar() {
		Connection connection = null;
		
		try {
			Class.forName(driver); //preciso usar try e catch pq quando acontecer algo, ele faz outro, como se fosse um if obrigatorio de erro
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("erro ao carregar o driver/n" + e);
		} catch (SQLException e) { //preciso de um outro catch se n conseguir conectar na base de dados, resumindo, dessa linha de codigo
			System.out.println("erro ao conectar na base de dados\n" + e);
		}
		
		return connection;
	}
}
