package fiap.venda.modelo;

public class Teste {

	public static void main(String[] args) {

		VendedorDAO dao = new VendedorDAO();
		Vendedor vendedor = new Vendedor(1, "Alcione");
		dao.inserir(vendedor);
		
		System.out.println(dao.pesquisarId(1));
		//ta com erro, ver o dele no teams
		
	}

}
