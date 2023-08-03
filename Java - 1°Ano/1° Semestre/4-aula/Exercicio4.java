import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		// declaração de variáveis --> criação das variáveis
		Scanner teclado = new Scanner(System.in);
		double salrio;
		int qtdKw;
		double valorKw, conta, contaDesconto;
		
		// entrada de dados
		System.out.print("Salário líquido R$ ");
		salrio = teclado.nextDouble();
		System.out.print("quantidade de quilowatts ");
		qtdKw = teclado.nextInt();
		
		// processamento de dados
		valorKw = salrio / 7 / 100;
		conta = valorKw * qtdKw;
		contaDesconto = conta * 90 / 100;
		
		// saída de dados
		System.out.println("Valor do quilowatt R$ " + valorKw);
		System.out.println("Valor da conta R$ " + conta);
		System.out.println("Valor da conta com 10% R$ " + contaDesconto);

	}
}
