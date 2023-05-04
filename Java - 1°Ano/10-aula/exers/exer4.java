package exers;

import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String letra;
		
		System.out.println("informe uma letra -->");
		letra= teclado.next();
		
		letra = letra.toLowerCase();
		
		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))  {
			System.out.println("você digitou uma vogal");
		}
		else {
			System.out.println("você não digiotu uma vogal");
		}

	}

}
