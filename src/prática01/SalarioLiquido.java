package prática01;

import java.util.Scanner;

public class SalarioLiquido 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		float salario, adicionalNoturno, horasExtras, descontos = 0.0f;
		
		System.out.println("\nDigite o salário bruto: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite os descontos: ");
		descontos = leia.nextFloat();
		
		salario = ((salario + adicionalNoturno + (horasExtras*5)) - descontos);
		
		System.out.println("\nO salário líquido é: " + salario);
		
		leia.close();
		
	}

}
