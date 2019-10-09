package aula14;

public class Pessoa implements Comparable<Pessoa>{
	String nome;
	int idade;
	boolean sexo;
	int beleza;
	
	public Pessoa(String n, int i, 
			boolean s, int b) { 
		nome = n;
		idade = i;
		sexo = s;
		beleza = b;
	}

	@Override
	public int compareTo(Pessoa p) {
		if (p.sexo == false) { 
			if (this.beleza > p.beleza) {
				return -1;
			} else { 
				return 1;
			}
		} else { 
			return -1;
		}
	}
}
