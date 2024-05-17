package br.fiap.cargo;

import br.fiap.venda.Comissao;

//classe privada para varivaies totalemtne privadas 
//tem que colcoar todos os ENUM criandos preenchidos
//implemente a comissao para pegar a assinatura da comissao
public enum Cargo implements Comissao{
	ATENDENTE{
		public double calcularComissao(double valor){
			return valor * 0.10;
		}
	}, 
	
	VENDEDOR{
		public double calcularComissao(double valor){
			return valor * 0.15 + 5;
		}
	}, 
	
	GERENTE	{
	public double calcularComissao(double valor){
		
		return valor * 0.20 + 10;
	  }
	};
	
}

