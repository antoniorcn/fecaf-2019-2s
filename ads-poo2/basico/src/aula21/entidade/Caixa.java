package aula21.entidade;

public class Caixa extends Funcionario {
	@Override
	public void almocar() {
		System.out.println("Caixa, trocando de lugar com outro operador pois estou em horario de almoço");
	}
}
