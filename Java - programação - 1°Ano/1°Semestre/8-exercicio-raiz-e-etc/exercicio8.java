import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		// var
		double salario, percentual, multiplicacao, novoSalario;
		Scanner teclado = new Scanner(System.in);
		
		//valor
		System.out.print("digite o salario: R$");
		salario = teclado.nextDouble(); // x
		
		System.out.print("digite o percentual: ");
		percentual = teclado.nextDouble() / 100; // +
	
		
		//formula
		multiplicacao = salario * percentual;
		novoSalario = salario + multiplicacao;
		
		//saida
		System.out.println("Valor do reajuste: " + multiplicacao );
		System.out.printf("Valor da Novo Salario: R$%.2f", novoSalario);


	}

}
