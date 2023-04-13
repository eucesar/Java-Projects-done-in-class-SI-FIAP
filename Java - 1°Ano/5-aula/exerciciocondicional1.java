package execicios;

import java.util.Iterator;
import java.util.Scanner;

public class exerciciocondicional1 {

	public static void main(String[] args) {
		//var
		double nota1, nota2;
		double media;
		double passo;
		Scanner teclado = new Scanner(System.in);
		
		//numero
		System.out.print("1-Nota -> ");
		nota1 = teclado.nextDouble();
		
		System.out.print("2-Nota -> ");
		nota2 = teclado.nextDouble();
		
		//formula
		media = ( nota1 + nota2 ) / 2;
		passo = 6;
		
		//saida
		System.out.println("Sua Media: " + media);
		
		if (media >= passo) {
			System.out.println("Parabens vc passo !");
		}else {
			System.out.println("Reprovou !");
		}
           
}
		
}
