package exers;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		double conta, taxa;
		int diarias;

				
		System.out.println("informe o numero de diarias");
		diarias = teclado.nextInt();
		
		if (diarias > 15) {
			taxa=15.50; //diaria = diaria * 15.50
		}
		else { //ou else if
			if (diarias == 15) {
				taxa=36; //diaria = diaria * 36
			}
			else {
				taxa=58; //diaria = diaria * 58
			}
		} 
		//fz por fatoração
		conta = diarias*(250+taxa); //diaria = diaria * 250
		
		System.out.println("conta = R$" + conta);
	}

}
