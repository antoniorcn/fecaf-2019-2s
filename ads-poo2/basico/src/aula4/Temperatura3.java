package aula4;
import java.util.Scanner;
public class Temperatura3 {
	int temp;
	public void pedeTemperatura() { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite e a temperatura");
		temp = scan.nextInt();
		scan.close();
	}
	
	public void testaTemperatura() { 
		if (temp < 9) { 
			System.out.println("Frio");
		} else { 
			System.out.println("Calor");
		}
	}
	public static void main(String[] args) {
		System.out.println("Inicio");
		Temperatura3 t = new Temperatura3();
		t.pedeTemperatura();
		t.testaTemperatura();
		System.out.println("Fim");
	}
}
