package aula13;

import java.util.ArrayList;

public class TesteLista {
	public static void main(String[] args) {
		ArrayList<Soldado> lista = new ArrayList<>();
		
		Soldado s1 = new Soldado();
		s1.nome = "Chico";
		
		Soldado s2 = new Soldado();
		s2.nome = "Robson";
		
		Soldado s3 = new Soldado();
		s3.nome = "Vitoria";
		
		Soldado s4 = new Soldado();
		s4.nome = "Chico";
		
		lista.add(s1);
		lista.add(s2);
		lista.add(s3);
		//lista.add(s4);
		lista.add(null);
		lista.add(null);
		lista.add(s2);
		
		Soldado s = lista.get(2);
		System.out.println("Soldado na posicao 2: " + s.nome);
		
		if (lista.contains(s4)) { 
			System.out.println("Soldado S4 está na lista");
		}
		
		for (Soldado so : lista) { 
			if (so != null) {
				System.out.println(so.nome);
			} else { 
				System.out.println("null");
			}
		}
		
		for (Soldado so : lista) { 
			if (so != null) { 
				if ("Robson".equals(so.nome)) { 
					System.out.println("Achei o Robson na lista");
				}
			}
		}
		
	}

}
