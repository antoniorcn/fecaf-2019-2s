package aula23;

public interface AlunoDAO {
	void adicionar(Aluno a);
	Aluno pesquisarPorNome(String nome);
}
