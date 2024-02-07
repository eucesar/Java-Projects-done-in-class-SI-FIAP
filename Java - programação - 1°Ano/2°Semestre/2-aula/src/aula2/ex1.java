package aula2;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int [] v = new int [5];
		int maior = Integer.MIN_VALUE; //inverto - se eu coloco na 1° '1' vai ser o maior, mas se na 2° eu colcoar '2' ent ele vai ser o maior
		int menor = Integer.MAX_VALUE; //vai do maior até o menor
		
		// entrada de dados
		for(int i = 0; i < v.length; i++){ //x.length - é o ultimo numero
			System.out.print("valor -> ");
			v[i] = teclado.nextInt();
			
			//tenho q colocar em 'if' - adicionar uma variavel em putra - uso o simbolod e menor pq é um vetor
			if(v[i] > maior) {
				maior = v[i]; //inverte
			}
			if(v[i] < menor) {
				menor = v[i];
			}
		}
		
		System.out.println("maior valor = " + maior);
		System.out.println("menor valor = " + menor);
	}

}
