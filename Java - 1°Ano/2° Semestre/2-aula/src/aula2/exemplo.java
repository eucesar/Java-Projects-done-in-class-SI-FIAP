package aula2;

import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int [] x = new int [6];
		
		// entrada de dados
		for(int i = 0; i < x.length; i++){ //x.length - conprimento da variavel total - ultimo numero
			System.out.print("valor -> ");
			x[i] = teclado.nextInt();
		}
		
		//saida de dados
		for(int i = 0; i < x.length; i++){
			System.out.print(x[i]+ "°" + "número ");
		}
		
	}

}
