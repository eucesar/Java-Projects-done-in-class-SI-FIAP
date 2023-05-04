import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
	
		//duas casas decimais = double
		
		// var
		double dolar, real, cotacao;
		Scanner teclado = new Scanner(System.in);
		
		//valor
		System.out.print("digite o valor em Dolar para converter em Real:  $");
		dolar= teclado.nextDouble();
		
		System.out.print("Digite a cotação do dólar: ");
        cotacao = teclado.nextDouble();
		
		//formula
		real = dolar * cotacao;
		
		//saida
		System.out.printf("Real: R$ %.2f", real);
	}

}
