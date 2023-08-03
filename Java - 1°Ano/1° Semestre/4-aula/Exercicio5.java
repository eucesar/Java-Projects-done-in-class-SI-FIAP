import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		// declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		double valorAula, porcentagemInss, salarioLiquido;
		int numeroHoras;
		double salarioBruto, desconto;
		
		// entrada de dados
		System.out.print("Valor da aula R$ ");
		valorAula = teclado.nextDouble();		
		System.out.print("Porcentagem do INSS ");
		porcentagemInss = teclado.nextDouble();
		System.out.print("Número de aulas trabalhadas ");
		numeroHoras = teclado.nextInt();
		
		// processamento de dados
		salarioBruto = valorAula * numeroHoras;
		desconto = salarioBruto * porcentagemInss / 100;
		salarioLiquido = salarioBruto - desconto;
		
		// saída de dados
		System.out.println("Salário líquido R$ " + String.format("%.2f", salarioLiquido));

	}
}
