package aula15;

public class Aluno implements Assinante {
	@Override
	public void receberNoticia(String noticia) {
		System.out.println("Aluno le noticia ( "+ noticia +") no onibus com pressa");
	}

}
