package aula6;
public class Soma5A10 {
	public static void main(String[] args) {
		float soma = 0;
		for(int i = 5; i <= 10; i++) { 
			soma = soma + i;   // soma += i;
			String texto = 
				String.format(
					" %d ------- %6.1f ", i, soma);
			// System.out.println(i + " - " + soma);
			System.out.println(texto);
		}
	}
}
