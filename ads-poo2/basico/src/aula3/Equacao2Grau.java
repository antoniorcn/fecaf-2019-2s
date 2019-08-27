package aula3;
import java.util.Scanner;
public class Equacao2Grau {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Programa para calcular raizes da Equa��o de 2� grau");
		System.out.println(
				"Digite um valor para o termo A:");
		int a = scan.nextInt();
		System.out.println(
				"Digite um valor para o termo B:");
		int b = scan.nextInt();
		System.out.println(
				"Digite um valor para o termo C:");
		int c = scan.nextInt();
		int delta = b * b - 4 * a * c;
		System.out.println("Delta: " + delta);
		if (a != 0 && delta >= 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("X1: " + x1);
			
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("X2: " + x2);
		} else { 
			System.out.println(
					"N�o h� raizes para estes termos");
		}
		scan.close();
	}
}

// D = (B * B) - 4 * A * C
// X1 = (-B + Math.sqrt(D) ) / (2 * A)
// X2 = (-B - Math.sqrt(D) ) / (2 * A)

