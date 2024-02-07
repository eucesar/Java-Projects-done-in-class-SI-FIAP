import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// declaração de variáveis
		double base, altura;
		double area, perimetro;
		Scanner teclado = new Scanner(System.in);
		
		// entrada de dados
		System.out.print("Base --> ");
		base = teclado.nextDouble();
		System.out.print("Altura --> ");
		altura = teclado.nextDouble();
		
		
		// processamento
		area = base * altura;
		perimetro = 2 * (base + altura);
		
		// saída de dados
		System.out.println("Área = " + area);
		System.out.println("Perímetro = " + perimetro);
		
	}

}
