import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
		// declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int valor, inverso;
		int centena, dezena, unidade;
		
		// entrada de dados
		System.out.print("Informe um valor com 3 dígitos (100 - 999): ");
		valor = teclado.nextInt();
		
		// processamento de dados
		centena = valor / 100;
		dezena = valor / 10 % 10;
		unidade = valor % 10;
		inverso = unidade * 100 + dezena * 10 + centena;
		
		// saída de dados
		System.out.println(valor + " invertido é " + inverso);

	}
}
