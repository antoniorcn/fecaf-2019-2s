package aula6;

import java.util.Scanner;

public class TesteMenu {

	public static void main(String[] args) {
		System.out.println("Cadastro de Clientes");
		System.out.println("Menu");
		System.out.println("(A)dicionar clientes");
		System.out.println("(P)esquisar clientes");
		System.out.println("Escolha sua opção: ");
		Scanner scan = new Scanner(System.in);
		char opcao = scan.nextLine().charAt(0);
		scan.close();
		
		if (opcao == 'A') { 
			System.out.println("Adicionar selecionado");
		}
		
		if (opcao == 'P'){ 
			System.out.println("Pesquisar selecionado");
		} else { 
			System.out.println("Opção inválida");
		}
		
		/* if (opcao == 'A') { 
			System.out.println("Adicionar selecionado");
		} else if (opcao == 'P'){ 
			System.out.println("Pesquisar selecionado");
		} else { 
			System.out.println("Opção inválida");
		}
		*/
		
		
		/*
		switch(opcao) { 
			case 'P': { 
				System.out.println("Pesquisar selecionado");
				break;
			}
			case 'A': {
				System.out.println("Adicionar selecionado");
				break;
			}
			default: {
					System.out.println("Opção inválida");
			}
		}
		*/
		
	}

}
