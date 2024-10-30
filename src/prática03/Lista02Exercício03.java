package prática03;

import java.util.Scanner;

public class Lista02Exercício03 {
	
	public static void main(String[] args) {

		byte contador21 = 0, contador50 = 0; 
		byte idade = 1;
		Scanner leia = new Scanner(System.in);

		// Informa ao usuário o funcionamento do programa.

		System.out.printf("\n   >> Este programa recebe idades até que seja introduzido um número negativo. <<\n");
		System.out.println(">> Então exibe na tela o número de menores de 21 e de maiores de 50 contabilizados. <<\n\n");
		
		// Processo de coleta de dados e contabilização.
		
		while(idade > 0) {
			
			System.out.println(">> Entre com uma idade ou número negativo: ");
			idade = leia.nextByte();
			if(idade < 21 && idade >= 0) {
				
				contador21++;
				
			}else if(idade > 50) {
				
				contador50++;
				
			}
		}
		leia.close();
		
		// Exibe os resultados.
		
		System.out.printf("Total de pessoas menores de 21 anos: %d\n\n", contador21);
		System.out.printf("Total de pessoas maiores de 50 anos: %d\n", contador50);

	}
}