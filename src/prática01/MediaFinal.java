package prática01;

import java.util.Scanner;

public class MediaFinal {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		float nota01, nota02, nota03, nota04 = 0.0f;
		
		System.out.println("\nDigite a primeira nota: ");
		nota01 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota02 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota03 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota04 = leia.nextFloat();
		
		nota01 = ((nota01 + nota02 + nota03 + nota04)/4);
		
		System.out.println("\nA média final é: " + nota01);
		
		leia.close();
	}

}
