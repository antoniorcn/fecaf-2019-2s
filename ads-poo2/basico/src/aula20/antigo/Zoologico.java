package aula20.antigo;

public class Zoologico {
	
	public static void main(String[] args) {
		
		Animal c = new Cachorro();
		c.emitirSom();
		
		Animal g = new Gato();
		g.emitirSom();
		
		Animal caoDeCaca = c;
		c.emitirSom();
	}

}
