package aula25;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProdutoDAOImpl implements ProdutoDAO {
	private static final String URL = 
			"jdbc:mysql://localhost:3306/supermercado?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "";

	private Connection con;

	public ProdutoDAOImpl() { 
		try { 
			con = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conectado");
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}

	public void adicionar(Produto p) {
		try { 
			String sql = "INSERT INTO produto "
					+ "(codigo, nome, peso, preco, validade) "
					+ "VALUES (?, ?, ?, ?, ?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, p.getCodigo());
			st.setString(2, p.getNome());
			st.setDouble(3, p.getPeso());
			st.setDouble(4, p.getPreco());
			// java.util.Date d = p.getValidade();
			// long millisec = d.getTime();
			// java.sql.Date dSql = new java.sql.Date(millisec);
			// st.setDate(5, dSql);
			st.setDate(5, new java.sql.Date(p.getValidade().getTime()));
			st.executeUpdate();
		} catch(Exception e) { 
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ProdutoDAO pDao = new ProdutoDAOImpl();
		Produto prod = new Produto();
		prod.setCodigo("11111");
		prod.setNome("Tenis Nike");
		prod.setPeso(200.0);
		prod.setPreco(900.0);
		prod.setValidade(new java.util.Date());
		
		pDao.adicionar(prod);
	}
}
