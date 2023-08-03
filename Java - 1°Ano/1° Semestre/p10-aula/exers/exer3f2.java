package exers;

import java.util.Scanner;

public class exer3f2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		System.out.println("digite um valor entre 1 e 4");
		valor = teclado.nextInt(); //so vai armazenar numero - letra n funciona
	
	//swtich = o interruptor/tecla for precionada = numero = variavel q o usuario digitou 
	switch (valor) {
	case 1 : //CASO o valor da tecla/case 1 for digitada   =>   if (valor == 1)  => usar ':' no final
		System.out.println("você digitou 1");
			break; //parrar
	case 2:
		System.out.println("você digiotu 2");
			break;
	case 3:
		System.out.println("você digiotu 3");
			break;
	case 4: 
		System.out.println("você digiotu 4");
			break;
	default: //nenhuma q n seja a case dita em cima
		System.out.println("você didiotu outro valor");
	}

		}
			
	}


