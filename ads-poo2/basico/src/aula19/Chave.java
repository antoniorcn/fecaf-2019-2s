package aula19;

import java.util.UUID;

public class Chave {
	public String getChave() { 
		String texto = UUID.randomUUID().toString();
		return texto;
	}
}
