import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		//var
		Scanner teclado = new Scanner(System.in);
		double lado1, lado2, lado3, soma;
		
		//valor
		System.out.print("digite o valor de X: ");
		lado1 = teclado.nextInt();
		
		System.out.print("digite o valor de X: ");
		lado2 = teclado.nextInt();
		
		System.out.print("digite o valor de X: ");
		lado3 = teclado.nextInt();
		
		//tringulo tem 3 lados, tem q testar os tres lados
		if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) { //um lado tem que ser menor que a soma dos outros dois para ser um tringulo
			System.out.println("eh tringulo");
			System.out.println("lado1: " + lado1);
			System.out.println("lado2: " + lado2);
			System.out.println("lado3: " + lado3);
		}else {
		System.out.println("os valores não formam um tringulo"); {
				
			}
		}

	}

}
