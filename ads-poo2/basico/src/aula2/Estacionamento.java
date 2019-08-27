package aula2;

public class Estacionamento {
	
	public static void main(String args[]) { 
		Carro c1 = new Carro();
		c1.marca = "Volks";
		c1.modelo = "Gol";
		c1.ano = 2008;
		
		Carro c2 = new Carro();
		c2.marca = "Chevrolet";
		c2.modelo = "Celta";
		c2.ano = 2009;
		
		Carro c3 = new Carro();
		c3.marca = "Citroen";
		c3.modelo = "C3";
		c3.ano = 2011;
		
		
		c1.acelerar();
		c1.acelerar();
		c2.frear();
		c3.acelerar();
		
		System.out.println("C1 Velocidade: " + c1.velocidade);
		System.out.println("C2 Velocidade: " + c2.velocidade);
		System.out.println("C3 Velocidade: " + c3.velocidade);
		
	}

}
