package exercicio03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Gerenciador {

	//k => vem de chave - key
	//v => value = valor
	//localizar elemento
	private Map<String, List<Produto>> lista = new HashMap<String, List<Produto>>();
	
	public void inserir(Produto produto) {
		//1° null - 1° valor da chave
		//2° null - 
		//metodo anonimo - ele que faz todo os calculos para retornar oq estou procurando
		//k -> -- percorre o mapa e se encontra a categoria pega a lsita q tem na categoria, ele cria a categoria e adicona na lista
		// cria o arrayList - programação funcional == o nome da setinha é lambida
		lista.computeIfAbsent(produto.getCategoria(), k -> new ArrayList<Produto>()).add(produto);
	}
	
	public void imprimirProdutoPorCategoria(String categoria) {
		List<Produto> aux = lista.get(categoria);
		aux.forEach(produto -> {
			System.out.println(produto);
		});
	}
	
}
