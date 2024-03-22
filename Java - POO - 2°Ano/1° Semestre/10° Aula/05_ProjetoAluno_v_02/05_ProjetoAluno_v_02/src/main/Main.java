package main;

import aluno.Aluno;
import disciplina.Disciplina;

public class Main {
	public static void main(String[] args) {
		
		Aluno[] aluno = new Aluno[3];
		Disciplina[] disciplina = new Disciplina[2];
		
		//aluno 1
		disciplina = new Disciplina[2]; //eu coloco o endereçamento NOVO objeto - novo endereçamento de memoria - NOVO VETOR sem precisar criar um por um
		disciplina[0] = new Disciplina("POO", 2, 8, 2); //disciplina 0 e 1 fica dentro do aluno 0 - sobrepor
		disciplina[1] = new Disciplina("Estatística", 10, 7, 5);
		aluno[0] = new Aluno("Selmini", disciplina); //quando vai no 'displina' ele acessa outro .java e preenche, sobrepoem
		
		//aluno 2
		disciplina = new Disciplina[2];
		disciplina[0] = new Disciplina("Sensores", 10, 10, 10);
		disciplina[1] = new Disciplina("WEB", 0, 0, 2);
		aluno[1] = new Aluno("Roberto Matias", disciplina);
		
		//aluno 3
		disciplina = new Disciplina[2];
		disciplina[0] = new Disciplina("Fluter", 10, 10, 10);
		disciplina[1] = new Disciplina("Microsserviços", 0, 0, 2);
		aluno[2] = new Aluno("Ricardo", disciplina);
		
		// listagem dos alunos e suas disciplinas
		for (int i = 0; i < aluno.length; i++) { // 3 alunos 
			System.out.println(aluno[i].getNome());
			Disciplina[] aux = aluno[i].getDisciplina(); //pra ficar mais bonito e menor, mas pode escrever dentro
			for (int j = 0; j < aux.length; j++) { // pegar o total de disciplina
				System.out.println(aux[j].getNome()); //desa maneira pego a disciplina - tem q ser vetor de 'j' - pq tem q estar em vetor, se n so pega um elemento especifico e depois o outro especifico como [0], ent pega um dps o outro, dps le em o proximo, lembrando a leitura de baixo para cima em algoritmo.
				System.out.println(aux[j].calcularMedia());
				System.out.println("Aprovado: " + aux[j].isAprovado());
			}
			System.out.println(); //pular linha de cada aluno
		}
		
	}
}
