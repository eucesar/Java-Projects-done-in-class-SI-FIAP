import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		//var
		Scanner teclado = new Scanner(System.in);
		double valor;
		double desconto;
		
		//apresentação
		System.out.println("--------------------------------------------------------------");
		System.out.println("------------------Bem Vindo - Iglesias Moda-------------------");
		System.out.println("--------------------------------------------------------------");
		
		System.out.println(" ");
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("---------COMPRA ACIMA DE 1000 TERÁ DESCONTO DE 15%------------");
		System.out.println("---------COMPRA ABAIXO DE 1000 TERÁ DESCONTO DE 8%------------");
		System.out.println("--------------------------------------------------------------");
		
		System.out.println(" ");
		
		//conta
		System.out.print("Digite um valor em Reais da sua compra para aplicar o desconto: R$");
		valor = teclado.nextInt();
		
		if (valor > 1000) {
			desconto = valor * 0.15;
			System.out.println("Tera um desconto de " + desconto);
		}
		else {
			desconto = valor * 0.08;
			//n preciso colocar valor=valor-desconto pq já coloquei em cima = evitar de REPETIR
			System.out.println("Tera um desconto de " + desconto);
		}
		
		valor = valor - desconto; //manipular a variavel valor com outra conta - n precisa criar outra var de valor total
		
		//saida
		System.out.println("Valor total da compra: " + valor);
	}

}
