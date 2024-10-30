package prática01;

import java.util.Scanner;

public class DiferençaDeProdutos 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2, numero3, numero4 = 0.0f;
		
		System.out.println("\nDigite primeiro número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("\nDigite o segundo número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("\nDigite o terceiro número: ");
		numero3 = leia.nextFloat();
		
		System.out.println("\nDigite o quarto número: ");
		numero4 = leia.nextFloat();
		
		numero1 = numero1 * numero2;
		numero2 = numero3 * numero4;
		numero1 = numero1 - numero2;
		
		System.out.println("\nA diferença entre o produto dos numeros 1 e 2 e o produto dos números 3 e 4 é: " + numero1);
		
		leia.close();

	}

}
