package aula5;

public class ContagemRegressivaDoWhile {

	public static void main(String[] args) {
		int contagem = 10;
		// while (contagem > 20) { 
		// 	System.out.println("Executou While-Do");
		// }
		
		do {
		    System.out.println(contagem);
		    contagem = contagem - 1;
		} while(contagem >= 0);
	}
}
