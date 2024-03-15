import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int total;
		String nome;
		double nota1, nota2, nota3;
		
		System.out.print("Qual o total de alunos? ");
		total = in.nextInt();
		//new e contrutor da classe() -- se n tem n é obj
		Aluno[] aluno = new Aluno[total];
		
		// entrada de dados
		for (int i = 0; i < aluno.length; i++) {
			in.nextLine(); //tem q estar no começo pq lê o de cima como string
			System.out.print("nome --> ");
			nome = in.nextLine();
			System.out.print("nota 1 --> ");
			nota1 = in.nextDouble();
			System.out.print("nota 2 --> ");
			nota2 = in.nextDouble();
			System.out.print("nota 3 --> ");
			nota3 = in.nextDouble();
			
			aluno[i] = new Aluno(nome, nota1, nota2, nota3);
			System.out.println();
			
			
		}
		
		// item a --> impressão da quantidade de aprovados e reprovados
		imprimir(aluno);
		
		// item b --> impressão dos alunos em ordem decrescente de média
		// arrays.sort = ele ordena 
		//Arrays.sort(aluno); - como se fosse
		imprimirListagem(aluno);
		
	}

	private static void imprimirListagem(Aluno[] aluno) {
		
		Aluno aux;
		
		for(int j = 0; j < aluno.length; j++) {
			//coloco o '-1' para n estourar o valor maximo - foto no onenote
			for (int i = 0; i < aluno.length - 1; i++) {
				//somo o 'i+1' para fazer isso com o proximo - e como em cima esta '-1', n estoura o valor
				if (aluno[i].calcularMedia() < aluno[i+1].calcularMedia()) {
					
					//invertendo dados
					aux = aluno[i];
					aluno[i] = aluno[i+1];
					aluno[i+1] = aux;
				}
			}
		}
		
		//jeito simples de usar oq estava em cima - só para emprimir
		for(Aluno a : aluno) {
			System.out.println("Decrescente --> ");
			System.out.println(a.nome);
		}
	}

	private static void imprimir(Aluno[] aluno) {
		int totalAprovado = 0;
		for (int i = 0; i < aluno.length; i++) {
			if (aluno[i].isAprovado()) { //n preciso colocar == true - pq só vai retornar true, mas se eu colocasse um else dai no else retorna false.
				totalAprovado++;
			}
		}
		System.out.println("total de aprovados --> " + totalAprovado);
		System.out.println("total de reprovados --> " + (aluno.length - totalAprovado)); //o resto é o reprovado
	}

}
