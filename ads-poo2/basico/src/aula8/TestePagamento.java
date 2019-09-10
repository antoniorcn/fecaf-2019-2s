package aula8;
public class TestePagamento {
	public static void main(String[] args) {
		FormaPagamento f = new CartaoCredito();
		f.fazPagamento(150.0f);
	}
}
