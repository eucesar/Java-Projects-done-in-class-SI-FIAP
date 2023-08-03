import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//var
		Scanner teclado = new Scanner(System.in);
		double y, x;
		
		//valor
		System.out.print("digite o valor de X: ");
		x = teclado.nextInt();
		
		//saida
		//n pode = x <= 5 && x >= -5
		//pode =>
		if (x > 5 || x < -5) { 
			//conta
			y = 8 / Math.sqrt(Math.pow(x, 2) - 25);
			System.out.println("Valor de y: " + y);
		} else {
			System.out.println("Vai dar um numero incorreto");
		}
		// nan = not a numbre => x/0
		// infinity = divisão por 0, infinito
		// x n pode ser negativo
		// so poder ser 6 ou maior = valor positivo e n sendo nan e infinity
		// && = E
		// || = OU
		// ! - NÃO != - diferente
	}

}
