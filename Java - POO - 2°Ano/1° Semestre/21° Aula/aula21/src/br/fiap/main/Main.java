package br.fiap.main;

import br.fiap.cargo.Cargo;
import br.fiap.funcionario.Funcionario;
import br.fiap.venda.Venda;

public class Main {

	public static void main(String[] args) {

		//tenho que sempre importar a classe
		Funcionario funcionario = new Funcionario("Ana", 1000, Cargo.ATENDENTE);
		Venda venda = new Venda(funcionario, 1000);
		System.out.println(venda.CalcularComicao()); //vai ternornar so a comissao
	}

}
