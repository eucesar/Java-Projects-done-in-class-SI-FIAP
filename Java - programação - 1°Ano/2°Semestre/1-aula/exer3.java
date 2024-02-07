package exers;

import java.util.Iterator;
import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int qtdProduto;
		double preço;
		double totalcompra = 0;
		int formapagamento;
		
		System.out.println("Informe a quantidade de produtos:");
		qtdProduto = teclado.nextInt();
		
		for ( int cont = 1; cont <= qtdProduto; cont++){
			System.out.println("Preço do produto R$");
			preço = teclado.nextDouble();
			totalcompra = totalcompra + preço;
		}
		System.out.println("total da compra R$" + totalcompra);
		
		//*-------------------------------------------------------*/
		System.out.println(" Escolha a forma de pagamento");
		System.out.println("1. pagamento a vista com 10% de desconto");
		System.out.println("2. em duas vezes com 15.5% de acrescimo");
		formapagamento = teclado.nextInt();
		
		if (formapagamento == 1) {
			totalcompra = totalcompra * 0.9;
			System.out.println("valor para pagmento a vista R$" + totalcompra);
		} else {
			totalcompra = totalcompra * 1.155; //vai almentar, por isso o 1 dps o ponto 
			System.out.println("valor para pagamento em duas vezes R$" + totalcompra);
			System.out.println("duas parcelas de R$" + (totalcompra /2));
		}
		
		
		teclado.close();

	}

}
