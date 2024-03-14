package ex1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		int a;
		int[] x = new int[10];
		
		lerDados(x);
		Arrays.sort(x); //imprimir valores crescentes
		imprimir(x);
		int [] novo = removerDuplicacao(x);
		imprimir(novo);
				
	}
	
	private static int[] removerDuplicacao(int[] x) {

		int tamanho = calcularTamanho(x);
		int[] novoVetor = new int[tamanho];
		int k = 0;
		boolean repetido;
		
		for (int i = 0; i < x.length; i++) {
			repetido = false;
			for (int j = 0; j < i; j++) {
				if (x[i] == x[j]) {
					repetido = true;
					break;
				}
			}
			
			if (!repetido) {
				novoVetor[k] = x[i]; //vai ler e copiar o outro vetor
				k++; //e vai somar os valores q n estão repetindo
			}
		}
		return novoVetor;
		
		
	}

	private static int calcularTamanho(int[] x) {
		int tamanho = 0 ;
		boolean repetido;
		for (int i = 0; i < x.length; i++) {
			repetido = false; // false fica fixo na posição
			for (int j = 0; j < i; j++) { //o j passa por todo o i - j < i = é como se fosse j passando pelo valor maximo de i - e por estar dentro do i vai ter todos os valores e 'i'
				if (x[i] == x[j]) {
					repetido = true;
					break;
				}
			}
			if (!repetido) {
				tamanho++;
			}
		}
		return tamanho;
	}

	private static void imprimir(int[] x) {
		
		System.out.print("valor --> ");
		for (int i : x) { //para cada valor inteiro no vetor x - é literalemnte a msm coisa do lerDados mas mais resumida - mas imprimo o 'i'
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static void lerDados(int[] x) {
		
		Random rd = new Random();
		
		for (int i = 0; i < x.length; i++) {
			x[i] = rd.nextInt(10,19);
		}		
	}

}
