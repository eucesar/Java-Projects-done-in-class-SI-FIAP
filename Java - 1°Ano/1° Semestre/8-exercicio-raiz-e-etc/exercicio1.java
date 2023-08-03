//exercicio 14


import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		//var
		double altura, raio, pi;
		double volume;
		Scanner teclado = new Scanner(System.in);
		
		//valores
		pi = Math.PI;
		System.out.print("digite o raio: ");
		raio = teclado.nextDouble();
		System.out.print("digite a altura:  ");
		altura = teclado.nextDouble();
		
		//formula
		volume = pi * Math.pow(raio, 2) * altura;
		
		//saida de dados
		System.out.printf("Volume : %.3f", volume);

	}

}
/*
  |\__/,|   (`\
_.|o o  |_   ) )
-(((---(((-------- 𝒞𝑒𝓈𝒶𝓇 ℐ𝑔𝓁𝑒𝓈𝒾𝒶𝓈  */