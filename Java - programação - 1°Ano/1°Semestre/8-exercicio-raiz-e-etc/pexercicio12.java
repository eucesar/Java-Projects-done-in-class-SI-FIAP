import java.util.Scanner;

public class pexercicio12 {

	public static void main(String[] args) {
		
		// var
		double pes, metros, conversao;
		Scanner teclado = new Scanner(System.in);
		
		//valor
		System.out.print("digite o valor dos Pés: ");
		pes = teclado.nextDouble(); 
		
		//formula
		conversao = 0.3048;
		metros = pes * conversao;
		
		//saida
		System.out.printf("Valor dos Metros: %.2f", metros );

	}

}
