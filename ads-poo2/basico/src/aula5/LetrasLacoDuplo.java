package aula5;
public class LetrasLacoDuplo {
	public static void main(String[] args) {
		char letra = 'A';
		for (int x = 0; x < 26; x++) {
			for (int j = 0; j < 5; j++) { 
				System.out.print(letra);
			}
			letra++;
			System.out.println();
		}
	}
}

// AAAAA
// BBBBB
// CCCCC
// DDDDD
// EEEEE
