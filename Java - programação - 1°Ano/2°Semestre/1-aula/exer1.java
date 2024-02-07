package exers;

import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		System.out.println("informe um valor positivo e inteiro ->");
		
		valor = teclado.nextInt();
		
		if (valor > 0) {
			for(int cont = 1; cont <= valor; cont++) { 
				if( valor %  cont == 0){ // vai mostrar valores diviziveis pela variavel 'valor'
					System.out.println(cont + " ");
				}
			}
		}else {
			System.out.println("o número deve ser inteiro e positivo ->");
		}
		
		teclado.close();

	}

}
