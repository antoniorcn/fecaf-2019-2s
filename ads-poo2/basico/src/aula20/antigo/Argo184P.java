package aula20.antigo;

public class Argo184P implements Carro, CarroPortas {
	
	private CarroPortas portas = new Carro4Portas();
	public void abrirPortas() {
		portas.abrirPortas();
	}
	public void fecharPortas() {
		portas.fecharPortas();
	}
	
	@Override
	public void ligarMotor() {
		System.out.println("Fiat - Argo motor 1.8 está ligado");
	}

	@Override
	public void desligarMotor() {
		System.out.println("Fiat - Argo motor 1.8 está desligado");
	}

	@Override
	public void ligarFarois() {
		System.out.println("Farol ligado automaticamente");
	}

	@Override
	public void desligarFarois() {
		System.out.println("Farol desligado automaticamente");
	}

	@Override
	public void dadosComputadorBordo() {
		System.out.println("Combustível Flex - consumo de 10km/litro");
	}

	@Override
	public void abrirTampaPortaMalas() {
		System.out.println("Tampa do porta-malas foi aberta com a chave");
	}
}
