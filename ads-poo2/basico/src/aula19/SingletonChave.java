package aula19;

public class SingletonChave {
	
	private static SingletonChave geradora;
	
	private SingletonChave() { 
		c = new Chave();
	}
	
	private Chave c;
	public Chave getChave() { 
		return c;
	}
	
	public static SingletonChave getInstancia() {
		if (geradora == null) {
			geradora = new SingletonChave();
		}
		return geradora;
	}
}
