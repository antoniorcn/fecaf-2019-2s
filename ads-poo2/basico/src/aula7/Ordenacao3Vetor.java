package aula7;

import java.util.Scanner;

public class Ordenacao3Vetor {
	public static void main(String[] args) {
		int[] v = new int[3];
		System.out.println("Ordenação de 3 números");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		v[0] = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		v[1] = scan.nextInt();
		System.out.println("Digite o terceiro numero: ");
		v[2] = scan.nextInt();
		scan.close();
		String texto = "";
		if (v[0] >= v[1] && v[1] >= v[2]) {
			texto = String.format("%d, %d, %d", v[2], v[1], v[0], args);
		} else if (v[0] >= v[2] && v[2] >= v[1]) {
			texto = String.format("%d, %d, %d", v[1], v[2], v[0], args);
		} else if (v[1] >= v[0] && v[0] >= v[2]) {
			texto = String.format("%d, %d, %d", v[2], v[0], v[1], args);
		} else if (v[1] >= v[2] && v[2] >= v[0]) {
			texto = String.format("%d, %d, %d", v[0], v[2], v[1], args);
		} else if (v[2] >= v[1] && v[1] >= v[0]) {
			texto = String.format("%d, %d, %d", v[0], v[1], v[2], args);
		} else {
			texto = String.format("%d, %d, %d", v[1], v[0], v[2], args);
		}
	
		System.out.println(texto);		
	}
}
