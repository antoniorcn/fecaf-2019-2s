package aula3;
import java.util.Scanner;
public class ParaHexa {
	public static void main(String[] args) {
		System.out.println(
				"Programa para transformar Decimal para Hexadecimal");
		System.out.println("Digite um numero inteiro: ");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		String hex = Integer.toHexString(numero);
		System.out.println("Hexadecimal: " + hex);
		scan.close();
	}
}
