package aula25;

public class ProdutoControl {
	
	private ProdutoDAO produtoDao = new ProdutoDAOImpl();
	
	public void adicionar(Produto p) { 
		produtoDao.adicionar(p);
	}

}
