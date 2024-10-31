package prática04;

// Bibliotecas/recursos utilizados.

import java.util.Scanner;

public class Lista01Exercício01 {

	public static void main(String[] args) {

		int numerosInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		byte indice;

		// Recebe do usuário o número a ser buscado no vetor previamente definido.

		System.out.println("\nForneça um número inteiro: ");
		Scanner leia = new Scanner(System.in);
		byte numero = leia.nextByte();
		leia.close();

		// Busca pelo número fornecido e informa se foi encontrado ou não.

		for (indice = 0; indice < numerosInteiros.length; indice++) {

			if (numero == numerosInteiros[indice]) {
				System.out.println("\nO número " + numero + " está na posição: " + indice);
				indice = 11;
			}
		}
		if (indice == 10) {
			System.out.println("\nO número " + numero + " não foi encontrado!");
		}
	}
}