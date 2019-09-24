package aula12;

public class Funcionario {

	private String nome;
	private int idade;
	
	public String getNome() { 
		return nome;
	}
	public void setNome(String value) {
		if (value != null) {
			this.nome = value;
		}
	}
	
	public int getIdade() { 
		return idade;
	}
	public void setIdade(int valor) {
		if (valor > 0) { 
			this.idade = valor;
		}
	}
}
