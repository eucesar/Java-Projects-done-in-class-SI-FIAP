package exers;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		System.out.println("digite um valor entre 1 e 4");
		valor = teclado.nextInt();
		
		if (valor == 1) {
			System.out.println("você digitpu 1");
		}
		else if (valor == 2) {
			System.out.println("você digitou 2");
		} 
			else if (valor == 3) {
				System.out.println("você digitou 3");
			
			} 
				else if (valor == 4) {
					System.out.println("você digitou 4");
		}
				else {
					System.out.println("você digitou um valor diferente");
				}
		}
			
	}