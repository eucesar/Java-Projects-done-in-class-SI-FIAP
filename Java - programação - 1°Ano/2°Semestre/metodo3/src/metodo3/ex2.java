package metodo3;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) { //entrada de dados no main
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Lado 1 --> ");
		x = sc.nextInt();
		
		System.out.print("Lado 2 --> ");
		y = sc.nextInt();
		
		System.out.print("Lado 3 --> ");
		z = sc.nextInt();
		
		if (x < y + z && y < x + z && z < x + y) { //tem q ser ' & ' - pq se for ' || ' - vai ser OU um OU o outro.. se tds tiverem certo acontece
			System.out.println("É trinagulo");
			classificar(x, y, z); // variaveis com o nome argumento - oque vai
		}else {
			System.out.println("Não é um trinagulo");
	
		}
		
	}
	
	//variaveis com o nome parametro - recebe na ordem, mas tenho que declarar os tipos das variaveis copias\parametro iguais
	public static void classificar(int x, int y, int z) { //vou usar o mesmo nome das variavis para n me perxder, mas ele receber a x,y,z
		if (x == y && y == z) {
			System.out.println("É um tringulo Equilátero");
		}else if(x == y || x == z || y == z) { //apenas dois lados iguais, por isso n faço z == x
			System.out.println("É um tringulo Isóceles");
		}else {
			System.out.println("É um Escaleno");
		}
	}
	

}
