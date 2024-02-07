package aula8;

import java.util.Random;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Random rd = new Random();
			int linha = 2;
			int coluna = 3;
			int[][] x = new int [linha][coluna];
			int[][] y = new int [coluna][linha];

			//preencher a matrix x
			for(int i = 0; i < x.length; i++ ) {
				for(int j = 0; j < x[i].length; j++) {
					x[i][j] = rd.nextInt(1, 6);
					y[j][i] = x[i][j];
					System.out.print(x[i][j] + "\t");
				}
				System.out.println();
			}
			
			//impressão da matriz y (transposta)
			System.out.println();
			for(int i = 0; i < y.length; i++) {
				for(int j = 0; j < y[i].length; j++) {
					System.out.print(y[i][j] + "\t");
				}
				System.out.println();
			}
			
		}

	}
