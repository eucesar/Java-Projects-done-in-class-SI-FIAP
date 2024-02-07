package aula3;

import java.util.Random;

public class ex3 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] v = new int[10];
		int aux;
		
		//ler os dadaos do vetor
		System.out.println("Antes de ordenação");
		for (int i = 0; i < v.length; i++) {
			v[i] = random.nextInt(3 * v.length);
			System.out.println(v[i] + " ");
		}
		
		//ordem dos dados - ordenar dados em ordem com valores alatorios
		for (int j = 0; j < v.length; j++) {
		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] > v[i + 1]) {
				aux = v[i]; //grava
				v[i] = v[i + 1]; //vai subtituir o maior
				v[i+1] = aux; //grava
				
			}
		}
	}
		
		
		//impressao apos a ordenação
		System.out.println("/nDepois da ordenação"); //pula a linha de cima
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + " ");
		}
	}

}
