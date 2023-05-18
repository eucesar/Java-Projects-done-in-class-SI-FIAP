package aula11;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor, maior = 0;
		int contador = 1; //começa no 1 até o 5
		
		while (contador <= 5) { //so trabalha com <= ou >= para loop
			System.out.print("digie um valor ----> "); //vai pedir para digitar o 'valor' 5 vzs
			valor = teclado.nextInt();
			if(contador == 1 || valor > maior) { //vai mostrar o maior de dados - sera == 1 pq quer numero q n seja negativo - o valor, já q MAIOR é 0
				 maior = valor; //armazena valor, maior de tds
			}
			contador = contador + 1; //4 + 1 = 5, vai repetir 5 vzs
		}
		System.out.println("maior = " + maior);		
		

	}

}
