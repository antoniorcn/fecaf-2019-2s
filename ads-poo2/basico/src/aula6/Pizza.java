package aula6;

public class Pizza {
	double preco;
	String sabor;
	String tamanho;
	boolean bordaRecheada;
	String[] ingredientes;
	
	public Pizza(String s) {
		tamanho = "Grande";
		sabor = s;
		assar();
	}
	
	public boolean assar() { 
		System.out.println("Assando pizza de " +
	sabor + " tamanho " + tamanho);
		return true;
	}
	
	public void comer() { 
		System.out.println("Comendo a pizza de " + sabor);
	}
}
