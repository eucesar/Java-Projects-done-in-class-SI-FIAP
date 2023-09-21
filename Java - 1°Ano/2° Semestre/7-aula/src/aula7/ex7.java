package aula7;

import java.util.Random;
import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int totalVendedor;
		
		System.out.print("Total de vendedores --> ");
		totalVendedor = sc.nextInt();
		sc.nextLine(); //limpar o teclado, n bugar o loop
		
		String[] nome = new String[totalVendedor];
		String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
		double[][] venda = new double[totalVendedor][mes.length];
		double totalMes;
		double menorVenda = Double.MAX_VALUE;
		double maiorVenda = Double.MIN_NORMAL;
		int indexMaior = 0, indexMenor = 0;
		
		//entrada de dados
		for (int i = 0; i < totalVendedor; i++) {
			System.out.print("Nome do vendedor " + (i + 1) + " ");
			nome[i] = sc.nextLine();
			for (int j = 0; j < venda[i].length; j++) {
				venda[i][j] = rd.nextInt(4);
				System.out.print(venda[i][j] + "\t");
			}
			System.out.println();
		}
		
		//cálculo do total de vendas por mes
		System.out.println("\nTotal de vendas por mês");
		for (int j = 0; j < mes.length; j++) {
			totalMes = 0;
			for (int i = 0; i < totalVendedor; i++) {
				totalMes = totalMes + venda[i][j];
			}
			System.out.println(mes[j] + " --> R$ " + totalMes);
		}
	}
}
