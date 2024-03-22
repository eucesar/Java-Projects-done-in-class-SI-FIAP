package aluno;
import java.util.*;
import disciplina.Disciplina;

public class Aluno {
	// variáveis de instância
	private String nome; //coloco como private pq n altera - e consigo acessar o arquivo no main em 'aluno[0].'
	private int rm;
	private Disciplina[] disciplina; //entra n o arquivo disciplina

	// método construtor
	public Aluno(String nome, Disciplina[] disciplina) {
		//this.rm = gerarRM(); - tinha o rm aqui
		this.nome = nome;
		this.disciplina = disciplina;
		
	}

	// método para gerar o valor do RM do aluno - n usamos pra nada
	private int gerarRM() {
		Random rd = new Random();
		return rd.nextInt(20000, 100000);
	}
	
	// método de acesso
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public Disciplina[] getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina[] disciplina) {
		this.disciplina = disciplina;
	}

	
	
}
