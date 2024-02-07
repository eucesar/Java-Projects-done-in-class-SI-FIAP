package aula1;

import java.util.Iterator;
import java.util.Scanner;

public class aula1Parte2 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		int n, i, j;
		int total, maximo = 0;
		
		// entrada de dados
		System.out.print("informe o valor de i --> ");
		i = sc.nextInt();
		System.out.print("informe o valor de j --> ");
		j = sc.nextInt();
		
		//vai do i ao j
		// i ++ para entrar em loop
		for (; i <= j ; i++) {
			
		
			n = i;
			total = 0;
			
			
				
			while (true) { 
				total++; //vai somar todos os valores
				
				if (n == 1) {
					break;
				}
			 
				if (n % 2 != 0) { 
					n = n * 3 + 1;
				}else {
					n = n / 2;
				}
				
			}
			if (total > maximo) {
				maximo = total;
			}
			System.out.println(total);
		}
		System.out.println();
		System.out.println(maximo);
	}
}
