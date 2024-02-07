package aula3;

import java.util.Random;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		
		int x = random.nextInt() % 10; //todos os numeros gerados vão ficar a baixo de 10
		int y = random.nextInt(50); //começa a gerar numero a partir do 0 até o 50
		
		System.out.println(x);
		
	}
}
