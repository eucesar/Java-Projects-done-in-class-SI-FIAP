package exers;

import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome, genero;
		double altura, peso;
		
		System.out.println("informe seu nome");
		nome = teclado.next();
		
		System.out.println("informe seu genero (masculino ou feminino");
		genero = teclado.next();
		
		System.out.println("informe sua altura em metros");
		altura= teclado.nextDouble();
		
		//variação de pesoa de acordo com genro e altura
		if (genero == "masculino") {
			peso = 72.7 * altura - 58;
		} else {
			peso = 62.1 * altura - 44.7;
		}
		System.out.println(nome + "seu peso ideal é:" + peso);
		
		
	
	}

}
