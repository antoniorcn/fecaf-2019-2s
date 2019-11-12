package aula25;

public class Funcionario {
	private long id;
	private String matricula;
	private String nome;
	private String cpf;
	private int tempoServico;

	public int getTempoServico() {
		return tempoServico;
	}
	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
