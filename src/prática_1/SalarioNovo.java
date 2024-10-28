package prática_1;

import java.util.Scanner;

public class SalarioNovo 
{

	public static void main(String[] args) 
	{
		
			Scanner leia = new Scanner(System.in);
			
			float salario, abono = 0.0f;
			
			System.out.println("\nDigite o salário: ");
			salario = leia.nextFloat();
			
			System.out.println("Digite o abono: ");
			abono = leia.nextFloat();
			
			salario = salario + abono;
			System.out.println("O novo salário será: " + salario);
			
			leia.close();
			
	}

}
