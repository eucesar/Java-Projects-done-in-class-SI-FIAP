package aula12;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		int contador = 1, valor;
		double fatorial = 1; //fatorail começa no 1 - usa double pq se for fatorial de um numero mt GRANDE da ruim
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe um valor inteiro e positivo ----> ");
		valor = teclado.nextInt();
		
		if (valor < 0) { //fatrorial n pode ser menor que zero mas PODE ser IGUAL a zero
			System.out.println("O valor deve ser negativo");
		}else {
			while (contador <= valor) {
				fatorial = fatorial * contador; //vai multiplicar cada numero do loop - para somar dever "*" seria "+"
				contador++;
			   }
			System.out.println(valor + "! = " + fatorial );
		}
	}
	
}