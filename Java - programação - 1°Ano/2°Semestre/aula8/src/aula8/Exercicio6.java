import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int linha_a, coluna_a;
		int linha_b, coluna_b;
		int linha_c, coluna_c;
		
		System.out.print("Total de linhas de A --> ");
		linha_a = sc.nextInt();
		System.out.print("Total de colunas de A --> ");
		coluna_a = sc.nextInt();
		linha_b = coluna_a;
		System.out.print("Total de colunas de B --> ");
		coluna_b = sc.nextInt();
		linha_c = linha_a;
		coluna_c = coluna_b;
		
		int[][] a = new int[linha_a][coluna_a];
		int[][] b = new int[linha_b][coluna_b];
		int[][] c = new int[linha_c][coluna_c];
		int soma;
		
		// preencher e imprimir a matriz A
		System.out.println("Matriz A");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = rd.nextInt(1, 4);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		// preencher e imprimir a matriz B
		System.out.println("\nMatriz B");
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				b[i][j] = rd.nextInt(1, 4);
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		// multiplicar a matriz A pela matriz B
		for(int i = 0; i < linha_a; i++) {
			for(int j = 0; j < coluna_b; j++) {
				soma = 0;
				for(int k = 0; k < coluna_a; k++) {
					soma += a[i][k] * b[k][j];
				}
				c[i][j] = soma;
			}
		}
		
		// preencher e imprimir a matriz C
		System.out.println("\nMatriz C");
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
