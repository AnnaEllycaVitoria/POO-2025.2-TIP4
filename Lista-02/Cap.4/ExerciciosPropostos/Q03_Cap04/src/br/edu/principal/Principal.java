package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int numero2 = scanner.nextInt();

	        int menor = (numero1 < numero2) ? numero1 : numero2;

	        System.out.println("O menor número é: " + menor);

	}

}
