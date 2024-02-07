import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		//var
		int A, B; 
		Scanner teclado = new Scanner(System.in);
		
		//valores
		System.out.print("digite o valor de A: ");
		A = teclado.nextInt();
		System.out.print("digite o valor de B:  ");
		B = teclado.nextInt();
		
		//formula
		A = A + B; 
		B = A - B; 
		A = A - B;
		
		//saida de dados
		System.out.println("Vai inverter o valor de A e B");
		System.out.println("A : " + A);
		System.out.println("B : " + B);

	}

}
