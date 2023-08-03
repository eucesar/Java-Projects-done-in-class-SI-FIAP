import java.util.Scanner;

public class Exemplo2 {
	
	public static void main(String[] args) {
		
		// declaração de variáveis
		double nota1, nota2, media;
		Scanner teclado = new Scanner(System.in);
		
		// entrada de dados
		System.out.print("Informe sua primeira nota ");
		nota1 = teclado.nextDouble();
		System.out.print("Informe sua segunda nota ");
		nota2 = teclado.nextDouble();
		
		// processamento de dados
		media = (nota1 + nota2) / 2;
		
		// saída de dados
		System.out.println("Sua média final é: " + media);

	}

}
