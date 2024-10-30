package prática03;

import java.util.Scanner;

public class Lista03Exercício05 {

	public static void main(String[] args) {

		
		byte numero, soma = 0; 
		Scanner leia = new Scanner(System.in);

		// Informa ao usuário o funcionamento do programa.

		System.out.printf("\n   >> Este programa recebe números inteiros até que seja introduzido o número 0. <<\n");
		System.out.println("       >> Então exibe na tela a soma de todos os números positivos digitados. <<\n\n");
		
		// Processo de coleta de dados e contabilização.
		
		do {
			
				System.out.println(">># Entre com um número inteiro: ");
				numero = leia.nextByte();

				if(numero > 0)
					soma += numero;
			
		} while (numero != 0);
		
		leia.close();
				
		// Exibe os resultados.
		
		System.out.printf("A soma dos números positivos é: %d\n\n", soma);


	}

}