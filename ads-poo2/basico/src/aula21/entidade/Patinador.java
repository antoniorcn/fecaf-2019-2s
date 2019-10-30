package aula21.entidade;

public class Patinador extends Funcionario {
	
	@Override
	public void baterPonto() {
		System.out.println("Bate o ponto na entrada da Loja");
	}

	@Override
	public void almocar() {
		System.out.println("Patinador Almoçando");
	}

}
