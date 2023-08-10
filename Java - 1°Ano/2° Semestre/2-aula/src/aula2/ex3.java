package aula2;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double [] temperatura = new double [7];
		String [] dia = {"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quina-feira", "sexta-feira", "sábado"}; //colocar coisas dentro de vetores
		
		double media = 0;
		
		// entrada de dados
		for (int i = 0; i < temperatura.length; i++) {
			System.out.print("Informe a temperatura máximo do(a) " + dia[i] + " -> "); //a variavel do loop fica dentro da array da varivel dos dias
			temperatura[i] = teclado.nextDouble();
			media += temperatura[i]; // media = media + temperatura
		}
		
		media /= temperatura.length; //media 
		
		// impressão dos dias com temperatua acima de média
		System.out.println();
		for (int i = 0; i < temperatura.length; i++) {
			if(temperatura[i] > media) {
				System.out.println(dia[i]);
			}
			
		}
		
	}

}
