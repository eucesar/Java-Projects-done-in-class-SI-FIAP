//cai até aqui no cp.1

package aula4;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double [] temperatura = new double [7];
		String [] dia = {"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quina-feira", "sexta-feira", "sábado"};
		
		
		// entrada de dados
		
		  for (int i = 0; i < temperatura.length; i++) {
		  System.out.print("Informe a temperatura máximo do(a) " + dia[i] + " -> ");
		  temperatura[i] = teclado.nextDouble();  
		   }
		 
		
		// impressão de 
		System.out.println();
		for (int i = 0; i < dia.length; i++) {
			System.out.print(String.format("%13s", dia[i])); //%s alinha tds as linhas - print nomral para ficar a direita
			for (int j = 1; j <= temperatura[i]; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
		
	}

}
