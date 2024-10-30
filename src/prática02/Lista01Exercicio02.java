package prática02;

import java.util.Scanner;

public class Lista01Exercicio02 {

	// Este programa indica se o número recebido do teclado é par ou ímpar e se é positivo ou negativo.

	public static void main(String[] args) {

		// Aqui é a sessão de leitura dos valores.

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite um número inteiro: ");
		short A = leia.nextShort();


		// Aqui é a sessão de verificação da regra de negócio.

		if (((A % 2) == 0) && (A > 0)) {
			
			System.out.println("\nO Número " + A + " é par e positivo!");
			
		} else if (((A % 2) > 0) && (A > 0)) {
			
			System.out.println("\nO Número " + A + " é ímpar e positivo!");
			
		} else if ((A < 0) && (((-1*A) % 2) > 0)  ){
			
			System.out.println("\nO Número " + A + " é ímpar e negativo!");
		
		} else{
			
			System.out.println("\nO Número " + A + " é par e negativo!");
		}
		
		leia.close();

	}
}
