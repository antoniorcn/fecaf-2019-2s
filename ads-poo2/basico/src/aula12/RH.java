package aula12;

public class RH {
	private Funcionario[] funcionarios 
				= new Funcionario[100];
	private int indice = 0;
	
	public void adicionarFuncionario(Funcionario f) { 
		funcionarios[indice] = f;
		indice = indice + 1;
	}

}
