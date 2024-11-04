package prática06_Fila_e_Pilha;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class Lista01Exercício01 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		String cliente;
		Byte opcao = 0;

		// Menu.

		System.out.println("**********************************");
		System.out.println("# 1 - Adicionar Cliente na fila. #");
		System.out.println("# 2 - Listar todos os clientes.  #");
		System.out.println("# 3 - Retirar Cliente da fila.   #");
		System.out.println("# 0 - Sair.                      #");
		System.out.println("**********************************");
		Scanner leia = new Scanner(System.in);

		// Leitura da opção e execução das funcções do programa.

		do {

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
				cliente = leia.next();
				System.out.println("\n\n\n >>Fila: \n");
				if (fila.add(cliente)) {
					
					Iterator<String> iterator = fila.iterator();
					
					while(iterator.hasNext()){
					   System.out.println(iterator.next());
					}
					System.out.println("\n >>Cliente adicionado!\n");
					
				} else
					System.out.println("\n Falha ao adicionar cliente!");
				break;

			}
			case 2: {
				
				if(fila.isEmpty()) {
					System.out.println("\n >> Não há Clientes na fila! << ");
					
				}else {
				
					System.out.println("\n >>Lista de Clientes na Fila: \n");
				
					Iterator<String> iterator = fila.iterator();
					while(iterator.hasNext()){
						System.out.println(iterator.next());
					}
				}
					break;
			}
			case 3: {
				System.out.println("\n >>Fila: \n");
				
				if(!(fila.isEmpty())) {
				
					fila.remove();
				
					Iterator<String> iterator = fila.iterator();
				
					while(iterator.hasNext()){
						System.out.println(iterator.next());
					}
					System.out.println("\n >>O cliente foi chamado!");
				}else
					System.out.println("\n >>A Fila está vazia!");
					
				break;
			}
			default: {
				System.out.println("\n\n >> Opção inválida!! <<");
				break;
			}
			}
		} while (opcao != 0);

		leia.close();
	}
}