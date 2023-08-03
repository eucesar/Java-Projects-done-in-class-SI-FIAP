package exers;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
import java.util.zip.Inflater;

public class exer1 {

	public static void main(String[] args) {
		
		Scanner tecladoScanner = new Scanner(System.in);
		 double media ;
		 
		 System.out.println("media final -- >");
		 
		 media = tecladoScanner.nextDouble();
		 
		 if (media < 6) {
			 System.out.println("aprovado");			
		}
		 else {
			if (media < 4) {
				System.out.println("reprovado");
			}
			else {
				System.out.println("exame");
			}
		}
		}
	}


