package aula25;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FuncionarioDAOImpl implements FuncionarioDAO {
	
	private final static String URL = "jdbc:mysql://localhost/supermercado?serverTimezone=UTC";
	private final static String USER = "root";
	private final static String PASS = "";
	private Connection con;
	
	public FuncionarioDAOImpl() { 
		try { 
			con = DriverManager.getConnection(URL, USER, PASS);
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}
	
	public void adicionar(Funcionario f) { 
		String sql = "INSERT INTO funcionario "
				+ "(matricula, nome, cpf, tempo_servico, data_contratacao) "
				+ "VALUES (?, ?, ?, ?, ?)";
		try { 
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, f.getMatricula());
			st.setString(2, f.getNome());
			st.setString(3, f.getCpf());
			st.setInt(4, f.getTempoServico());
			st.setDate(5, new java.sql.Date(f.getContratacao().getTime()));
			st.executeUpdate();
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}

}
