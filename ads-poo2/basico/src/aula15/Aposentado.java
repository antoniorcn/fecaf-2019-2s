package aula15;

public class Aposentado implements Assinante {

	@Override
	public void receberNoticia(String noticia) {
		System.out.println(
		"Aposentado lendo noticia (" + noticia + ") no parque"
		);
	}
}
