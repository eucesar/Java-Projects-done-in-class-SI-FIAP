package exercicio03;

public class Main {
	public static void main(String[] args) {
		
		Gerenciador g = new Gerenciador();
		
		g.inserir(new Produto("arroz", "alimento"));
		g.inserir(new Produto("sabão", "limpeza"));
		g.inserir(new Produto("batata", "alimento"));
		
		g.imprimirProdutoPorCategoria("bebida");

	}
}
