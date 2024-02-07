package aula5;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int TotalCompetidor;
		int totalLancamento;
		double soma;
		
		System.out.print("Total de competidores --> ");
		TotalCompetidor = in.nextInt();
		System.out.print("Total de lançamentos --> ");
		totalLancamento = in.nextInt();
		
		String[] nome = new String[TotalCompetidor];
		double [][] lancamento = new double [TotalCompetidor][totalLancamento + 1];
		
		
		//ENTRADA DE DADOS
		for(int i = 0; i < TotalCompetidor; i++) {
			in.nextLine();
			System.out.println("Competidor " + (i + 1));
			System.out.print("Nome: ");
			nome[i] = in.nextLine();
			soma = 0;
			for (int j = 0; j < totalLancamento; j++) {
				System.out.print("Lançamento " + (j + 1) + ": ");
				lancamento[i][j] = in.nextDouble();
				soma = soma + lancamento[i][j];
			}
			System.out.println();
			lancamento[i][totalLancamento] = soma;
		}
		
		//saida de dados
		System.out.println();
		for (int i = 0; i < TotalCompetidor; i++) {
			System.out.println(nome[i] + " ---> " + lancamento[i][totalLancamento]);
		}
	}

}
