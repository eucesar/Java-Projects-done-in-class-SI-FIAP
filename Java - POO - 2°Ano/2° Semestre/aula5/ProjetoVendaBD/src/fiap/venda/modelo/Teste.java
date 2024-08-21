package fiap.venda.modelo;

public class Teste {

	public static void main(String[] args) {

		VendedorDAO vendedorDao = new VendedorDAO();
		Vendedor vendedor;
		
		// ---------- inserção de dados na tabeela vendedor
//		vendedor = new Vendedor(7,  "Patrícia Maria");
//		vendedorDao.inserir(vendedor);
//		
		vendedor = new Vendedor(4, "Cesar Iglesias");
		vendedorDao.inserir(vendedor);
//		
		
		// -------- pesquisar pelo ID do vendedor
		System.out.println(vendedorDao.pesquisarId(4));
		
		System.out.println(vendedorDao.lista());
		
	}

}
