package aula20.antigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ExemploComLista {
	
	public static void imprimeLista(List<String> lista) { 
		for (String s : lista) { 
		 	System.out.println(s);
		}
		// for (int i = 0; i < lista.size(); i++) { 
		// 	String s = lista.get(i);
		// 	System.out.println(s);
		// }
	}
	
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Palavra1");
		l.add("Palavra2");
		l.add("Palavra3");
		imprimeLista(l);
	}

}
