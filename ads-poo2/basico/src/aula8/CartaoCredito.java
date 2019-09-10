package aula8;

public class CartaoCredito extends FormaPagamento{

	@Override
	public void fazPagamento(float valor) {
		super.fazPagamento(valor);
		System.out.println("com cartão de credito");
	}

}
