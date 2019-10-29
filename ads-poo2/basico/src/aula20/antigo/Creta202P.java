package aula20.antigo;

public class Creta202P implements Carro, CarroPortas {
	
	private CarroPortas portas = new Carro2Portas();
	public void abrirPortas() {
		portas.abrirPortas();
	}
	public void fecharPortas() {
		portas.fecharPortas();
	}
	
	@Override
	public void ligarMotor() {
		System.out.println("Hyundai - Creta motor 2.0 est� ligado");
	}

	@Override
	public void desligarMotor() {
		System.out.println("Hyundai - Creta motor 2.0 est� desligado");
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
		System.out.println("Combust�vel Flex - consumo de 15km/litro");
	}

	@Override
	public void abrirTampaPortaMalas() {
		System.out.println("Tampa do porta-malas foi aberta com controle remoto");
	}

}
