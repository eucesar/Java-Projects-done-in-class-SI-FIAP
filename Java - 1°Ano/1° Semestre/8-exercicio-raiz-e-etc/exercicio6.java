import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		// var
		int valor1, valor2, valor3;
		double valorDoQuadrado;
		Scanner teclado = new Scanner(System.in);
		
		//valor
		System.out.print("digite o valor: ");
		valor1 = teclado.nextInt();
		
		System.out.print("digite o valor: ");
		valor2 = teclado.nextInt();
		
		System.out.print("digite o valor: ");
		valor3 = teclado.nextInt();
		
		//formula
		valorDoQuadrado = Math.pow(valor1, 2) + Math.pow(valor2, 2) + Math.pow(valor3, 2);
				
		//saida
		System.out.printf("Soma dos valores ao quadrado: %.0f", valorDoQuadrado);

	}

}
