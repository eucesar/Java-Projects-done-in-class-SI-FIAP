package aluno;

public class Aluno {

	//encapsulando variavel
	//variavel de referencia
	//referencia
	String nome;
	double p1;
	double p2;
	
	public static void main(String[] args) {
		
		//objeto - quem copia
		// new = novo objeto - construtor - copia as variaveis e inicializa
		Aluno a1 = new Aluno(); //dentro do a1 tem todos os dados, vai armazenar nome - p1 - p2	
		System.out.println(a1); //apenas para mostrar o endereço
		
		a1.nome = "maria";
		a1.p1 = 10;
		a1.p2 = 10;
		
		System.out.println(a1.nome);
		System.out.println(a1.p1);
		System.out.println(a1.p2);
		

	}

}
