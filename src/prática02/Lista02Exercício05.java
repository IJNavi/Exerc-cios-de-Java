package prática02;

import java.util.Scanner;

// Este programa fornece o valor a ser pago pelo cliente após escolher um produto e sua quantidade.

public class Lista02Exercício05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		//nesta sessão é selecionado o produto.

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

		System.out.println("\n--	Digite 1 para escolher Cachorro Quente.     --");
		System.out.println("-- 	Digite 2 para escolher X - Salada.     	    --");
		System.out.println("--	Digite 3 para escolher X - Bacon.      	    --");
		System.out.println("--	Digite 4 para escolher Bauru.               --");
		System.out.println("--	Digite 5 para escolher Refrigerante.        --");
		System.out.println("--	Digite 6 para escolher Suco de Laranja.     --");
		System.out.println("\n# ## ### #### #########   Menu   ########## #### ### ## #");		
		short opcao = leia.nextShort();
		
		//Aqui se indica a quantidade.
		
		System.out.println("\n\n\n==>> Agora entre com a quantidade do produto selecionado: <<==");
		short quantidade = leia.nextShort();
		
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
