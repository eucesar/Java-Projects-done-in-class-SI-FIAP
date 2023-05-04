package exers;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class exer2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("primeiro valor -->");
		x= teclado.nextInt();
		
		System.out.println("segundo valor -->");
		y= teclado.nextInt();
		
		System.out.println("terceiro valor -->");
		z= teclado.nextInt();
		
		if (x == y || x == z || y == z) {
			System.out.println("os valores tenque ser diferntes ");
		} else {
			if (x < y && x < z) {
				System.out.println("menor  = " + x);
			}
			else if (x < z) {
				System.out.println("menor = " + y);
			}
			else {
				System.out.println("menor = " + z);
			}	
				
			}
		}
	}


