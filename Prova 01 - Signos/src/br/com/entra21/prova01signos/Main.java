package br.com.entra21.prova01signos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mes;
		int dia;
		System.out.println("Descubra o seu signo");
		funcaoNome();
		mes = funcaoMes();
		dia = funcaoDia(mes);
		funcaoVerificarSigno(dia, mes);

	}

	private static void funcaoNome() {
		String nome;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual é o seu primeiro nome?");
		nome = entrada.nextLine();
		nome = nome.toLowerCase();
		System.out.println("Seu nome é: "+nome);
	}

	private static int funcaoMes() {
		int mes;
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Escolha uma opção para o mês referente ao seu aniversário");
		System.out.println("1 - Janeiro");
		System.out.println("2 - Fevereiro");
		System.out.println("3 - Março");
		System.out.println("4 - Abril");
		System.out.println("5 - Maio");
		System.out.println("6 - Junho");
		System.out.println("7 - Julho");
		System.out.println("8 - Agosto");
		System.out.println("9 - Setembro");
		System.out.println("10 - Outubro");
		System.out.println("11 - Novembro");
		System.out.println("12 - Dezembro");
		mes = entrada3.nextByte();
		
		switch (mes) {
		case 1: {
			mes = 1;
			System.out.println("Você selecionou Janeiro");
		}
			break;
			
		case 2: {
			mes = 2;
			System.out.println("Você selecionou Fevereiro");
		}
			break;	
			
		case 3: {
			mes = 3;
			System.out.println("Você selecionou Março");
		}
			break;
			
		case 4: {
			mes = 4;
			System.out.println("Você selecionou Abril");
		}
			break;
			
		case 5: {
			mes = 5;
			System.out.println("Você selecionou Maio");
		}
			break;
			
		case 6: {
			mes = 6;
			System.out.println("Você selecionou Junho");
		}
			break;
			
		case 7: {
			mes = 7;
			System.out.println("Você selecionou Julho");
		}
			break;
			
		case 8: {
			mes = 8;
			System.out.println("Você selecionou Agosto");
		}
			break;
			
		case 9: {
			mes = 9;
			System.out.println("Você selecionou Setembro");
		}
			break;
			
		case 10: {
			mes = 10;
			System.out.println("Você selecionou Outubro");
		}
			break;
			
		case 11: {
			mes = 11;
			System.out.println("Você selecionou Novembro");
		}
			break;
			
		case 12: {
			mes = 12;
			System.out.println("Você selecionou Dezembro");
		}
			break;
			
			default:
				System.out.println("Mês inválido");
			funcaoMes();
		
		}
		return(mes);
		
	}
	
	private static int funcaoDia(int mes) {
		int dia;
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Informe o dia do seu nascimento");
		dia = entrada2.nextByte();
		
		if((dia>=1) && (dia <=31)) {
			if(mes == 2 && dia > 28) {
				System.out.println("Dia inválido " + mes + " tem 28 dias, insira um dia correto.");
				funcaoDia(mes);
			}else if (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && dia > 30) {
				System.out.println("Dia inválido " + mes + " tem 30 dias, insira um dia correto.");
				funcaoDia(mes);
			}
		}else {
			System.out.println("Dia inválido");
			funcaoDia(mes);
		}
		return (dia);
	}

	private static void funcaoVerificarSigno(int dia, int mes) {

		if ((mes == 1 && (dia >= 21 && dia <= 31)) || (mes == 2 && dia <= 18)) {
			System.out.println("Seu signo é AQUÁRIO");
		}else if ((mes == 2 && (dia >= 19 && dia <= 29)) || (mes == 3 && dia <= 20)) {
			System.out.println("Seu signo é PEIXES");
		}else if ((mes == 3 && (dia >= 21 && dia <= 31)) || (mes == 4 && dia <= 20)) {
			System.out.println("Seu signo é ÁRIES");
		}else if ((mes == 4 && (dia >= 21 && dia <= 30)) || (mes == 5 && dia <= 20)) {
			System.out.println("Seu signo é TOURO");
		}else if ((mes == 5 && (dia >= 21 && dia <= 31)) || (mes == 6 && dia <= 20)) {
			System.out.println("Seu signo é GEMEOS");
		}else if ((mes == 6 && (dia >= 21 && dia <= 30)) || (mes == 7 && dia <= 22)) {
			System.out.println("Seu signo é CANCER");
		}else if ((mes == 7 && (dia >= 23 && dia <= 31)) || (mes == 8 && dia <= 22)) {
			System.out.println("Seu signo é LEÃO");
		}else if ((mes == 8 && (dia >= 23 && dia <= 31)) || (mes == 9 && dia <= 22)) {
			System.out.println("Seu signo é VIRGEM");
		}else if ((mes == 9 && (dia >= 23 && dia <= 30)) || (mes == 10 && dia <= 22)) {
			System.out.println("Seu signo é LIBRA");
		}else if ((mes == 10 && (dia >= 23 && dia <= 31)) || (mes == 11 && dia <= 21)) {
			System.out.println("Seu signo é ESCORPIÃO");
		}else if ((mes == 11 && (dia >= 22 && dia <= 30)) || (mes == 12 && dia <= 21)) {
			System.out.println("Seu signo é SAGITÁRIO");
		}else if ((mes == 12 && (dia >= 22 && dia <= 31)) || (mes == 1 && dia <= 20)) {
			System.out.println("Seu signo é CAPRICÓRNIO");
		}
		
	}

}
