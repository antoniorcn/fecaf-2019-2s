package aula8;

public class CartaoDebito extends FormaPagamento {
	@Override
	public void fazPagamento(float valor) { 
		System.out.println(String.format("Pago R$%5.2f em cartão de" + 
				"débito", valor));
	}

}
