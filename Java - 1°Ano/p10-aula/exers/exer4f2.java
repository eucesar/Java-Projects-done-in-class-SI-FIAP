package exers;

import java.util.Scanner;

import javax.swing.UIManager;

public class exer4f2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String letra;
		
		System.out.println("informe uma letra -->");
		letra= teclado.next();
		
		letra = letra.toLowerCase();
		
		switch (letra) {
		case"a":
		case"e":
		case"i":
		case"o":
		case"u":
			System.out.println("você digiotu uma vogal");
			break;
		
		default:
			System.out.println("você não digitou uma vogal");
		}

	}

}
