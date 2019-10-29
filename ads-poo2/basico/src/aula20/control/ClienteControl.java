package aula20.control;

import java.util.ArrayList;
import java.util.List;

import aula20.entidade.Cliente;
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
	
	public Cliente pesquisarPorId(long id) { 
		for (Cliente c : lista) { 
			if (c.getId() == id) { 
				return c;
			}
		}
		return null;
	}
}
