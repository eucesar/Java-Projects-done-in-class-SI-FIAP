package exers;

import java.util.Scanner;

public class exer3f2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		System.out.println("digite um valor entre 1 e 4");
		valor = teclado.nextInt();
		
	switch (valor) {
	case 1 :
		System.out.println("você digitou 1");
			break;
	case 2:
		System.out.println("você digiotu 2");
			break;
	case 3:
		System.out.println("você digiotu 3");
			break;
	case 4:
		System.out.println("você digiotu 4");
			break;
	default:
		System.out.println("você didiotu outro valor");
	}
	
		}
			
	}


