package aula18.control;

import java.util.ArrayList;
import java.util.List;

import aula17.entidade.Aluno;

public class AlunoControl {
	private List<Aluno> lista = new ArrayList<>();
	
	public void adicionar(Aluno a) { 
		lista.add(a);
	}
	
	public Aluno pesquisaPorNome(String nome) { 
		for (Aluno a : lista) { 
			if( a.getNome().contains(nome)) {
				return a;
			}
		}
		return null;
	}
}
