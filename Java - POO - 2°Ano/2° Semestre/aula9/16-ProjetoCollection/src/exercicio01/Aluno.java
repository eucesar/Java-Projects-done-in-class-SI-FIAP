package exercicio01;

import java.util.Collections;

//implementes, quero que o aluno seja comaparavel - por conta do Collections.sort();, q serve para separar em ordem alfabetica
public class Aluno implements Comparable<Aluno>{
	private String nome;
	private int idade;
	private double media;
	
	public Aluno(String nome, int idade, double media) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.media = media;
	}
	
	@Override
	public String toString() {
		return nome + " -- " + idade + " -- " + media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	//metodo de comparade - quando ponho o 'implementes' e dps oq quero ele pede para criar uma metodo no "Aluno", ent crio esse
	// compareTO, ele compara com o padrão sendo verdadeiro ou falso
	@Override
	public int compareTo(Aluno aluno) {
		return nome.compareTo(aluno.nome);
	}	
}
