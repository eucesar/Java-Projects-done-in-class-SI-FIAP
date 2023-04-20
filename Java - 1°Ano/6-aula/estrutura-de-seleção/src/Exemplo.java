import java.util.Scanner;

public class Exemplo {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.print("Nota 1 --> ");
		nota1 = teclado.nextDouble();
		System.out.print("Nota 2 --> ");
		nota2 = teclado.nextDouble();
		
		media = (nota1 + nota2) / 2;
		System.out.println("média = " + media);
		
		if(media >= 6) {
			System.out.println("Aprovado");
		} 
		else {
			System.out.println("Reprovado");
		}
	}
}
