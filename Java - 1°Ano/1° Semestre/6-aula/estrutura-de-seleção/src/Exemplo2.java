import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		System.out.print("Digite um valor inteiro");
		valor = teclado.nextInt();
		
		// verifica se o número informado é par ou ímpar
		if(valor % 2 != 0) {
			System.out.println("ímpar");
		}
		else { //valor % 2 = 0
			System.out.println("par");
		}
		
		// verifica se o número informado é positivo ou negativo
		if(valor < 0) {
			System.out.println("negativo");
		}
		else if (valor >= 0) {
			System.out.println("positivo");
		} 

	}
}
