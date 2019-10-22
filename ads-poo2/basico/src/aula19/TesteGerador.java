package aula19;

public class TesteGerador {
	
	public static void main(String[] args) {
		
		GeraConexao g1 = GeraConexao.getInstancia();
		System.out.println(g1);
		
		GeraConexao g2 = GeraConexao.getInstancia();
		System.out.println(g2);
	
		GeraConexao g3 = GeraConexao.getInstancia();
		System.out.println(g3);
		
		Conexao c1 = g1.getConexao();
		System.out.println(c1);
		
		Conexao c2 = g2.getConexao();
		System.out.println(c2);
		
		Conexao c3 = g3.getConexao();
		System.out.println(c3);
		
		
	}

}
