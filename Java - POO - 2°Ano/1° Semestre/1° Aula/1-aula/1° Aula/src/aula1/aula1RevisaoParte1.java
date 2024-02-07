package aula1;

import java.util.Scanner;

public class aula1RevisaoParte1 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		// entrada de dados
		System.out.print("input --> ");
		n = sc.nextInt();
		
		while (true) { //entra em loop sem precisar usar false, apenas vai entrar em loop -- qq coisa q eu escrever é infinito, aind amais q estou usando 'n' para td
			System.out.print(n + "\t");
			
			//if (n == 1) break; if (n % 2 != 0) n = n * 3 + 1; - mesma maneira de baixo
			if (n == 1) {
				break;
			}
		
			//quado é impar entra aqui, quando e par entra no else, ent ele divide o valor ate ser impar pra entrar no if -- vai até chegar a 1 
			if (n % 2 != 0) { //divisivel por 2 for diferente de 0 - % msm coisa que / - nesse caso
				n = n * 3 + 1;
			}else {
				n = n / 2;
			}

		}

	}                                   

}
