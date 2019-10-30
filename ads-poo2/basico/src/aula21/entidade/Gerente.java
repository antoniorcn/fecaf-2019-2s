package aula21.entidade;

public class Gerente extends Funcionario {
	@Override
	public void baterPonto() { 
		System.out.println("Batendo ponto em qualquer lugar");
	}

	@Override
	public void almocar() {
		System.out.println("Gerente Almoçando");
	}

}
