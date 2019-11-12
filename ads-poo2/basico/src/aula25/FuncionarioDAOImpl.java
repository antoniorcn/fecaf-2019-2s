package aula25;

import java.sql.Connection;
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
				+ "(id, matricula, nome, cpf, tempo_servico) "
				+ "VALUES (?, ?, ?, ?, ?)";
		try { 
			PreparedStatement st = con.prepareStatement(sql);
			st.setLong(1, f.getId());
			st.setString(2, f.getMatricula());
			st.setString(3, f.getNome());
			st.setString(4, f.getCpf());
			st.setInt(5, f.getTempoServico());
			st.executeUpdate();
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}

}
