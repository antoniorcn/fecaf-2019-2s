package aula21.entidade;

public class Aplicacao {
	public static void main(String[] args) {
		Caixa c1 = new Caixa();
		Caixa c2 = new Caixa();
		Gerente g = new Gerente();
		Seguranca s = new Seguranca();
		Patinador p = new Patinador();
		c1.baterPonto();
		c2.baterPonto();
		s.baterPonto();
		p.baterPonto();
		p.almocar();
		g.baterPonto();
	}
}
