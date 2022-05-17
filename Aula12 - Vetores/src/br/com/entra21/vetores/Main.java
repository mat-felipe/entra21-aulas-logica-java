package br.com.entra21.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Aprendendo sobre Vetores
		Scanner inPut = new Scanner(System.in);
		byte option;

		do {
			System.out.println("0- Exit");
			System.out.println("01- Declarando Vetores");
			System.out.println("02- Acessando Índices");
			System.out.println("03- Atribuindo Valores e Índices");
			System.out.println("04- Médias com Valores");
			option = inPut.nextByte();

			switch (option) {

			case 0:
				// meu case vazio só para não cair no default porque o zero atende a condição no
				// menu
				break;

			case 1:
				// chamada de função
				declararVetores(); // dentro desses paranteses estariam meus argumentos
				break;

			case 2:
				// chama o caso 2 02- Acessando Índices
				acessarIndices();
				break;

			case 3:
				// Atualizar valores
				atualizarValores();
				break;

			case 4:
				// Media com valores
				mediaValores();
				break;
			}

		} while (option != 0); // Condição atendida enquanto o user não digitar 0

	}

	private static void mediaValores() {
		Scanner entrada = new Scanner(System.in);
		float notas[] = new float[4];

		for (byte i = 0; i < notas.length; i++) {
			// System.out.println("Contagem em "+i);
			System.out.println("Informe e " + (i + 1) + "ª nota:");
			notas[i] = entrada.nextFloat();
		}
		System.out.println("A segunda nota foi " + notas[1]);
		float soma = 0;
		for (byte i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
			soma = soma + notas[i];
		}
		System.out.println("Soma = "+soma);
		System.out.println("Média ="+soma/notas.length);
	}

	public static void declararVetores() { // aqui dentro do parênteses estão os parametros
		System.out.println("Aprendendo sobre Vetores");

		byte idades[]; // Primeiro, criar a variável que é um vetor de algum tipo

		idades = new byte[15]; // Segundo, definir o tamanho

		System.out.println("O tamanho é " + idades.length); // Depois, usar ou atualizar

		// como acessar cada posição e ver oq tem nela
		float notas[] = { 1, 3.5f, 8 }; // Criei a variável e 2 defini o tamanho e os valores

	}

	public static void acessarIndices() {
		System.out.println("Aprendendo sobre Vetores");

		byte idades[]; // Primeiro, criar a variável que é um vetor de algum tipo

		idades = new byte[15]; // Segundo, definir o tamanho

		System.out.println("O tamanho é " + idades.length); // Depois, usar ou atualizar
		System.out.println("O que tem no indice [1] " + idades[1]);
		System.out.println("O que tem no ultimo indice " + idades[2]);

	}

	public static void atualizarValores() {
		float notas[] = { 1, 3.5f, 8 }; // Criei a variável e 2 defini o tamanho e os valores
		notas[0] = 33; // manda uma nota para o índice "0"
		notas[2] = 12; // manda uma nota para o índice "2"

	}
}