package prática05_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista01Exercício02Versão02 {

	public static void main(String[] args) {

		// Cria a Collection ArrayList, do tipo Wrapper Integer, chamada valores.
		ArrayList<Integer> valores = new ArrayList<>();

		// Adiciona valores numericos a Collection criada.

		valores.add(2);
		valores.add(5);
		valores.add(1);
		valores.add(3);
		valores.add(4);
		valores.add(9);
		valores.add(7);
		valores.add(8);
		valores.add(10);
		valores.add(6);

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
			if (valores.contains(numero)) {
				System.out.println("O número " + numero + " está localizado na posição " + valores.indexOf(numero));
			} else {
				System.out.println("O número " + numero + " não foi encontrado!");
			}
			System.out.println("\n>> Deseja realizar uma nova busca? Digite 1 para continuar ou 0 para encerrar: ");
			parada = leia.nextByte();
		} while (parada != 0);
		leia.close();
	}
}
