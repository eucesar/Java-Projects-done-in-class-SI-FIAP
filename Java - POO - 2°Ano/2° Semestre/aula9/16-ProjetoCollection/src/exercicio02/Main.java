package exercicio02;


public class Main {
	public static void main(String[] args) {
		
		Gerenciador g = new Gerenciador();
		g.inserir(new Participante("ABC", "abc@fiap.com"));
		g.inserir(new Participante("geronimo", "geronimo@fiap.com"));
		g.inserir(new Participante("selmini", "selmini@fiap.com"));
		g.inserir(new Participante("ABC", "abc@fiap.com")); //inserir o mesmo elemento n da certo, por conta do metodo hash em participantes e pela logica de aplicação do hash em gerenciador 

		
		g.imprimir();
	}
}
