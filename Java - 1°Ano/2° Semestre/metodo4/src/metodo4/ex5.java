package metodo4;

import java.util.Random;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

		int [] x = new int [10];
	
		//vai seguindo para baixo
		preencher(x);
		System.out.println("Valor original: ");
		imprimir(x); //impresso de função usa print - n quebra linha
		inverter(x);
		System.out.println("\nValor Invertido: ");
		imprimir(x);
		
		
	}

	//não precisa retorna nd por isso o void, já que estou usando vetor
	public static void preencher(int[] x) {
		
		Random rd = new Random();
		//gerar valor aleatorio
		for (int i = 0; i < x.length; i++) {
			x[i] = rd.nextInt(2,20); //vai gerar de 2 a 20
		}
	
	}

	public static void imprimir(int[] x) {
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
	}
	
	public static void inverter(int[] x) {
		
		int aux;
		int j = x.length - 1;
		for (int i = 0; i < x.length/2; i++) { //divido por 2 para inverter e desinverter
			aux = x[i];
			x[i] = x[j];
			x[j] = aux;
			j--;
		}
		
	}
	
	//imprimir dnv


}
