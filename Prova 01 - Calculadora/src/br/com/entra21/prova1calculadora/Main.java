package br.com.entra21.prova1calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		calculo();
	}

	private static void calculo() {
		String calculo;
		float n1, n2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Calculadora");
		System.out.println("Escolha qual o tipo de operação");
		System.out.println("Digite 1 para Soma");
		System.out.println("Digite 2 para Subtração");
		System.out.println("Digite 3 para Multiplicação");
		System.out.println("Digite 4 para Divisão");
		System.out.println("Digite 5 para Encerrar");
		calculo = entrada.next();
		System.out.println("Digite o primeiro número");
		n1 = entrada.nextFloat();
		System.out.println("Digite o segundo número");
		n2 = entrada.nextFloat();
		
		switch (calculo) {
		case "1":
			System.out.println("O resultado da some entre " + n1 + " e " + n2 + " é " + (n1+n2) );
			retonarCalculo();
			break;
				
		case "2":
			System.out.println("O resultado da subtração entre " + n1 + " e " + n2 + " é " + (n1-n2) );
			retonarCalculo();
			break;
			
		case "3":
			System.out.println("O resultado da multiplicação entre " + n1 + " e " + n2 + " é " + (n1*n2) );
			retonarCalculo();
			break;
		
		case "4":
			System.out.println("O resultado da divisão entre " + n1 + " e " + n2 + " é " + (n1/n2) );
			retonarCalculo();
			break;
			
		case "5":
			System.out.println("O programa foi finalizado");
			break;
			
		default:
			System.out.println("Opção inválida");
			retonarCalculo();
		
	}
	
	}

	private static void retonarCalculo() {
		Scanner entrada = new Scanner(System.in);
		String retonarNovo;
		
		System.out.println("Deseja fazer um novo cálculo?");
		System.out.println("Digite 1 para sim");
		System.out.println("Digite 2 para não");
		retonarNovo = entrada.nextLine();
		
		switch (retonarNovo) {
		case "1":
			calculo();
			break;
		case "2":
			System.out.println("Programa finalizado");
			break;
		default:
			System.out.println("Resposta inválida");
			break;
		}
	}
}


