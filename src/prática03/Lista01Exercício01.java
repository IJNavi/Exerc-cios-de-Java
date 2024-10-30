package prática03;

import java.util.Scanner;

public class Lista01Exercício01 {

	public static void main(String[] args) {

        byte contador, numero01, numero02;
        Scanner leia = new Scanner(System.in);
        
        // Informa ao usuário o funcionamento do programa e coleta os dados.
        
        System.out.println("\n>> Este programa mostra os múltiplos de 3 e 5 dentro do intervalo fornecido. <<");
        System.out.println("\n>> O primeiro número deve ser o de menor valor e o segundo número o de maior valor. <<\n\n");
        
        System.out.println(">> Digite o primeiro número do intervalo: ");
        numero01 = leia.nextByte();
        
        System.out.println("\n>> Digite o último número do intervalo: ");
        numero02 = leia.nextByte();
        
        //Melhora a visualização do resultado para o usuário.
        System.out.println("\n\n\n");

        leia.close();
        
        // Executa processamento e exibe os resultados.
        
        if(numero01 > numero02)
            System.out.println("\n\n\n>> INTERVALO INVÁLIDO <<\n\n\n\n");

        for (contador = numero01; contador < numero02; contador++) {
        	
        	if(((contador % 3) == 0) && ((contador % 5) == 0))
            	System.out.printf("%d é múltiplo de 3 e 5\n", contador);
        }


	}

}
