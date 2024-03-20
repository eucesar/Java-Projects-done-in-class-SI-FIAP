package aluno;
import java.util.*;
import disciplina.Disciplina;

public class Aluno {
	// variáveis de instância
	private String nome; //coloco como private pq n altera - e consigo acessar o arquivo no main em 'aluno[0].'
	private int rm;
	private Disciplina[] disciplina;

	// método construtor
	public Aluno(String nome, Disciplina[] disciplina) {
		//this.rm = gerarRM(); - tinha o rm aqui
		this.nome = nome;
		this.disciplina = disciplina;
		
	}

	// método para gerar o valor do RM do aluno
	private int gerarRM() {
		Random rd = new Random();
		return rd.nextInt(20000, 100000);
	}

}
