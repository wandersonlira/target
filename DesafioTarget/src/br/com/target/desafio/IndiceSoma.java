package br.com.target.desafio;

public class IndiceSoma {
	public static void main(String[] args) {
		
		int indice = 12, soma = 0, k = 1;
		while (k < indice) {
			k++;
			soma += k;
		}
		System.out.println("Soma: " + soma);		
	}

}
