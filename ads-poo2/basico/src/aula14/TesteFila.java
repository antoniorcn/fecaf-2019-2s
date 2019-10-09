package aula14;

import java.util.PriorityQueue;
import java.util.Queue;

public class TesteFila {
	public static void main(String[] args) {
		Queue<Pessoa> fila = 
				new PriorityQueue<>();
		Pessoa p1 = new Pessoa(
		"João", 18, true, 0);
		Pessoa p2 = new Pessoa(
		"Maria", 19, false, 3);
		Pessoa p3 = new Pessoa(
		"Chicó", 47, true, 5);
		Pessoa p4 = new Pessoa(
		"Ana", 22, false, 4);	
		fila.add(p1);
		fila.add(p2);
		fila.add(p3);
		fila.add(p4);
		
		System.out.println(
				"Tamanho da fila: " + 
						fila.size());
		Pessoa p = fila.poll();
		System.out.println("Proximo: " + p.nome);
		System.out.println(
				"Tamanho da fila: " + 
						fila.size());
		p = fila.poll();
		System.out.println("Proximo: " + p.nome);
		System.out.println(
				"Tamanho da fila: " + 
						fila.size());

	}

}
