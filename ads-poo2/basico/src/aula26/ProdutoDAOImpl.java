package aula26;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOImpl implements ProdutoDAO {
	private static final String URL = 
			"jdbc:mysql://localhost:3306/supermercado?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "";

	private Connection con;

	public ProdutoDAOImpl() { 
		try { 
			con = DriverManager.getConnection(URL, USER, PASS);
			// System.out.println("Conectado");
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
	
	public List<Produto> pesquisarPorNome(String nome) { 
		List<Produto> lista = new ArrayList<>();
		try { // codigo, nome, peso, preco, validade
			String sql = "SELECT * FROM produto WHERE nome LIKE ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, "%" + nome + "%");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Produto p = new Produto();
				String cod = rs.getString("codigo");
				p.setCodigo(cod);
				String n = rs.getString("nome");
				p.setNome(n);
				p.setPeso( rs.getDouble("peso") );
				p.setPreco( rs.getDouble("preco") );
				p.setValidade( 
					new java.util.Date(
						rs.getDate("validade").getTime()) );
				lista.add(p);
			} } catch (SQLException e) { e.printStackTrace();	}
		return lista;
	}
	
	public static void main(String[] args) {
		ProdutoDAO pDao = new ProdutoDAOImpl();
//		Produto prod = new Produto();
//		prod.setCodigo("11111");
//		prod.setNome("Tenis Nike");
//		prod.setPeso(200.0);
//		prod.setPreco(900.0);
//		prod.setValidade(new java.util.Date());
//		
//		pDao.adicionar(prod);
		List<Produto> lista = pDao.pesquisarPorNome("Tenis Nike");
		System.out.println("Encontrados: " + lista.size());
		Produto p = lista.get(0);
		System.out.println("Codigo :" + p.getCodigo());
	}
}
