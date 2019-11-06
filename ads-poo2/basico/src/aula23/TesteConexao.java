package aula23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexao {
	public static final String URL = 
			"jdbc:mysql://localhost:3306/supermercado?serverTimezone=UTC";
	public static final String USER = "root";
	public static final String PASS = "";
	public static void main(String[] args) throws SQLException {
		try { 
			Connection con = 
			DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conectado no banco");
			Statement st = con.createStatement();
			st.executeUpdate("INSERT INTO funcionario VALUES(0, '1111', 'Antonio Silva', '111.111.111-11', '2019-07-01', 90)");
			System.out.println("Registro inserido com sucesso");
		} catch (SQLException e) {
			System.out.println("Erro de conexao");
		}		
		System.out.println("Fim de programa");
	}

}
