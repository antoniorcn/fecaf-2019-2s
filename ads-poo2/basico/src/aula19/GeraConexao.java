package aula19;
public class GeraConexao {
	private static GeraConexao gerador;
	private Conexao con;
	private GeraConexao() { 
		con = new Conexao();
	}
	public static GeraConexao getInstancia() {
		if (gerador == null) { 
			gerador = new GeraConexao();
		}
		return gerador;
	}
	public Conexao getConexao() { 
		return con;
	}
}
