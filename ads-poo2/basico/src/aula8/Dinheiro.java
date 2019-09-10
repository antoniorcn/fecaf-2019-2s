package aula8;

public class Dinheiro extends FormaPagamento {
	
	public void fazPagamento (float valor) { 
		System.out.println(
			String.format("Esta sendo pago R$ %6.2f em dinheiro", valor));
	}

}
