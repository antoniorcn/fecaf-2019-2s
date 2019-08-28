package aula5;
import java.util.Scanner;
public class AbastecerVetor {
	public static void main(String[] args) {
		int [] v = new int[3];
		System.out.println("Guarda notas");
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite uma nota");
			v[i] = scan.nextInt();
		}		
		scan.close();
	}
}
