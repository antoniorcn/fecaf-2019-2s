package aula12;

public class PistaDeCorrida {
	// Carro
	// Cachorro
	// Cavalo
	// Homem
	// Tartaruga
	
	public void iniciarCorrida(Corredor c1, 
			Corredor c2, Corredor c3) {
		
		c1.correr();
		c2.correr();
		c3.correr();
	}
	
	public static void main(String[] args) {
		PistaDeCorrida pista = new PistaDeCorrida();
		
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		Carro c3 = new Carro();
		
		Tartaruga t1 = new Tartaruga();
		Tartaruga t2 = new Tartaruga();
		Tartaruga t3 = new Tartaruga();
		
		pista.iniciarCorrida(c1, t2, c2);
	}
}
