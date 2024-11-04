package prática06_Fila_e_Pilha;

import java.util.Iterator;
import java.util.Stack;
import java.util.Scanner;

public class Lista01Exercício02 {
	public static void main(String[] args) {
	
		Stack<String> pilha = new Stack<String>();
		String livro;
		Byte opcao = 0;

		// Menu.

		System.out.println("**********************************");
		System.out.println("# 1 - Adicionar Livro na pilha.  #");
		System.out.println("# 2 - Listar todos os Livros .   #");
		System.out.println("# 3 - Retirar Livro da pilha.    #");
		System.out.println("# 0 - Sair.                      #");
		System.out.println("**********************************");
	
		Scanner leia = new Scanner(System.in);

	// Leitura da opção e execução das funções do programa.

		do
		{

			System.out.println("\n >>Entre com a opção desejada: ");
			opcao = leia.nextByte();

			switch (opcao) {
			case 0: {

				System.out.println("\n\n\n\n\n\nPoxa, você saiu deste maravilhoso programa. :[ ");
				System.out.println("\n\nExecute novamente caso queira voltar a utilizar!");
				System.out.println("\n\n >> Programa Finalizado! <<");
				break;

			}
			case 1: {

				System.out.println("\n >> Digite o nome: ");
				leia.skip("\\R?");
				livro = leia.nextLine();
				System.out.println("\n\n\n >>Pilha: \n");
				pilha.push(livro);
			
				if (pilha.contains(livro)) {

					Iterator<String> iterator = pilha.iterator();

					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					System.out.println("\n >>Livro adicionado!\n");

				} else
					System.out.println("\n Falha ao adicionar livro!");
				break;

			}
			case 2: {

				if (pilha.isEmpty()) {
					System.out.println("\n >> Não há Livros na pilha! << ");

				} else {

					System.out.println("\n >>Lista de Livros na Pilha: \n");

					Iterator<String> iterator = pilha.iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
				}
				break;
			}
			case 3: {
				System.out.println("\n >>Pilha: \n");

				if (!(pilha.isEmpty())) {

					pilha.pop();

					Iterator<String> iterator = pilha.iterator();

					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					System.out.println("\n >>Um Livro foi retirado da pilha!");
				} else
					System.out.println("\n >>A Pilha está vazia!");

				break;
			}
			default: {
				System.out.println("\n\n >> Opção inválida!! <<");
				break;
			}
			}
		}while(opcao!= 0);

		leia.close();
	}
}