package aula8;

import java.util.Scanner;

public class Caixa {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Caixa de pagamento");
		System.out.println("Digite o valor a ser pago:");
		float valor = scan.nextFloat();
		scan.nextLine();
		System.out.println("Digite o tipo do pagamento"
			+ " (D)inheiro  (C)heque  c(R)edito  d(E)bito  de(P)osito:");
		char escolha = scan.nextLine().toUpperCase().charAt(0);
		FormaPagamento p = new FormaPagamento();
		if (escolha == 'D') { 
			p = new Dinheiro();
		} else if (escolha == 'C') {
			p = new Cheque();
		} else if (escolha == 'R') { 
			p = new CartaoCredito();
		} else if (escolha == 'E') { 
			p = new CartaoDebito();
		} else if (escolha == 'P') { 
			p = new Deposito();
		} else {
			System.out.println("Opção inválida");
		}
		p.fazPagamento(valor);
		scan.close();
		
	}
}
