package aula8;

public class Cheque extends FormaPagamento {
	@Override
	public void fazPagamento (float valor) { 
		System.out.println(
			String.format("Pago R$%5.2f em cheque", valor));
	}
}
