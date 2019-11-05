package aula22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlunoControl {
	public static final String URL = 
			"jdbc:mysql://localhost:3306/supermercado?serverTimezone=UTC";
	public static final String USER = "root";
	public static final String PASS = "";
	private Connection con;
	public AlunoControl() { 
		try { 
			con = 
			DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conectado no banco");
		} catch (SQLException e) {
			System.out.println("Erro de conexao");
		}		
	}
	
	private List<Aluno> lista = new ArrayList<>();
	
	public void adicionar(Aluno a) { 
		try { 
			Statement st = con.createStatement();
			String sql = "INSERT INTO aluno VALUES (0, '"+ a.getRa() 
			+ "', '" + a.getNome() 
			+ "', '" + a.getCurso() 
			+ "', '1980-07-03'"
			+ ", '" + a.getTelefone() + "')";
			st.executeUpdate(sql);
			System.out.println("Inserido no banco");
		}catch (SQLException e) { 
			System.out.println("Erro ao inserir no banco");
		}
		lista.add(a);
	}
	
	public Aluno pesquisaPorNome(String nome) { 
		for (Aluno a : lista) { 
			if( a.getNome().contains(nome)) {
				return a;
			}
		}
		return null;
	}
}
