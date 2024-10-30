package prática02;

import java.util.Scanner;

// Este programa recebe três números inteiros do usuário e verifica se A + B > C

public class Lista01Exercicio01 
{

	public static void main(String[] args) 
	{
		
		// Aqui é a sessão de leitura dos valores.
		
		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o número A: ");
		short A = leia.nextShort();
		
		System.out.println("\nDigite o número B: ");
		short B = leia.nextShort();
		
		System.out.println("\nDigite o número C: ");
		short C = leia.nextShort();

		// Aqui é a sessão de verificação da regra de negócio.
		
		if((A + B) > C)
		{
			System.out.println("\nA Soma de A + B é Maior do que C!");
		}
		else if((A + B) < C) 
		{
			System.out.println("\nA Soma de A + B é Menor do que C!");			
		}
		else
		{
			System.out.println("\nA Soma de A + B é Igual a C!");
		}
		
		leia.close();
		
	}
}
