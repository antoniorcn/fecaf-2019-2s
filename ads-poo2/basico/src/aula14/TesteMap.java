package aula14;

import java.util.HashMap;
import java.util.Map;
// Ford paga 5%
// Fiat paga 6%
// GM paga 4%

public class TesteMap {
	Carro c1;
	Carro c2;
	Carro c3;
	Carro c4;
	
	public TesteMap() { 
		 c1 = new Carro("Ford", "Ka", 2000, "Preto");
		 c2 = new Carro("Ford", "Ka", 2014, "Preto");
		 c3 = new Carro("Fiat", "Uno", 1995, "Verde");
		 c4 = new Carro("GM", "Corsa", 1995, "Branco");
	}
	
	public double calculaIPVA(Carro c) { 
		Map<String, Double> tabela = new HashMap<>();
		/* if ("Ford".equals(c.fabricante)) { 
			return 5.0/100.0;
		} else if ("Fiat".equals(c.fabricante)) { 
			return 6.0/100.0;
		} else { 
			return 4.0/100.0;
		}*/
		tabela.put("Ford", 5.0/100.0);
		tabela.put("Fiat", 6.0/100.0);
		Double valor = tabela.get(c.fabricante);
		if (valor != null) { 
			return valor; 
		} else { 
			return 4.0/100.0;
		}
	}
	
	public static void main(String[] args) {
		TesteMap t = new TesteMap();
		double ipva = t.calculaIPVA(t.c1);
		
		System.out.println(ipva);
	}

}
