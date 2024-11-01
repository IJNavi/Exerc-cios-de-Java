package prática05_Collections;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Lista02Exercício04 {

	public static void main(String[] args) {

		// Cria a Collection Set de Objetos da Classe Wrapper Integer chamada setValores.
		Set<Integer> setValores = new HashSet<>();

		// Adiciona valores numericos a Collection criada.

		setValores.add(2);
		setValores.add(5);
		setValores.add(1);
		setValores.add(3);
		setValores.add(4);
		setValores.add(9);
		setValores.add(7);
		setValores.add(8);
		setValores.add(10);
		setValores.add(6);

		// Interage com o usuário para obter um número a ser buscado no registro.

		System.out.println("\n>> Este programa informa se um número inteiro está contido no registro. <<");

		// Busca o número e informa o resultado ao usuário. Permitindo novas buscas até
		// o usuário encerrar.

		Scanner leia = new Scanner(System.in);
		Integer numero;
		byte parada;

		do {
			System.out.println("\n>>> Forneça um número inteiro para a busca: ");
			numero = leia.nextInt();
			if (setValores.contains(numero)) {
				System.out.println("O número " + numero + " foi encontrado!");
			} else {
				System.out.println("O número " + numero + " não foi encontrado!");
			}
			System.out.println("\n>> Deseja realizar uma nova busca? Digite 1 para continuar ou 0 para encerrar: ");
			parada = leia.nextByte();
		} while (parada != 0);
		leia.close();
	}
}
