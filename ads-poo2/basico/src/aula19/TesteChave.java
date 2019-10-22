package aula19;

public class TesteChave {

	public static void main(String[] args) {
		SingletonChave g = 
				SingletonChave.getInstancia();
		Chave chave1 = g.getChave();
	}
}
