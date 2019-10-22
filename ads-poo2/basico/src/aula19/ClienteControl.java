package aula19;

import java.util.ArrayList;
import java.util.List;
public class ClienteControl {
	private List<Cliente> lista =
			new ArrayList<>();
	public void adicionar(Cliente c) {
		lista.add(c);
		System.out.println(lista.size());
	}
	public Cliente pesquisarPorNome(String nome) { 
		for (Cliente c : lista) { 
			if (c.getNome().contains(nome)) { 
				return c;
			}
		}
		return null;
	}
}
