import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		// declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int valor, dezena;
		
		// entrada de dados
		System.out.print("Informe um valor com 3 dígitos (100 - 999): ");
		valor = teclado.nextInt();
		
		// processamento de dados
		dezena = valor / 10 % 10;
		
		// saída de dados
		System.out.println("A dezena é: " + dezena);

	}
}
