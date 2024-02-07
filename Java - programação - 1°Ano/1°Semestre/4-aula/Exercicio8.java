import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		// declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int valor, unidade, dezena, centena; //tem q ser int
		
		// entrada de dados
		System.out.print("Informe um valor com 3 dígitos (100 - 999): ");
		valor = teclado.nextInt();
		
		// processamento de dados
		centena = valor / 100; // 1.23 = vai pegar o numero da esquerda
		dezena = valor / 10 % 10 ; // 12.3 /10 = 1.23 = vai pegar o 2 - sempre o numerod a direita quando é "%" - pega o numero da sobra
		unidade = valor % 10; //12.3 = vai pegar o 3
		
		// saída de dados
		System.out.println("Valores são: " + centena + " " + dezena + " " + unidade);

	}
}