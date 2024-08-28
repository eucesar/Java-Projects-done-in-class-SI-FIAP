package fiap.venda.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		
		VendedorDAO vendedorDao = new VendedorDAO();
		VendaDAO vendaDao = new VendaDAO();
		Vendedor vendedor;
		Venda venda;
		
		// -------- inserção de dados na tabela vendedor
//		vendedor = new Vendedor(5, "Patrícia Maria");
//		vendedorDao.inserir(vendedor);
//		
//		vendedor = new Vendedor(6, "Alexandre Augusto");
//		vendedorDao.inserir(vendedor);
		
		// -------- inserção de dados na tabela venda
		String dataString = "23/08/2024";
		DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data = LocalDate.parse(dataString, mascara);
		
		//venda = new Venda(550, new Vendedor(20), 6000, data);
		//vendaDao.inserir(venda);
		
		// ----------- pesquisa pelo ID do vendedor
		//System.out.println(vendedorDao.pesquisarId(4));
		
		//System.out.println(vendedorDao.lista());
		
		List<Venda> lista = vendaDao.totalPorVendedor();
		for (Venda v : lista) {
			System.out.println(v.getVendedor().getNome() + " -- " + v.getTotal());
		}

	}
}
