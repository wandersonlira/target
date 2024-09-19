package br.com.target.desafio;

import java.util.Scanner;

public class SequenceFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar um número ao usuário
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        // Verificar se o número pertence à sequência de Fibonacci
        boolean isFibonacci = isFibonacci(numero);

        // Exibir o resultado
        if (isFibonacci) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " NÂO pertence à sequência de Fibonacci.");
        }

        scanner.close();

    }
    

	// Método para verificar se um número pertence à sequência de Fibonacci
	public static boolean isFibonacci(int num) {
	    int numeroA = 0, numeroB = 1;
	
	    // Gerar números de Fibonacci até que seja maior ou igual ao número informado
	    while (numeroA < num) {
	        int temporario = numeroA;
	        numeroA = numeroB;
	        numeroB = temporario + numeroB;
	    }
	
	    // Verificar se o número é igual a um dos números gerados
	    return numeroA == num;
	}

}
