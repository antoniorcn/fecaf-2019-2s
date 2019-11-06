package aula23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlunoControl {
	public static final String URL = 
		"jdbc:mysql://localhost:3306/escoladb?serverTimezone=UTC&allowMultiQueries=true";
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
			e.printStackTrace();
		}		
	}
	
	private List<Aluno> lista = new ArrayList<>();
	
	public void adicionar(Aluno a) { 
		try { 
			String sql = 
			"INSERT INTO aluno VALUES (0, ?, ?, ?, '1980-07-03', ?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, a.getRa());
			st.setString(2, a.getNome());
			st.setString(3, a.getCurso());
			st.setString(4, a.getTelefone());
			
			st.executeUpdate();
			System.out.println("Inserido no banco");
		}catch (SQLException e) { 
			System.out.println("Erro ao inserir no banco");
			e.printStackTrace();
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
