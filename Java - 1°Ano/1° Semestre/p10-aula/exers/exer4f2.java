package exers;

import java.util.Scanner;

import javax.swing.UIManager;

public class exer4f2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String letra;
		
		System.out.println("informe uma letra -->");
		letra= teclado.next();
		
		letra = letra.toLowerCase();//transformo em minusculo para dps trabalhar
		
		switch (letra) {
		case"a":
		case"e":
		case"i":
		case"o":
		case"u":
			System.out.println("você digiotu uma vogal");
			break; //soh uso break aqui pq eu usei um sysout, ent so coloco break aonde tem sysout
		
		default: //se for oposto de td
			System.out.println("você não digitou uma vogal");
		}

	}

}
