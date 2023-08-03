

import java.util.Scanner;


public class exercicio3{
	public static void main(String[] args) {
		
		// declaração de variaveis
		double c,f;
		Scanner teclado = new Scanner(System.in);
		
		// Entrada de dados
		 System.out.println("Temperatura Celsius --> ");
		 c = teclado.nextDouble();

		 
		 // processamento de dados 
		 f = c * 9 / 5 + 32;

		 // Saida de dados
		 System.out.println( c + "oC" + f + "oF" );

	}

}