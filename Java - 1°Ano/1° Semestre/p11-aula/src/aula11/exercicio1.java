package aula11;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2;
		//int contador; // valor1 controlar a estrutura de repetição - contador vai começar com o valor da variavel 'valor1'
		
		System.out.print("----> 1o valor inteiro: ");
		valor1 = teclado.nextInt();
		
		System.out.print("----> 2o valor inteiro - tem q ser um valor maior que o 1o: ");
		valor2 = teclado.nextInt();
		
		if (valor1 > 0 && valor2 > 0 && valor2 > valor1) {
			while (valor1 <= valor2) { //tds os valores entre o 1o e 2o - até onde vai - loop começa pelo valor a esquerda
				System.out.println(valor1); //em q vir primeiro o sysout - quem manda no loop que está a esquerda, por isso 'valor 1'
				valor1 = valor1 + 1; //break
				
			}
		}else {
			System.out.println("os valres devem ser positivos e o segundo maior que o primeiro");
		}

	}

}
