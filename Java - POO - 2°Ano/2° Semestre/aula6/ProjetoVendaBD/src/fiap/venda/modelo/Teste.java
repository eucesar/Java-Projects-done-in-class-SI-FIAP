package fiap.venda.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Teste {

	public static void main(String[] args) {

		VendedorDAO vendedorDao = new VendedorDAO();
		VendaDAO vendaDao = new VendaDAO();
		Vendedor vendedor;
		Venda venda;
		
		//----- inserção de dados na tabela
		String dataString = "23/08/2024";
		DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		LocalDate data = LocalDate.parse(dataString, mascara);
		venda = new Venda(123, new  Vendedor(1), 500, null);
		vendaDao.inserir(venda);
		
	
		
	}

}
