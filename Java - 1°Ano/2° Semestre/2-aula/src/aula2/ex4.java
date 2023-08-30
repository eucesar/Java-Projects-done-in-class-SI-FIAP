package revisao;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class revisao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int totalDeSala, totalDeAluno;
		int[] media;
		double mediaSala;
		double porcentagem;
		
		System.out.print("Total de salas --> ");
		totalDeSala = teclado.nextInt();
		
		for(int i = 1; i <= totalDeSala; i++) {
			System.out.print("Total de alunos da sala " + i + " ");
			totalDeAluno = teclado.nextInt();
			media = new int[totalDeAluno];
			mediaSala = 0;
			for(int j = 0; j < totalDeAluno; j++) {
				System.out.print("Nota do aluno(a) " + (j + 1) + " ");
				media[j] = teclado.nextInt();
				mediaSala += media[j]; // mediaSala = mediaSala + media[j];
			}
			mediaSala /= totalDeAluno;			
			System.out.println("Média da sala = " + String.format("%.3f", mediaSala));
			porcentagem = 0;
			for(int j = 0; j < totalDeAluno; j++) {
				if(media[j] > mediaSala) {
					porcentagem++;
				}
			}
			porcentagem /= totalDeAluno;
			System.out.println("Porcentagem = " + String.format("%.3f", porcentagem * 100));
			System.out.println();
		}

	}
}