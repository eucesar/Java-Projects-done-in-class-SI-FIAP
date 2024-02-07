import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		//var
		double valor, taxa, tempo;
		double prestacao; //duas casas decimais
		Scanner teclado = new Scanner(System.in);
		
		//valores
		System.out.print("digite o valor: ");
		valor = teclado.nextDouble();
		System.out.print("digite a taxa:  ");
		taxa = teclado.nextDouble() / 100;
		System.out.print("digite os dias:  ");
		tempo = teclado.nextDouble();
		
		//formula
		prestacao = valor + (valor * taxa * tempo);
		
		//saida de dados
		System.out.printf("Prestação : %.2f ", prestacao);
		System.out.println("Prestação" + String.format("%.2f", prestacao));
	}

}
