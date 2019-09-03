package aula6;

public class TesteSoma {

	public int soma(int n1, int n2) { 
		int s = n1 + n2;
		return s;
	}
	
	public static void main(String[] args) {
		TesteSoma ts = new TesteSoma();
		int soma = ts.soma(20, 30);
		
		System.out.println(soma);
		System.out.println("A soma é " + ts.soma(60, 40));
	}

}
