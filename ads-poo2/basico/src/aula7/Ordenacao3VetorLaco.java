package aula7;
import java.util.Scanner;
public class Ordenacao3VetorLaco {
	public static void main(String[] args) {
		int[] v = new int[3];
		System.out.println("Ordena��o de 3 n�meros");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println(String.format("Digite o %d� numero : ", i + 1));
			v[i] = scan.nextInt();
		}
		
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
