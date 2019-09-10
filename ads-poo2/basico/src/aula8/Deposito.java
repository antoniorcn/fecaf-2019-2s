package aula8;

public class Deposito extends FormaPagamento{
	@Override
	public void fazPagamento (float valor) { 
		System.out.println(
			String.format("Esta sendo pago R$ %6.2f em deposito bancario", valor));
	}
}
