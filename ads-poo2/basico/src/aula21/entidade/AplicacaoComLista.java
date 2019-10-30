package aula21.entidade;

import java.util.ArrayList;
import java.util.List;

public class AplicacaoComLista {
	public static void main(String[] args) {
		List<Funcionario> lista = new ArrayList<>();
//		Caixa c1 = new Caixa();
//		lista.add(c1);
		for (int i = 0; i < 10; i++) {
			lista.add(new Caixa());
		}
		lista.add(new Gerente());
		lista.add(new Patinador());
		lista.add(new Seguranca());
		for (Funcionario f : lista) { 
			f.baterPonto();
		}
		for (Funcionario f : lista) { 
			f.almocar();
		}		
	}
}
