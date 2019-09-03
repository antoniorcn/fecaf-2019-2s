package aula6;
public class TrianguloInverso {
	public static void main(String[] args) {
		for(int lin = 7; lin > 1; lin--) {
			for(int col=2; col <= 7; col++) {
				if (col > lin) {
					System.out.print("*");
				} else { 
					System.out.print(" ");
				}
				if (col == lin) { 
					System.out.print("/");
				}
			}
			System.out.println();
		}
	}
}
