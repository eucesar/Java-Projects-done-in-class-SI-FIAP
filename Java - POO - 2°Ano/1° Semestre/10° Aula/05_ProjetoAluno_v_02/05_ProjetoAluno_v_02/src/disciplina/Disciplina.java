package disciplina;
import java.util.Random;


public class Disciplina {
	// variáveis de instância
	private int codigo;
	private String nome;
	private double mediaCheckPoint;
	private double mediaSprint;
	private double notaGlobalSolution;
	
	// construtor
	public Disciplina(String nome, double mediaCheckPoint, double mediaSprint, double notaGlobalSolution) {
		this.codigo = gerarCodigo();
		this.nome = nome;
		this.mediaCheckPoint = mediaCheckPoint;
		this.mediaSprint = mediaSprint;
		this.notaGlobalSolution = notaGlobalSolution;
	}
	
	// método para gerar o código da disciplina
	public int gerarCodigo() {
		Random rd = new Random();
		return rd.nextInt(1000, 10000);
	}
	
	// método para calcular e retornar a média do aluno
	public double calcularMedia() {
		return mediaCheckPoint * 0.2 + mediaSprint * 0.2 + notaGlobalSolution * 0.6; //vezes o peso
	}

	// método para verificar se um aluno está aprovado na disciplina
	public boolean isAprovado() {
		return calcularMedia() >= 6; //vai returnar 'true', se n returna 'false'0
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMediaCheckPoint() {
		return mediaCheckPoint;
	}

	public void setMediaCheckPoint(double mediaCheckPoint) {
		this.mediaCheckPoint = mediaCheckPoint;
	}

	public double getMediaSprint() {
		return mediaSprint;
	}

	public void setMediaSprint(double mediaSprint) {
		this.mediaSprint = mediaSprint;
	}

	public double getNotaGlobalSolution() {
		return notaGlobalSolution;
	}

	public void setNotaGlobalSolution(double notaGlobalSolution) {
		this.notaGlobalSolution = notaGlobalSolution;
	}
	
	

}
