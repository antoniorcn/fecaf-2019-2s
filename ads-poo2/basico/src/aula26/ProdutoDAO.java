package aula26;

import java.util.List;

public interface ProdutoDAO {
	void adicionar(Produto p);
	List<Produto> pesquisarPorNome(String nome);
	// List<Produto> pesquisarPorCodigo(String codigo);
	// List<Produto> pesquisarPorValidade(String validade);
}
