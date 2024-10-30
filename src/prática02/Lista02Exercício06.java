package prática02;

import java.util.Scanner;

// Este programa calcula o novo salário de um cargo com base no reajuste pré estabelecido.

public class Lista02Exercício06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		//nesta sessão se obtém o nome do colaborador.
		
		System.out.println("\nForneça o primeiro nome do colaborador:");
		String colaborador = leia.nextLine();
		
		//Aqui se seleciona o cargo.

		System.out.println("\n# ## ### #### #########   Menu   ########## #### ### ## #");

		System.out.println("\n--	Digite 1 para escolher Gerente.             --");
		System.out.println("-- 	Digite 2 para escolher Vendedor.     	    --");
		System.out.println("--	Digite 3 para escolher Supervisor.     	    --");
		System.out.println("--	Digite 4 para escolher Motorista.           --");
		System.out.println("--	Digite 5 para escolher Estoquista.          --");
		System.out.println("--	Digite 6 para escolher Técnico de TI.       --");
		System.out.println("\n# ## ### #### #########   Menu   ########## #### ### ## #");		
		short opcao = leia.nextShort();
		
		//Aqui se indica o salário atual.
		
		System.out.println("\n\n\n==>> Agora entre com o salário do cargo selecionado: <<==");
		float salario = leia.nextFloat();
		
		//Aqui é exibido na tela o nome do colaborador, cargo e novo salário.

		switch (opcao) {
		case 1:{
			System.out.println("\n\n\nNome do colaborador: "+ colaborador);
			System.out.println("\nCargo: Gerente");
			System.out.println("\nSalário: R$"+ salario*1.1);
			break;
		}case 2:{
			System.out.println("\n\n\nNome do colaborador: "+ colaborador);
			System.out.println("\nCargo: Vendedor");
			System.out.println("\nSalário: R$"+ salario*1.07);
			break;
		}case 3:
			System.out.println("\n\n\nNome do colaborador: "+ colaborador);
			System.out.println("\nCargo: Supervisor");
			System.out.println("\nSalário: R$"+ salario*1.09);
			break;
		case 4:{
			System.out.println("\n\n\nNome do colaborador: "+ colaborador);
			System.out.println("\nCargo: Motorista");
			System.out.println("\nSalário: R$"+ salario*1.06);
			break;
		}case 5:
			System.out.println("\n\n\nNome do colaborador: "+ colaborador);
			System.out.println("\nCargo: Estoquista");
			System.out.println("\nSalário: R$"+ salario*1.05);
			break;
		case 6:{
			System.out.println("\n\n\nNome do colaborador: "+ colaborador);
			System.out.println("\nCargo: Técnico de TI");
			System.out.println("\nSalário: R$"+ salario*1.08);
			break;
		}default:
			System.out.println("\nOpção invalida!");
			
	    leia.close();
		}
	}
}