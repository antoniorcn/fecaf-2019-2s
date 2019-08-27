package aula5;

public class Ordenacao3 {
	public String formato = "%d, %d, %d";
	
	public void trocarFormato(String novoFormato) { 
		formato = novoFormato;
	}
	
	public void ordenaNumeros(int n1, int n2, int n3) {
		String texto = "";
		if (n1 <= n2 && n2 <= n3) { 
			texto = String.format(formato, n1, n2, n3);
		} else if (n1 <= n3 && n3 <= n2) {
			texto = String.format(formato, n1, n3, n2);
		} else if (n2 <= n1 && n1 <= n3) { 
			texto = String.format(formato, n2, n1, n3);
		} else if (n2 <= n3 && n3 <= n1) { 
			texto = String.format(formato, n2, n3, n1);
		} else if (n3 <= n1 && n1 <= n2) { 
			texto = String.format(formato, n3, n1, n2);
		} else { 
			texto = String.format(formato, n3, n2, n1);
		}
		System.out.println( texto );
	}
	
	public static void main(String[] args) {
		Ordenacao3 orde = new Ordenacao3();
		orde.trocarFormato("(%d - %d - %d)");
		orde.ordenaNumeros(25,  7,  25);
	}

}
