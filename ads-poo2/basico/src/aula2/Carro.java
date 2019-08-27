package aula2;

public class Carro {
	float autonomia;
	int maxKmHora;
	String marca;
	String modelo;
	int ano;
	int velocidade;
	
	public void acelerar() { 
		System.out.println(" Acelerando ... ");
		velocidade = velocidade + 10;
	}
	
	public void frear() { 
		System.out.println(" Freando ... ");
		velocidade = velocidade - 10;
	}

}
