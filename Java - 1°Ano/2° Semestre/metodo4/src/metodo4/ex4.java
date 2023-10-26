package metodo4;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a,b,c, delta;
		double[] raiz = new double[2];
		
		System.out.print("a --> ");
		a = sc.nextDouble();
		
		if (a == 0) {
			System.out.println("Não é uma equação do segundo grau");
		}else {
			System.out.print("b --> ");
			b = sc.nextDouble();
			System.out.print("c --> ");
			c = sc.nextDouble();
			//preciso criar a variavel delta em cima
			delta = calcularDelta(a,b,c);
			if (delta < 0) {
				System.out.println("a equação não tem raiz");
			}else {
				raiz = calcularRaiz(a, b, delta);
				System.out.println("x1 = " + String.format("%.2f", raiz[0] )); //x1
				System.out.println("x2 = " + String.format("%.2f", raiz[1] )); //x2

			}
		}

	}

	//tem que estar em publico - static n tem orrientação ao obj
	public static double calcularDelta(double a, double b, double c) {
		//no começo do codigo ele retorna 0 para n dar erro
		double delta;
		delta = (b * b - 4 * a * c);
		return delta; //só da para returnar 1 vez
	}
	
	//não posso chamar a,b e c
	private static double[] calcularRaiz(double a, double b, double delta) {
		double[] raiz = new double[2]; //preciso declarar deves imortar pq volta.
		raiz[0] = (-b + Math.sqrt(delta)) / (2 * a);
		raiz[1] = (-b - Math.sqrt(delta)) / (2 * a);
		return raiz;
	}
}
