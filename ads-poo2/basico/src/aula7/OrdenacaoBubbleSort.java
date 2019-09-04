package aula7;

import java.util.Scanner;

public class OrdenacaoBubbleSort {
	public static void main(String[] args) {
		int[] v = new int[6];
		System.out.println("Ordenação de 6 números");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println(String.format("Digite o %dº numero : ", i + 1));
			v[i] = scan.nextInt();
		}
		scan.close();
		// Ordena os numeros do vetor
		for (int x = 0; x < 6; x++) {
			for (int i = 0; i < 6 - 1; i++) { 
				if (v[i] >= v[i + 1]) { 
					int temp = v[i + 1];
					v[i + 1] = v[i];
					v[i] = temp;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(v[i]);
		}
	}

}
