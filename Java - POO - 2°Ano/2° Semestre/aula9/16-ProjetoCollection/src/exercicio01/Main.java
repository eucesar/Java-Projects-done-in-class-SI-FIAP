package exercicio01;

public class Main {
	public static void main(String[] args) {
		
		Gerenciador g = new Gerenciador();
		g.inserir(new Aluno("Marcelo", 18, 10));
		g.inserir(new Aluno("Selmini", 48, 1));
		g.inserir(new Aluno("Gertrude", 24, 8));

		g.imprimirOrdemAlfabetica();
		
		System.out.println();
		g.imprimirOrdemIdade();
		
		System.out.println();
		g.imprimirOrdemMedia();
		
	}
}
