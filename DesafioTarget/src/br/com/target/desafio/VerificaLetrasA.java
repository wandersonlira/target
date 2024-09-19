package br.com.target.desafio;

import java.util.Scanner;

public class VerificaLetrasA {
	 public static void main(String[] args) {
	        // String pré-definida ou entrada do usuário
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Informe uma string: ");
	        String inputString = scanner.nextLine();
	        
	        // Chamada ao método para contar a letra 'a'
	        int countLetraA = contarLetraA(inputString);
	        
	        // Verificando a presença e exibindo o resultado
	        if (countLetraA > 0) {
	            System.out.println("Letra 'a' aparece um total de " + countLetraA + " vez(es).");
	        } else {
	            System.out.println("Letra 'a' não está presente.");
	        }
	        
	        scanner.close();
	    }

	    // Método para contar a letra 'a'
	    public static int contarLetraA(String str) {
	        int count = 0;
	        for (char caractereA : str.toCharArray()) {
	            if (caractereA == 'a' || caractereA == 'A') {
	                count++;
	            }
	        }
	        return count;
	    }

}
