package metodo3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		int x,y,z, m;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor 1 --> ");
		x = sc.nextInt();
		
		System.out.print("Valor 2 --> ");
		y = sc.nextInt();
		
		System.out.print("Valor 3 --> ");
		z = sc.nextInt();
		
		//eu retornei aux, ent n preciso colocar, pq o AUX subtitui TUDO, mas so coloco as variaveis que vou passar, a função MAIOR fica valendo AUX
		m = maior(x,y,z);
		
		System.out.println("maior = " + m);
		
	}
	
	//void - não RETORNA NENHUM VALOR
	//no lugar do void coloco int - pq vai retornar um valor INT
	public static int maior(int x, int y, int z) {
		
		//maior --
		int aux = x;
		
		if (y > aux) {
			aux = y;
		}if (z > aux) {
			aux = z;
		}
		//--
		
		return aux; //int
	}

}
