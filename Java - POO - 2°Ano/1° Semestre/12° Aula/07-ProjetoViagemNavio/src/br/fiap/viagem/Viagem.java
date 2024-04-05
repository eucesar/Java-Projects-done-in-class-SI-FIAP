package br.fiap.viagem;

import br.fiap.carga.Carga;

public class Viagem {
	private double capacidade;
	private int index;
	private Carga[] carga;
	
	public Viagem() {
		this.capacidade = 10000;
		this.index = 0;
		this.carga = new Carga[20];		
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
}
