package aula5;

import java.util.Random;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
		
		//random
		Random rd = new Random();
		int[][] m = new int[3][3]; //3 por 3 para dar exemplo
		int maior = 0;
		
		//preencher, imprimir e localizar o maior valor - for dentro de for para ficar 3x3
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = rd.nextInt(0, 20); //vai de zero a viente
				System.out.print(m[i][j] + "\t"); //aparece os 3x3
				
				//vai armazenar o maior
				if(m[i][j] > maior) {
					maior = m[i][j];
					
					
				}
			}
			
			
			System.out.println();
		}
		
		System.out.println("maior = " + maior);
		
		//impressão da localização do maior elemento falando aonde esta na linha e coluna
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(m[i][j] == maior) {
					System.out.println("Linha = " + i + ", coluna = " + j);
				}
				
			}
			
		}

	}

}
	
