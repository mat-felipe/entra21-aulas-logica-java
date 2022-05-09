package br.com.entra21.aula08;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre For");

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
