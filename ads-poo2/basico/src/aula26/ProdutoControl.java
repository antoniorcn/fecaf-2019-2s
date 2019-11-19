package aula26;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProdutoControl {
	
	private ProdutoDAO produtoDao = new ProdutoDAOImpl();
	private ObservableList<Produto> lista = 
			FXCollections.observableArrayList();
	
	public void adicionar(Produto p) { 
		produtoDao.adicionar(p);
	}
	
	public List<Produto> pesquisarPorNome(String nome) { 
		List<Produto> li = produtoDao.pesquisarPorNome(nome);
		lista.clear();
		lista.addAll(li);
		return li;
	}
	
	public ObservableList<Produto> getLista() { 
		return lista;
	}

}
