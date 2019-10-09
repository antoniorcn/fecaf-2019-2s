package aula15;

public class TesteObserver {

	public static void main(String[] args) {
		Aluno joao = new Aluno();
		Aluno maria = new Aluno();
		Aluno alvaro = new Aluno();
		Aposentado jose = new Aposentado();
		
		RevistaVeja veja = new RevistaVeja();
	
		veja.adicionar(joao);
		veja.adicionar(jose);
		
		
		veja.notificar("Palmeiras não tem mundial");
		
		veja.remover(joao);
		
		veja.notificar("Gasolina sobe de novo");
	
	}

}
