import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		// declaração de variáveis --> criação de variáveis
		Scanner teclado = new Scanner(System.in);
		double x, y;
		
		// entrada de dados
		System.out.print("x --> ");
		x = teclado.nextDouble();
		
		// processamento
		y = Math.sqrt(Math.cbrt(x - 1.0 / 2));
				
		// saída de dados
		System.out.println("y = " + y);

	}
}
