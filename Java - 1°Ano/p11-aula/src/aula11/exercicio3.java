package aula11;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor, contador, resultado;
		String resposta;
		
	do {
		System.out.print("Valor ---> ");
		valor = teclado.nextInt();
		
		contador = 0; // 0 pq n tabuada tem 0
		while(contador <= 10) { //9
			resultado = valor * contador;
			System.out.println(valor + " * " + contador + " = " + resultado);
			contador = contador + 1; //9 + 1 = 10 - 0 a 10
		}
		System.out.print("Deseja outra tabuada (s / n) ? ");
		resposta = teclado.next();
		
		}while(resposta.equalsIgnoreCase("s"));{ //ignore minusculo e maisculo - aperta o S ele retorna o loop, enquano o N para
		//esse do while = é como se fosse if e else, sendo else o 'n', o oposto do 's'
	}
	}

}
