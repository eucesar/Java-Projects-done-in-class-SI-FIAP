package exercicio01;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class Gerenciador {

	private List<Aluno> lista = new LinkedList<Aluno>();
	
	//pra inserir tem q ser na ordem do metodo cosntrutor
	public void inserir(Aluno aluno) {
		lista.add(aluno); //criando uma lista para a class Aluno, pode ter varias listas agora
	}
	
	public void imprimirOrdemAlfabetica() {
		Collections.sort(lista); //sort em ordem alfabetica, por conta que vou inserir String
		lista.forEach(aluno -> { //somente para iumprir tds os alunos ordenados por conta de cima
			System.out.println(aluno);
		});
	}
	
	public void imprimirOrdemIdade() {
		lista.sort(Comparator.comparing(Aluno::getIdade)); //vai passar por todo o aluno e pegar a idade e ordenar por idade
		lista.forEach(aluno -> { //imprimir
			System.out.println(aluno);
		});
	}
	
	public void imprimirOrdemMedia() {
		lista.sort(Comparator.comparing(Aluno::getMedia)); 
		lista.forEach(aluno -> { //imprimir
			System.out.println(aluno);
		});
	}
	
	
}
