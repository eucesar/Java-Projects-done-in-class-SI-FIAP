package br.fiap.viagem;

import br.fiap.carga.Carga;

public class Viagem {
	private double capacidade;
	private int index;
	private Carga[] carga;
	
	public Viagem() {
		this.capacidade = 10000;
		this.index = 0;
		this.carga = new Carga[4];		
	}
	
	// método para reservar uma carga
	public boolean reservar(Carga carga) {
		boolean status = permitidoReservar(carga.getPeso());
		if (status) {
			this.carga[index] = carga;
			index++;
			return true;
		}
		//else
		return false;
	}
	
	// metodo para retornar o peso total reservado
	 public double capacidadeReservada() {
		 double total = 0;
		 //o index n eh vetor ent é so "index"
		 for (int i = 0; i < index; i++) {
			total += carga[i].getPeso(); //VAI SOMAR TODOS OS PESOS DO VETOR CARGAS E ADD TOTAL
		}
		 return total;
	 }
	 
	 // metodo para verificar se uma carga pode ser reservada - não pode passar a capacidade maxima
	 private boolean permitidoReservar(double peso) {
		 return index < carga.length && capacidadeReservada() + peso <= capacidade;
	 }
	 
	// método para pesquisar um CNPJ
	 // RETORNA UM PEDAÇO DO VETOR DE CARGA
	 public Carga pesquisar(int cnpj) {
		 int posicao = pesquisarAux(cnpj);
		 if (posicao != -1) {
			return carga[posicao];
		}
		return null; //se n achar nd
	 }
	 
	 //método para cancelar uma reserva
	 public boolean cancelar(int cnpj) {
		 int posicao = pesquisarAux(cnpj);
		 if (posicao != -1) { // -1 pq se o cpg n existir returna -1 = diferente do cpf pesquisado
			for (int i = posicao; i < index - 1; i++) { //vai voltar 1 para depois somar um e ficar em cima da posição que preciso
				carga[i] = carga[i + 1];
			}
			index--; 
			return true;
		}
		 return false;
	 }
	 
	 //método auxiliar para percorrer o vetor procurando por um cnpj
	 public int pesquisarAux(int cnpj) {
		 for (int i = 0; i < index; i++) {
			if (carga[i].getCliente().getCnpj() == cnpj) {
				return i;
			}
		}
			//vai retornar null igual em cima
			return -1;
	 }

	public String listar() {
		String dados = "";
		for (int i = 0; i < index; i++) {
			dados += carga[i].getDados() + "\n\n";//soma string = concatenar
		}
		return dados;
	}
}
