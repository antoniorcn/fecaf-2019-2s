package aula1;
public class Teste {
	public static void main(String[] args) {
		double acumulado = 0.0;
		int count = 0;
		double valorMensal = 74.33;
		System.out.println(
				String.format("Saldo inicial %6.2f", acumulado));
		while( count < 6 ) { 
			acumulado += valorMensal;
			String texto =
					String.format("M�s: %d   Saldo: %6.2f", ++count, acumulado);
			System.out.println(texto);	
		}
	}
}
