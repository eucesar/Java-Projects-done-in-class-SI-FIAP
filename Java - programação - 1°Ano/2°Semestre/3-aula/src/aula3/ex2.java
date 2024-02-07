package aula3;

import java.util.Random;

public class ex2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] v = new int [5]; //posição = linha
		boolean achei;  //falso                                    
		
		//entrada de dados
		for (int i = 0; i < v.length;) {
			v[i] = random.nextInt(5); //numero maximo de random
			achei = false;
			
			for (int j = 0; j < i; j++) { //trabalho com o i de vez com o v - pq sim pq esta dentro do loop
				
				if(v[j] == v[i]) {
				achei = true;
				}
 
			}
			if (achei == false) {
				i++; //so vou mudar de posição s en tiver numero repetido
			}
		}

		//saida de dados - eh o msm loop q o outro 
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
	}

}
