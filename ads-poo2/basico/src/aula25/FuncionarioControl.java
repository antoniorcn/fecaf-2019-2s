package aula25;

public class FuncionarioControl {
	private FuncionarioDAO funcionarioDAO = 
				new FuncionarioDAOImpl();
	
	public void adicionar(Funcionario f) { 
		funcionarioDAO.adicionar(f);
	}

}
