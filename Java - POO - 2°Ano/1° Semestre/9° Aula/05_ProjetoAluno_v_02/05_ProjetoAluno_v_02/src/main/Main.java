package main;

import aluno.Aluno;
import disciplina.Disciplina;

public class Main {
	public static void main(String[] args) {
		
		Aluno[] aluno = new Aluno[3];
		Disciplina[] disciplina = new Disciplina[2];
		
		//aluno 1
		disciplina[0] = new Disciplina("POO", 2, 8, 2); //disciplina 0 e 1 fica dentro do aluno 0 - sobrepor
		disciplina[1] = new Disciplina("Estatística", 10, 7, 5);
		aluno[0] = new Aluno("Selmini", disciplina); //quando vai no 'displina' ele acessa outro .java e preenche, sobrepoem
		
		//aluno 2
		disciplina[0] = new Disciplina("Sensores", 10, 10, 10);
		disciplina[1] = new Disciplina("WEB", 0, 0, 2);
		aluno[1] = new Aluno("Roberto Matias", disciplina);
		
		//aluno 3
		disciplina[0] = new Disciplina("Fluter", 10, 10, 10);
		disciplina[1] = new Disciplina("Microsserviços", 0, 0, 2);
		aluno[2] = new Aluno("Ricardo", disciplina);
		
		aluno[0]. //parou aqui
	}
}
