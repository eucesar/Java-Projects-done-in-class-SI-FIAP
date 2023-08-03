import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// var
		double altura, largura;
		double volume, comprimento;
		Scanner teclado = new Scanner(System.in);
		
		//valor
		System.out.print("digite a altura: ");
		altura = teclado.nextDouble(); //olhar para o Double
		System.out.print("digite a largura:  ");
		largura= teclado.nextDouble();
		
		//formula
		comprimento = largura * altura; //=area
		volume = comprimento * altura * largura;
		
		//saida
		System.out.println("Comprimento: " + comprimento);
		System.out.println("Volume: " + volume);
		
	}

}
