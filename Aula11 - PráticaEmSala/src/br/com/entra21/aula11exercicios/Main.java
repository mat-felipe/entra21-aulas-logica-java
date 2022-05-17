package br.com.entra21.aula11exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		byte option;

		do {
			System.out.println("_______________________");
			System.out.println("Escolha uma das opções!");
			System.out.println("0 - Sair");
			System.out.println("1 - Calculando a soma");
			System.out.println("2 - Repetir 20x");
			System.out.println("3 - Escreva 20x e some a idade");
			System.out.println("4 - Escreva 20x maiores de idade");
			System.out.println("5 - Nome e idade 10x quantos são menores de idade");
			System.out.println(
					"6 - Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares");
			System.out.println("7 - ");
			System.out.println("8 - Escreva um algoritmo que leia uma sequência de números...");
			System.out.println("9 - Solicite a quantidade de notas e calcule a média do aluno");

			option = input.nextByte();
			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				calculoSoma();
				break;

			case 2:
				repeat20x();
				break;

			case 3:
				age20xsoma();
				break;

			case 4:
				age20x();
				break;

			case 5:
				nomeIdadeMenor();
				break;

			case 8:
				sequenciaNumeros();
				break;

			case 9:
				mediaAlunos();
				break;

			default:
				System.out.println("Escolha uma opção válida!");
				break;
			}

		} while (option != 0);
		System.out.println("Obrigado por usar o programa Lista de Exercicios");
	}

	private static void sequenciaNumeros() {
		Scanner input = new Scanner(System.in);
		int number, sum = 0;

		do {
			System.out.println("Qual o número vc quer?");
			number = input.nextInt();
			if (number > 0) {//somente números positivos serão somados
				sum = sum + number;
			}
		} while (number >= 0); // enquanto o numero for maior que zero repita
		System.out.println("Sua soma é " + sum);

	}

	private static void mediaAlunos() {
		Scanner input = new Scanner(System.in);
		byte qtd, contador = 0;
		float nota, soma = 0f;
		System.out.println("Quantas notas vc quer capturar?");
		qtd = input.nextByte();
		String resposta;

		do {
			contador++;
			System.out.println("Informe uma nota");
			nota = input.nextFloat();
			if (contador >= qtd) {
				System.out.println("Quer capturar mais alguma nota?");
				resposta = input.next();
				if (resposta.equals("sim")) {
					contador--;
				}
			}

			soma = soma + nota;
		} while (contador <= qtd);
		System.out.println("Soma =" + soma);
	}

	private static void nomeIdadeMenor() {
		Scanner input = new Scanner(System.in);
		String nome, nomeNovo = "";
		byte idade, idadeNovo = 0;

		for (byte i = 1; i <= 10; i++) {
			System.out.println("Digite o nome da pessoa " + i);
			nome = input.next();
			System.out.println(nome + " digite sua idade");
			idade = input.nextByte();
			if (i == 1) {
				idadeNovo = idade;
				nomeNovo = nome;
			} else {
				System.out.println("Estou no laço " + i + " e preciso verificar");
				if (idade < idadeNovo) {
					System.out.println(
							"Ainda bem que testei porque a pessoa mais nova é " + nome + " com " + idade + " anos");
					idadeNovo = idade;
					nomeNovo = nome;
				}
			}
		}
		System.out.println(nomeNovo + " vc é o mais novo e tem " + idadeNovo + " anos de idade");
	}

	private static void age20xsoma() {
		System.out.println("Capture a idade de 20 pessoas e some as idades");
		Scanner input = new Scanner(System.in);
		int somaidade = 0;
		byte idade;
		for (int i = 1; i <= 5; i++) {
			System.out.println("No momento a soma é " + somaidade);
			System.out.println("Informe a idade da pessoa " + i);
			idade = input.nextByte();
			somaidade = idade + somaidade;
		}
		System.out.println("A soma total das idade é " + somaidade);

	}

	private static void age20x() {
		System.out.println("Exibir apenas os maiores de idade");
		byte maiores = 0;
		byte idade, i;
		for (i = 1; i <= 20; i++) {
			System.out.println("Informe a idade da pessoa " + i);
			Scanner input = new Scanner(System.in);
			idade = input.nextByte();
			if (idade >= 18) {
				maiores++;
				System.out.println("A ultima pessoa informada é maior de idade");
			}
		}
		System.out.println("Entre " + (i - 1) + " pessoas, apenas " + maiores + " são maiores de idade");

	}

	private static void repeat20x() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("Eu gosto de algoritmo ");

			if (i % 5 == 0) {
				System.out.println("\n");
			}
		}

	}

	private static void calculoSoma() {
		System.out.println("Calculando soma de 1 até 15!");

		int soma = 0;
		for (int i = 1; i <= 15; i++) {
			soma = soma + i;
			System.out.println("Soma = soma + i,  " + soma + " = " + soma + " + " + i + " ==> " + (soma + i));
		}
	}
}
