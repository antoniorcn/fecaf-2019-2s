package aula12;

public class Empresa {
	
	public RH rh = new RH();
	
	public Funcionario contratarFuncionario() {
		Funcionario f = new Funcionario();
		// ....
		
		return f;		
	}
	
	public static void main(String[] args) {
		Empresa e = new Empresa();
		Funcionario func = e.contratarFuncionario();
		e.rh.adicionarFuncionario(func);
		
	}

}
