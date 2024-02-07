package exers;

import java.util.Scanner;
import java.util.prefs.InvalidPreferencesFormatException;

public class exer3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double conta, a , b , c;
		double x1,x2;

		System.out.println("a-->");
		a= teclado.nextDouble();

		//if = motivo para NÃO começar
		//else = motivo para começar com oq veio ANTES do if (motivo para n começar)
		//se for == 0 para de fazer a conta - senão continua - e se continuar o delta tem q estar dentro do else dps crio um if se n continuar e um else com a formual se continuar
		 if (a == 0) {
			System.out.println("não é uma equação do 2o grau");

		}else { //td isso é para calcuçlar a formula, td dentro do else 
			System.out.println("b-->");
			b= teclado.nextDouble();
			System.out.println();
			c= teclado.nextDouble();
			delta=b*b-4*a*c;

			if (delta<0) { //mptovp ára n comeãr sempre fora, em cima
				System.out.println("a equação não tem raiz real");

			}else {
				x1 = (-b+Math.sqrt(delta))/(2*a);
				x2 = (-b-Math.sqrt(delta))/(2*a);
				System.out.println("x1="+x1);
				System.out.println("x2="+x2);
				
			}
		}
		
	}

}
