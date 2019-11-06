package aula23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TesteDB {
	private static final String URL = 
			"jdbc:mysql://localhost:3306/escoladb?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "";
	public static void main(String[] args) {
		try { 
		Connection con = 
		   DriverManager.getConnection(URL, USER, PASS);
		System.out.println("Conectado com sucesso");
		String sql = "SELECT * FROM aluno";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		System.out.println("Dados lidos com sucesso");
		while(rs.next()) {
			String n = rs.getString("nome");
			String r = rs.getString("ra");
			System.out.println("Ra do aluno: " + r);
			System.out.println("Nome do aluno: " + n);
		}
		
		} catch(Exception e) { 
			System.out.println("Erro de conexao");
			e.printStackTrace();
		}
	}
}
