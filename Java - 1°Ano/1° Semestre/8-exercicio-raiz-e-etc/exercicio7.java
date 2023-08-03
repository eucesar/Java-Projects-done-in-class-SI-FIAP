import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		// var
		int valor1, valor2, valor3, valor4;
		int produto, soma;
		Scanner teclado = new Scanner(System.in);
		
		//valor
		System.out.print("digite o valor: ");
		valor1 = teclado.nextInt(); // x
		
		System.out.print("digite o valor: ");
		valor2 = teclado.nextInt(); // +
		
		System.out.print("digite o valor: ");
		valor3 = teclado.nextInt(); // x
		
		System.out.print("digite o valor: ");
		valor4 = teclado.nextInt(); // +
		
		//formula
		produto = valor1 * valor3;
		soma = valor2 + valor4;		
		
		//saida
		System.out.println("Valor do Produto: " + produto);
		System.out.println("Valor da Soma: " + soma);

	}

}
