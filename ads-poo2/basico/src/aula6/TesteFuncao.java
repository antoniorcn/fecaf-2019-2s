package aula6;

import java.util.Scanner;

public class TesteFuncao {
	
	public static int calcularQuadrado(int numero) { 
		int q = numero * numero;
		int a = 10;
		System.out.println(q);
		return q;
	}

	public static void main(String[] args) {
		// int a = 10;
		// int s = calcularQuadrado(a);
		// int s = calcularQuadrado(10);
		System.out.println("Calcula o Quadrado");
		System.out.println("Digite um numero: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = calcularQuadrado(n);
		System.out.println(r);
		
		// System.out.println(
		//		calcularQuadrado(
		//				scan.nextInt()));
		scan.close();
	}
}
