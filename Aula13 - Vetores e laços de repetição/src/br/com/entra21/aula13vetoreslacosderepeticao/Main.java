package br.com.entra21.aula13vetoreslacosderepeticao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		byte option;

		do {
//utilizar o do-while, pois me permite entrar no bloco antes de testar a condição de permanencia
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("0 - Sair");
			System.out.println("1 - Criar vetores para cada tipo primitivo e exibir o tamanho deles no console");
			System.out.println(
					"2 - Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles no console");
			System.out.println("3 - Criar 1 vetor de 5 posições, para que o usuário alimente esses valores");
			System.out.println(
					"4 - Criar um vetor com o tamanho informado pelo usuário e depois solicitar que o usuário informe os respectivos valores");
			System.out.println("5 - Criar um vetor de inteiros inicializado , para percorrer\r\n"
					+ "\tDo inicio ao fim\r\n" + "\tDo fim ao inicio\r\n" + "\tPara exibir os valores");
			System.out.println("6 - Criar um vetor de inteiros não inicializado\r\n"
					+ "\tRepita indefinidamente até que o usuário responda não para a pergunta\r\n"
					+ "\tGostaria de inicializar o valor de uma das posições entre 1 e TAMANHO?\r\n"
					+ "\tCaso responda sim\r\n" + "\tCapturar uma posição\r\n"
					+ "\tRepetir a captura enquanto o índice não for válido\r\n" + "\tCaso responda não\r\n"
					+ "\tSair da repetição de inicializações\r\n" + "\tExibir todos os valores do vetor");

			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Sair");
				break;

			case 1:
				criarVetores();
				break;

			case 2:
				criarVetoresInic();
				break;

			case 3:
				vetor5posicoes();
				break;

			case 4:
				vetorTamanhoInformado();
				break;

			case 5:
				vetorInicioFim();
				break;

			case 6:
				vetorInteiroRep();
				break;

			default:
				break;

			}

		} while (option != 0);// enquanto não for zero, repita

	}

	private static void vetorInteiroRep() {
		byte vetorBytes[] = new byte[10];
		Scanner input = new Scanner(System.in);
		String resposta;
		byte index = 0;

		do {
			System.out.println("Informe um valor para o indice [" + index + "]");
			vetorBytes[index] = input.nextByte();

			System.out.println("Gostaria de inicializar outro indice?");
			resposta = input.next();

			if (resposta.equals("sim")) {
				do {
					System.out.println("Digite o valor para a posição " + index);
					vetorBytes[index] = input.nextByte();

				} while (index < 0 || index >= vetorBytes.length);
			}

		} while (resposta.equals("sim"));
		for (byte count = 0; count < vetorBytes.length; count++) {
			System.out.println("O valor do vetor é " + vetorBytes[count] + " no indice [" + count + "]");

		}

	}

	private static void vetorInicioFim() {
		byte vetorInt[] = { 25, 54, 56, 63, 20, 25, 85, 41 };

		for (byte count = 0; count < vetorInt.length; count++) {
			System.out.println(vetorInt[count]); // apresenta em tela o valor do indice do vetor em ordem crescente
			System.out.println(count);
		}
		System.out.println("-----------------------------");
		for (byte count = (byte) (vetorInt.length - 1); count >= 0; count--) {
			System.out.println(vetorInt[count]);
			System.out.println(count);
		}

	}

	private static void vetorTamanhoInformado() {
		Scanner input = new Scanner(System.in);
		byte tam;
		byte vetorBytes[];

		System.out.println("Informe o tamanho do vetor");
		tam = input.nextByte();

		vetorBytes = new byte[tam];

		for (byte count = 0; count < vetorBytes.length; count++) {
			System.out.println("Informe o valor para o item " + (count + 1) + " no indice " + vetorBytes[count]);
			vetorBytes[count] = input.nextByte();

		}

	}

	private static void vetor5posicoes() {
		int vetor5posicoes[] = new int[5];
		Scanner input = new Scanner(System.in);
		int vetores;

		for (byte i = 0; i < vetor5posicoes.length; i++) {
			System.out.println("Informe o index n " + (i + 1));
			vetores = input.nextByte();
			vetor5posicoes[i] = vetores;
		}
		System.out.println("Os valores para cada posição do vetor é :" + vetor5posicoes[0] + " " + vetor5posicoes[1]
				+ " " + vetor5posicoes[2] + " " + vetor5posicoes[3] + " " + vetor5posicoes[4]);
	}

	private static void criarVetoresInic() { // Criar vetores inicializados para cada tipo primitivo e exibir o tamanho
												// deles no console
		byte vetorBytes[] = { 1, 5, 8, 10 };
		short vetorShorts[] = { 232, 656, 477 };
		int vetorInts[] = { 1232, 2656, 4477 };
		long vetorLongs[] = { 100000, 200000, 300000 };
		float vetorFloats[] = { 10000.5f, 60000.8f, 95482.46f };
		double vetorDoubles[] = { 874568.6957d, 150000.6241d, 8547512.65825d };
		char vetorChars[] = { 'a', 'b', 'c', 'd', 'e' };
		boolean vetorBooleans[] = { true, false, false, true };

		System.out.println("vetorBytes tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts tamanho = " + vetorShorts.length);
		System.out.println("vetorInts tamanho = " + vetorInts.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorDoubles tamanho = " + vetorDoubles.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);

	}

	public static void criarVetores() { // Criar vetores para cada tipo primitivo e exibir o tamanho deles no console
		byte vetorBytes[] = new byte[1];
		short vetorShorts[] = new short[2];
		int vetorInts[] = new int[3];
		long vetorLongs[] = new long[4];
		char vetorChars[] = new char[5];
		float vetorFloats[] = new float[6];
		double vetorDoubles[] = new double[7];
		boolean vetorBooleans[] = new boolean[8];

		System.out.println("vetorBytes tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts tamanho = " + vetorShorts.length);
		System.out.println("vetorInts tamanho = " + vetorInts.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorDoubles tamanho = " + vetorDoubles.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);

	}

}
