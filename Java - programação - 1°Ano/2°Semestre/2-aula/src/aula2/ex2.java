package aula2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int [] v = new int [5]; //v de vaor
		int par = 0;
		
		// entrada de dados
		for(int i = 0; i < v.length; i++){ //x.length - conprimento da variavel total - ultimo numero
			System.out.print("valor -> ");
			v[i] = teclado.nextInt();
			
			if(v[i] % 2 == 0) {
				par++;
			}
			
		}
		System.out.println("total de pares = " + par);
		System.out.println("total de impares = " + (v.length - par)); //ele vai deletar os numeros da ordem
	}

}
