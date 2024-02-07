package exers;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class exer2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("primeiro valor -->"); //6
		x= teclado.nextInt();
		
		System.out.println("segundo valor -->"); //2
		y= teclado.nextInt();
		
		System.out.println("terceiro valor -->"); //5
		z= teclado.nextInt();
		
		if (x == y || x == z || y == z) {
			System.out.println("os valores tem que ser diferentes"); //nenhum pode ser igual ao outro - crio um if e coloco td o resto no else
		} else {
			if (x < y && x < z) { //descobrir o menor valor
				System.out.println("menor  = " + x);
			}
			else if (x < z) { //eu aponto so duas variaveis e sobra y, ent y vai ser o menor = z,x,y
				System.out.println("menor = " + y);
			}
			else { //o inverso
				System.out.println("menor = " + z);
			}	
				
			}
		}
	}


