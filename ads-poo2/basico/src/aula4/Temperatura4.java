package aula4;
public class Temperatura4 {
	public static void main(String args[]) {
		System.out.println("Inicio");
		int temp = 27;
		if (temp < 9) { 
			System.out.println("Frio");
		} else if (temp < 15) {
			System.out.println("Razo�vel");
		} else if (temp < 25) {
			System.out.println("Agrad�vel");
		} else { 
			System.out.println("Calor");	
		}
		System.out.println("Fim");
	}

}
