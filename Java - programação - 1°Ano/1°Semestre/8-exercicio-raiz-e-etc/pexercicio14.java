import java.util.Scanner;

public class pexercicio14 {

	public static void main(String[] args) {
		
		// var
		double A, B, C;
		double perimetro;
		double area, sp;
		Scanner teclado = new Scanner(System.in);
		
		//valor
		System.out.print("digite o valor do lado do tringulo, valor A: ");
		A = teclado.nextDouble();
		
		System.out.print("digite o valor do lado do tringulo, valor B: ");
		B = teclado.nextDouble();
		
		System.out.print("digite o valor do lado do tringulo, valor C: ");
		C = teclado.nextDouble();
		
		//formula
		perimetro = A + B + C;
		
		sp = ( A + B + C ) / 2;
		area = Math.sqrt(sp * (sp - A) * (sp - B) * (sp - C));
		
		//saida

		System.out.println("Valor do perimetro:" + String.format("%.2f", perimetro));
		System.out.println("Valor da formula SP:" + String.format("%.2f", sp));
		System.out.println("Valor da area:" + String.format("%.4f", area));
		
	}

}
