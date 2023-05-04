package exers;

import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String letra;
		
		System.out.println("informe uma letra -->");
		letra = teclado.next(); //next = armazenar um aso letra   //teclado.nextLine(); //n preciso usar pq n usei uma nextline = mas so um next pq vai armazenar apenas uma letra - teria q ter colocado em cima dessa linha c tivesse outro variavel q armazena um numero q o usuario digitou

		letra = letra.toLowerCase(); //transformar em minuscula oq foi escrito sem espaço
		
		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))  {
			System.out.println("você digitou uma vogal");
		}
		else {
			System.out.println("você não digiotu uma vogal");
		}

	}

}
