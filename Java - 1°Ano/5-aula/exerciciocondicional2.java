package execicios;

import java.util.Scanner;

public class exerciciocondicional2 {

	public static void main(String[] args) {
		
		//var
		int valor;

		Scanner teclado = new Scanner(System.in);
		
		//numero
		System.out.print("Informe um numero -> ");
		valor = teclado.nextInt();
	
		/*
		//formula
		par = numero % 2;
		
		//saida
		if (par == 0) {
			System.out.println("numero eh par");
			
		} else {
			System.out.println("numero eh impar");
		}
		*/
		
		//valor % 2 == 0 - par
		//vaor % 2 != 0 - impar
		//valor % 2 == 1 - impar
		
		//formula + saida
		if (valor % 2 != 0) {
			System.out.println("impar");
		}else {
			System.out.println("par");
		}
		
		if (valor < 0) {
			System.out.println("negativo");
		}else {
			System.out.println("positivo");
		}
	}

}
