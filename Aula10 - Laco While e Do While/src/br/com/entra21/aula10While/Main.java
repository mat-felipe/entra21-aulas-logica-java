package br.com.entra21.aula10While;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("\t-----------------------");
		System.out.println("\t0 - Sair\n\t1 - while\n\t2 - do-while");
		System.out.println("\tEscolha uma das opções.");
		System.out.println("\t-----------------------");

		switch (new Scanner(System.in).next().toLowerCase()) {

		case "0", "sair":
			System.out.println("Escolheu sair");
			break;

		case "1", "while":
			aprenderWhile();
			break;

		case "2", "do-while":
			aprenderDoWhile();
			break;

		default:
			System.out.println("Opção invalida");
			main(null);
			break;
		}

	}

	private static void aprenderWhile() {
		System.out.println("Vamos aprender While aqui");
		byte contagem = 1;

		while (contagem <= 10) {
			System.out.println("Contando " + contagem);
			contagem++;
		}
		System.out.println("Acabei aqui.");

		System.out.println("Deseja iniciar uma repetição");
		Scanner entrada = new Scanner(System.in);
		String resposta = entrada.next();
		while (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("continuar")) {
			System.out.println("Vc respondeu " + resposta);
			System.out.println("Deseja continuar?");
			resposta = entrada.next();

		}
		System.out.println("Terminou meu while com base na sua resposta");
		main(null);
	}

	private static void aprenderDoWhile() {
		System.out.println("Vamos aprender Do While aqui");
		Scanner entrada = new Scanner(System.in);
		String resposta;

		do {
			System.out.println("Existiam 2 dogs Pita e Repita, Pita morreu quem ficou?");
			resposta = entrada.next();
		} while (resposta.equalsIgnoreCase("repita"));

		byte dia;
		do {
			System.out.println("Informe o dia do seu aniversáio");
			dia = entrada.nextByte();
		} while (dia > 31);
		System.out.println("Espero que não tenha errado muito...");

		byte mes;
		do {
			System.out.println("Informe o dia do seu aniversáio");
			dia=entrada.nextByte();
			
			System.out.println("Informe o mes do seu aniversáio");
			mes=entrada.nextByte();
			
		} while (dia < 1 || dia > 31 || mes < 1 || mes > 12);
		System.out.println("Finalmente vc digitou certo "+dia+"/"+mes);

		main(null);
	}

}
