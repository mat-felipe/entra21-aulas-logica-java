package br.com.entra21.aula08exercicio;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Aprendendo sobre laços de repetição - for");
		
		String opcao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Sobre o for escolha uma opção para aprender mais");
		System.out.println("1 - for simples");
		System.out.println("2 - for dentro de for");
		System.out.println("3 - Solicite ao usuário uma quantidade limite e exiba em tela a repetição de 1 até o limite");
		System.out.println("4 - Solicite ao usuário uma quantidade inicial e final, para exibir em tela a repetição do inicio até o final");
		System.out.println("5 - Solicite ao usuário um valor numero para exibir a contagem regressiva até o zero");
		System.out.println("6 - Retorne a tabuada do numero escolhido");
		System.out.println("7 - Retornar todas as tabuadas de 1 até a tabuada do numero informado pelo usuário");
				
		opcao = entrada.nextLine();
		
		switch(opcao.toLowerCase()) {
		
		case "1","for simples":
			//funcao aula for simples
			aulaForSimples(); //funcao do tipo procedimento nao tem argumento nem retorno
			break;
		
		case "2":
			//olha veio por numero
			
		case "for dentro do for":
			//funcao aula complexa
			aulaForDentroDeFor();//funcao do tipo procedimento nao tem argumento nem retorno
			break;
			
		case "3":
			exercicioForLimite();
			break;
		
		case "4":
			exercicioForRegressiva();
			break;
			
		case "5":
			exercicioForTabuada();
			break;
			
		case "6":
			exercicioForExibirTabuada();
			break;
		}

	}
	
	private static void exercicioForExibirTabuada() {
		System.out.println("Digite o valor da tabuada");
		Byte tabuada;
		Scanner entrada1 = new Scanner(System.in);
		tabuada = entrada1.nextByte();
				
		for (int i = 1; i <= 10;i ++) {
			System.out.println("A tabuada do " + tabuada + " é " +i+ " x " +tabuada+ " = " +i*tabuada);
			System.out.println("............");
		}
		
	}

	private static void exercicioForTabuada() {
		System.out.println("Digite o valor da tabuada");
		Byte tabuada;
		Scanner entrada1 = new Scanner(System.in);
		tabuada = entrada1.nextByte();
				
		for (int i = 1; i <= 10;i ++) {
			System.out.println("A tabuada do " + tabuada + " é " +i+ " x " +tabuada+ " = " +i*tabuada);
			System.out.println("............");
		}
		
	}

	private static void exercicioForRegressiva() {
		System.out.println("Digite o valor para regredir");
		Byte limite;
		Scanner entrada1 = new Scanner(System.in);
		limite = entrada1.nextByte();
				
		for (int i = limite; i >= 1;i --) {
			System.out.println("Repetindo " + i + " vez");
			System.out.println("............");
		}
	}

	private static void exercicioForLimite() {
		System.out.println("Digite o limite do contador");
		Byte limite;
		Scanner entrada1 = new Scanner(System.in);
		limite = entrada1.nextByte();
				
		for (int i = 1; i <= limite;i ++) {
			System.out.println("Repetindo " + i + " vez");
			System.out.println("............");
		}
	}

	private static void aulaForDentroDeFor() {
				System.out.println("Aprendendo sobre FOR da maneira mais complexa");
				
				byte nivelMaior=2,nivelDetalhe=3;
				
				for (int i=1; i<=nivelMaior;i++) {
					System.out.println("Para o nivel maior repetindo pela "+i+" vez");
					
					for (int y=1;y<=nivelDetalhe;y++){
						
						System.out.println("\tPara o nivel de detalhe repetindo pela " +y+ " vez");
					}
				}
		
	}

	public static void aulaForSimples() {
				
				System.out.println("Aprendendo sobre FOR da maneira mais simples");
				// Contador 1 incremento
				for (int i = 1; i < 10; i++) {
					System.out.println("Repetindo " + i);
					System.out.println("************");
				}

				// Contador 2 incremento
				for (int i = 1; i < 10; i = i + 2) {
					System.out.println("Repetindo " + i);
					System.out.println("............");
				}

				// Contador 3 incremento
				for (int i = 4; i < 10; i = i + 2) {
					System.out.println("Repetindo " + i);
					System.out.println("------------");
				}

				// Contador 3 incremento
				for (int i = 10; i >= 1; i = i - 1) {
					System.out.println("Repetindo " + i);
					System.out.println("------------");
				}

				// Contador tabuada do 3
				int numero = 3;
				int contador;

				for (contador = 1; contador <= 10; contador++) {
					System.out.println("Tabuada " + contador + " x " +numero+ " = " + (contador * numero));
					System.out.println("------------");
				}
				

				// Contador tabuada do 9
				int numero9 = 9;
				int contador9;

				for (contador9 = 1; contador9 <= 10; contador9++) {
					System.out.println("Tabuada " + contador9 + " x " +numero9+ " = " + (contador9 * numero9));
					System.out.println("------------");
				}
				
				System.out.println("Olha como o contador ficou: " + contador + contador9);
	 }
	}


