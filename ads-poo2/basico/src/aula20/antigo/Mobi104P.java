package aula20.antigo;

public class Mobi104P implements Carro, CarroPortas {

	private CarroPortas portas = new Carro4Portas();
	public void abrirPortas() {
		portas.abrirPortas();
	}
	public void fecharPortas() {
		portas.fecharPortas();
	}
		
	@Override
	public void ligarMotor() {
		System.out.println("Fiat - Mobi motor 1.0 está ligado");
	}

	@Override
	public void desligarMotor() {
		System.out.println("Fiat - Mobi motor 1.0 está desligado");
	}

	@Override
	public void ligarFarois() {
		System.out.println("Farol ligado manualmente");
	}

	@Override
	public void desligarFarois() {
		System.out.println("Farol desligado manualmente");
	}

	@Override
	public void dadosComputadorBordo() {
		System.out.println("Sem Computador de Bordo");
	}

	@Override
	public void abrirTampaPortaMalas() {
		System.out.println("Tampa do porta-malas foi aberta com a chave");
	}
}
