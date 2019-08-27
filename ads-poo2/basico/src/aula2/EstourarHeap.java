package aula2;

public class EstourarHeap {
	public static void main(String[] args) {
		Aluno primeiro = new Aluno();
		Aluno proximo = primeiro;
		int instancias = 0;
		while(true) { 
			Aluno temp = new Aluno();
			proximo.outro = temp;
			proximo = temp;
			System.out.println(instancias++);
		}	
	}
}
