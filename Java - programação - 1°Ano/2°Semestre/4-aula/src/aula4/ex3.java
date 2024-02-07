package aula4;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int [][] x = new int [3][3]; //1° linha e 2° coluna

		//entrada de dados - configurar linha e coluna com loop
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print("Valor");
				x[i][j] = teclado.nextInt();   // i = linha \ j = coluna
			}
		}
		
		//saida de dados
		System.out.println();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(x[i][j] + "\t");// i = linha \ j = coluna
			}
		System.out.println();
		}
	}

}
