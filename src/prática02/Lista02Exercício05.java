package prática02;

import java.util.Scanner;

// Este programa fornece o valor a ser pago pelo cliente após escolher um produto e sua quantidade.

public class Lista02Exercício05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		//nesta sessão é selecionado o produto.

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

		System.out.println("\n-- Digite 1 para escolher: Cachorro Quente.   R$10,00 --");
		System.out.println("-- Digite 2 para escolher: X - Salada.        R$15,00 --");
		System.out.println("-- Digite 3 para escolher: X - Bacon.         R$18,00 --");
		System.out.println("-- Digite 4 para escolher: Bauru.             R$12,00 --");
		System.out.println("-- Digite 5 para escolher: Refrigerante.      R$08,00 --");
		System.out.println("-- Digite 6 para escolher: Suco de Laranja.   R$13,00 --");
		System.out.println("\n# ## ### #### #########   Menu   ########## #### ### ## #");		
		Byte opcao = leia.nextByte();
		
		//Aqui se indica a quantidade.
		
		System.out.println("\n\n\n==>> Agora entre com a quantidade do produto selecionado: <<==");
		Byte quantidade = leia.nextByte();
		
		//Aqui é feito tanto o processamento e o informe do valor final junto ao informe do nome do produto.

		switch (opcao) {
		case 1:
			System.out.println("\nProduto: Cachorro Quente.\n\nvalor total: R$" + (quantidade * 10.00) +"");
			break;
		case 2:
			System.out.println("\nProduto: X-Salada.\n\nvalor total: R$" + (quantidade * 15.00) +"");
			break;
		case 3:
			System.out.println("\nProduto: X-Bcaon.\n\nvalor total: R$" + (quantidade * 18.00) +"");
			break;
		case 4:
			System.out.println("\nProduto: Bauru.\n\nvalor total: R$" + (quantidade * 12.00) +"");
			break;
		case 5:
			System.out.println("\nProduto: Refrigerante.\n\nvalor total: R$" + (quantidade * 8.00) +"");
			break;
		case 6:
			System.out.println("\nProduto: Suco de Laranja.\n\nvalor total: R$" + (quantidade * 13.00) +"");
			break;
		default:
			System.out.println("\nOpção invalida!");
			
	    leia.close();
		}
	}
}
