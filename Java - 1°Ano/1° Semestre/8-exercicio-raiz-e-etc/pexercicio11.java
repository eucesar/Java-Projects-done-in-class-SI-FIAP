import java.util.Scanner;

public class pexercicio11 {

	public static void main(String[] args) {
		
		// var
		double distancia, tempo, velocidade;
		Scanner teclado = new Scanner(System.in);
		
		//valor
		System.out.print("digite a distancia (em km): ");
		distancia = teclado.nextDouble(); 
		
		System.out.print("digite o tempo (em hrs): ");
		tempo = teclado.nextDouble(); 
		
		//formula
		velocidade = (distancia * 1000) / (tempo * 60);
		
		//saida
		System.out.println("Valor da velociade (m/s): " + velocidade );

	}

}
