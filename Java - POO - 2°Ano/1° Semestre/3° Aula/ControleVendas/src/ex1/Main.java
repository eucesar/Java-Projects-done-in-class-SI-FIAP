package ex1;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Random rd = new Random();
		Produto produto = new Produto(); //so coloca como obj no main
		Cliente cliente = new Cliente();
		NotaFiscal nota = new NotaFiscal();
		
		//dados do cliente
		System.out.print("Nome: ");
		cliente.nome = in.nextLine();
		System.out.print("Cpf: ");
		cliente.cpf = in.nextInt();
		
		//dados do produto
		produto.codigo = rd.nextInt(1000, 10000);
		in.nextLine(); //coloco o nextLine pq n esta conseguindo colocar no de baixo - se uso nextLine no começo quando vem antes de um INT - ent fica INT DPS STRING, DAI EU LIMPO E TECLADO - SE FOR INT STRING STRING - eu so limpo o teclado na 1° - agora INT STRING INT STRING - tenho q limpar o teclado em todos as sitrings
		System.out.print("Produto: ");
		produto.descricao = in.nextLine();
		System.out.print("Preço unitario: R$ ");
		produto.preco = in.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.qtdEstoque = in.nextInt();
		
		// dados da nota fiscal
		System.out.print("Data da venda: ");
		nota.data = in.next();
		System.out.print("Quantidade comprada: ");
		nota.qtdVendida = in.nextInt();
		
		nota.cliente = cliente; //mandando td q a gente fz para a nota - puxando objeto e definindo alterações - mandando tudo
		nota.produto = produto;
		
		System.out.println("Cliente --> " + nota.cliente.nome);
		System.out.println("Produto --> " + nota.produto.descricao);
		System.out.println("Valor Total --> R$ " + nota.calcularTotal());


		 
		
	}

}
