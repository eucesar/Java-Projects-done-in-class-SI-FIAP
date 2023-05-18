package aula12;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long cpf;
		int dependente;
		double rendaMensal, salarioMinimo, imposto;
		int totalContribuinte, count = 1;
		
		System.out.print("Total de contribuintes ---> ");
		totalContribuinte = teclado.nextInt();
		System.out.print("Salario minimo atual ---> R$ ");
		salarioMinimo = teclado.nextDouble();
		
		while (count <= totalContribuinte) {
			System.out.println("Contribuente "+ count);
			
			System.out.println("CPF: ");
			cpf = teclado.nextLong();
			
			System.out.println("renda mensal: R$");
			rendaMensal = teclado.nextDouble();
			
			System.out.println("Total de dependentes: "); //filhos
			dependente = teclado.nextInt();
			
			rendaMensal = rendaMensal - (salarioMinimo * 0.05 * dependente);
			
			if (rendaMensal <= 2 * salarioMinimo) {
				imposto = 0;
				
			}else if (rendaMensal <= 3 * salarioMinimo) {
				imposto = rendaMensal * 0.05;
				
			}else if (rendaMensal <= 5 * rendaMensal * 0.10) {
				imposto = rendaMensal * 0.10;
				
			}else if (rendaMensal <= 7 * salarioMinimo) {
				imposto = rendaMensal * 0.15;
				
			}else {
				imposto = rendaMensal * 0.20; //acima de 7 saalrios minimos
			}
			
		}
	
	}

}
