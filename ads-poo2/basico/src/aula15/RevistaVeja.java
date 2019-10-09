package aula15;

import java.util.ArrayList;
import java.util.List;

public class RevistaVeja implements Publicador {
	List<Assinante> assinantes = new ArrayList<>();
	@Override
	public void adicionar(Assinante a) {
		assinantes.add(a);
	}
	@Override
	public void remover(Assinante a) {
		assinantes.remove(a);
	}
	@Override
	public void notificar(String texto) {
		for (Assinante a : assinantes) { 
			a.receberNoticia(texto);
		}
	}
}
