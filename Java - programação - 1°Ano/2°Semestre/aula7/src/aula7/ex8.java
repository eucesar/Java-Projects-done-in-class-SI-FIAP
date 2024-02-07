package aula7;

import java.util.Random;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Random rd = new Random();
		int [][] m = new int [3][3];
		int aux;
		
		//preenche e imprime
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = rd.nextInt(10,50);
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		//trocar os elementos da diagonal princiapal com a secundaria
		for (int i = 0, j = m.length - 1; i < m.length; i++, j--) {
			aux = m[i][i];
			m[i][i] = m[i][j];
			m[i][j] = aux;
		}
		
		//imprime a matriz
		System.out.println();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
