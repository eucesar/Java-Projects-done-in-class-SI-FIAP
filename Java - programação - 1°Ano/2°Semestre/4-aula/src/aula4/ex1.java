package aula4;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int totalDeSala, totalDeAluno;
		int[] media;
		double mediaSala;
		double porcentagem;
		
		System.out.print("Total de salas --> ");
		totalDeSala = teclado.nextInt();
		
		for (int i = 1; i <= totalDeSala; i++) {
			System.out.print("Total de alunos da sala " + i + " ");
			totalDeAluno = teclado.nextInt();
			media = new int[totalDeAluno]; // 10,2,3,4,5
			mediaSala = 0;
			for (int j = 0; j < totalDeAluno; j++) { // armazena a quantidade de notas
				System.out.print("Nota de alunos (a) " + (j + 1) + " "); //j + 1 faz com que aparaca numero de aluno por aluno - se ele son
				media[j] = teclado.nextInt();
				mediaSala += media[j]; //tenho q igualar  a variavel - pq o vetor reinicia a cada sala, ent preciso somar 
			}
			mediaSala /= totalDeAluno;
			System.out.println("Média da sala = " + String.format("%.3f", mediaSala));
			
			porcentagem = 0;
			for (int j = 0; j < totalDeAluno; j++) {
				if (media[j] > mediaSala) {
					porcentagem++;
				}
			}
			porcentagem /= totalDeAluno; //calculo da porcentagem
			System.out.println("Porcentagem = " + String.format("%.3f", porcentagem * 100));
			System.out.println();
		}
		
	}

}
