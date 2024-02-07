import java.util.Scanner;

public class pexercicio15 {

	public static void main(String[] args) {
		
		// var
		double m, c, i, n;
		Scanner teclado = new Scanner(System.in);
		
		//valor - iJUROS - nMeses
		System.out.print("digite o valor do capital: ");
		c = teclado.nextDouble(); 
		
		System.out.print("digite o valor dos juros: ");
		i = teclado.nextDouble() / 100; 
		
		System.out.print("digite o valor de meses: ");
		n = teclado.nextDouble(); 
		
		//formula
		m = c * Math.pow(1 + i, n);
		
		//saida
		System.out.printf("valor do montante: %.2f", m );

	}

}
