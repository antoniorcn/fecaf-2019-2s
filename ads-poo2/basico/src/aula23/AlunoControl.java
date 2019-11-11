package aula23;

import java.util.ArrayList;
import java.util.List;

public class AlunoControl {
	private AlunoDAO alunoDAO = new AlunoDAOImpl();

	private List<Aluno> lista = new ArrayList<>();
	
	public void adicionar(Aluno a) { 
		alunoDAO.adicionar(a);
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
