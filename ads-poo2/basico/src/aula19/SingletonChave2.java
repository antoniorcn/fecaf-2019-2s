package aula19;

public class SingletonChave2 {
	private static Chave c = new Chave();
	public static Chave getChave() { 
		return c;
	}
}
