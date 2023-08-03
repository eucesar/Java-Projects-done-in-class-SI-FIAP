package aula11;

import java.util.Scanner;

/*
 * anota linha desse jeito - escreva um programa
 * 
 * 
 * 
 */
public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor, total, contador = 1;
		int par = 0;
		
		System.out.print("Inorme o total de numeros ---> ");
		total = teclado.hashCode();
	
		while(contador <= total) {
			System.out.println("Valor --> ");
			valor = teclado.nextInt();
			if(valor % 2 == 0) {
				par ++; //vai pegar o valor que ele quer comparar do loop, e vai contar tds os pares, somar 
			}
			contador++;
		}
		System.out.println("total de pares = " + par);
		System.out.println("total de impares = " + (total - par));
		
	}

}
