import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		
		// var
		double raio, area;
		Scanner teclado = new Scanner(System.in);
		
		//valor
		System.out.print("digite o raio: ");
		raio = teclado.nextDouble(); // x
		
		//formula
		area = Math.PI * Math.pow(raio, 2);
		
		//saida
		System.out.println("Valor da area: " + area );

	}

}
