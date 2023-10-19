package metodo3;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in); //metodo nome - Scaner dps do new - metodo construtor - variavel : in
		int valor1;
		
		System.out.print("Informe um valor inteiro e positivo --> ");
		valor1 = sc.nextInt();
		
		if (valor1 <= 0) {
			System.out.println("o valor deve ser inteiro e positivo");
			
		}else {
			divisor(valor1); //variavel local - por isso coloco dentro do parenteses 
		}
		
	}
	
	public static void divisor(int valor2) { //int valor - copia do codigo, escorrega e recebe o valor, variavel valor 2 vai receber o mesmo valor da variavel valor 1
		
		//positivos e negativos
		for (int i = 1; i <= valor2; i++) {
			if (valor2 % i == 0) {
				System.out.print(i + " "); //vai aparecer os valores de i que são par, e vair ter um espaço
				System.out.println(-i + " "); //é como se tivesse uma string na frente do i sendo ' - '
				//systout (i + " " + -i + " ")
			}
		}
		//para sair do dbug - eu clico no botao vermelho do console
	}

}
