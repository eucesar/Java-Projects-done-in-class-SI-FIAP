import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		// declaração de variáveis --> criar as variáveis
		Scanner teclado = new Scanner(System.in);
		double tempo, velocidade, consumo, distancia;
		
		// entrada de dados
		System.out.print("Tempo de viagem (h) --> ");
		tempo = teclado.nextDouble();
		System.out.print("Velocidade média da viagem (km/h) -->");
		velocidade = teclado.nextDouble();
		
		// processamento de dados
		distancia = velocidade * tempo;
		consumo = distancia / 10.5;
		
		// saída de dados
		System.out.println("Consumo de combustível = " + consumo);

	}
}
