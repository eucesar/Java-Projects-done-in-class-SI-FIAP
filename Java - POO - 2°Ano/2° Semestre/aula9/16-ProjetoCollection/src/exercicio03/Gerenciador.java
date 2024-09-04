package exercicio03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gerenciador {
	private Map<String, List<Produto>> lista = new HashMap<String, List<Produto>>();

	public void inserir(Produto produto) {
		lista.computeIfAbsent(produto.getCategoria(), k -> new ArrayList<Produto>()).add(produto);
	}
	
	public void imprimirProdutoPorCategoria(String categoria) {
		List<Produto> aux = lista.get(categoria);
		aux.forEach(produto -> {
			System.out.println(produto);
		});
	}
}
