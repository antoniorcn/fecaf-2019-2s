package aula4;
import java.util.Scanner;
public class Temperatura2 {
	public static void main(String[] args) {
		System.out.println("Inicio");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite e a temperatura");
		int temp = scan.nextInt();
		if (temp < 9) { 
			System.out.println("Frio");
		} else { 
			System.out.println("Calor");
		}
		scan.close();
		System.out.println("Fim");
	}

}
