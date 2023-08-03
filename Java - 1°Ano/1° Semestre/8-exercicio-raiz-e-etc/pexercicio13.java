import java.util.Scanner;

public class pexercicio13 {

	public static void main(String[] args) {
		
		// var
		double X, Y;
		Scanner teclado = new Scanner(System.in);
		
		//valor
		System.out.print("digite o valor de X: ");
		X = teclado.nextDouble(); 
		
		//formula
		Y = X + ( 10 / (Math.sqrt(4 + Math.pow(X, 2))) );
		
		//saida
		System.out.printf("Valor de Y: %.2f", Y );

	}

}
