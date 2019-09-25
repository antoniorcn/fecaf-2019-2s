package aula13;

import java.util.HashSet;

public class TesteDeSet {
	public static void main(String[] args) {
		
		Soldado s1 = new Soldado();
		s1.nome = "Chico";
		
		Soldado s2 = new Soldado();
		s2.nome = "Robson";
		
		Soldado s3 = new Soldado();
		s3.nome = "Vitoria";
		
		Soldado s4 = new Soldado();
		s4.nome = "Chico";
		
		HashSet<Soldado> conjunto = new HashSet<>();
		conjunto.add(s1);
		conjunto.add(s2);
		conjunto.add(s3);
		conjunto.add(s3);
		conjunto.add(s3);
		conjunto.add(s4);
		conjunto.add(null);
		conjunto.add(null);
		conjunto.add(null);
		
		for (Soldado so : conjunto) { 
			if (so != null) {
				System.out.println(so.nome);
			} else { 
				System.out.println("null");
			}
		}
		
		
	}
}
