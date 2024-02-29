package ex1;

public class NotaFiscal {

	// variaveis de instancia - lugar apenas para declaram n manipular
	String data;
	int qtdVendida;
	Cliente cliente;
	Produto produto;
	
	//metodo para calucular e retornar o total na nota fiscal
	public double calcularTotal() {
		return qtdVendida * produto.preco;
	}
	
}
