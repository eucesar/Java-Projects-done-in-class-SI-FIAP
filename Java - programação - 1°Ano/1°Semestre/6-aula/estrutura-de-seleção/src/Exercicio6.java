import java.util.Scanner;

public class Exercicio6 {

	/*dados primitivos 
	 
	 inteiros e real = foto no cell
	 
	*/ 
	
	public static void main(String[] args) {
	
		//var
		Scanner teclado = new Scanner(System.in);
		String nome; 
		//string =>
		//next = n armazena espaço so oq eu coloquei antes de dar espaço - nome n composto - henzo henrique
		//nextline = armazena TD que está na linha, qq coisa - armazena nome composto - da mt problema - se eu dou um espaço sem querer na hora de colocar o valor do INT ele armazena o espaço
		
		int idade;
		
		//valor
		
		System.out.print("Qual sua idade?: ");
		idade = teclado.nextInt();
		
		teclado.nextLine(); //para n armazenar nenhum espaço que o usuario pode ser que coloque na idade, oq o nextLine armazena TD
		
		System.out.print("Qual seu nome?: ");
		nome = teclado.nextLine(); //vai escrever contabilizar TD q foi digitado na linha
		
		
		//valor
		if (idade >= 18 ) {
			System.out.println(nome + " eh adulto");
		}else {
			System.out.println(nome + " não é adulto");}
		
		if (idade >= 18 ){
			System.out.println("voce e adulto");
		}if (idade <= 14) {
			System.out.println("voce eh adolecente");
		}if (idade <= 10) {
			System.out.println("voce eh criança");
		}if (idade == 1) {
			System.out.println("voce eh recem nascido");
		}
		
	}

}
