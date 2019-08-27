package aula2;

public class IndustriaDeArCondicionado {
	
	public static void main(String args[]) { 
		ArCondicionado reuniao = new ArCondicionado();
		reuniao.marca = "LG";
		reuniao.modelo = "137";
		reuniao.numeroSerie = 111;
		reuniao.cor = "branca";
		reuniao.tamanho = 1;
		
		ArCondicionado diretoria = new ArCondicionado();		
		diretoria.marca = "LG";
		diretoria.modelo = "237";
		diretoria.numeroSerie = 222;
		diretoria.cor = "branca";
		diretoria.tamanho = 1.5f;
		
		ArCondicionado ti = new ArCondicionado();
		ti.marca = "LG";
		ti.modelo = "337";
		ti.numeroSerie = 333;
		ti.cor = "cinza";
		ti.tamanho = 1.7f;
		
	}

}
