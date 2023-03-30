import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		// declaração de variáveis --> criando as variáveis
		Scanner teclado = new Scanner(System.in);
		double c, f;
		
		// entrada de dados
		System.out.print("Temperatura Celsius --> ");
		c = teclado.nextDouble();
		
		// processamento de dados
		f = c * 9 / 5 + 32;
		
		// saída de dados
		System.out.println(c + "oC = " + f + "oF");
		
	}
}
