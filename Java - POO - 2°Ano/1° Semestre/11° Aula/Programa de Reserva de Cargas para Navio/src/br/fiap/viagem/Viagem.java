package br.fiap.viagem;

import br.fiap.carga.Carga;

public class Viagem {

	private double capacidade;
	private int index;
	private Carga[] carga; //importar carga e colcar em vetor - pq tem mais de 1 carga
	
	public Viagem(double capacidade, int index, Carga[] carga){
		this.capacidade = capacidade;
		this.index = 0; //ex pediu
		this.carga = new Carga[20]; //20, pediu - new pq tem q acessar o objeto sendo um vetor agora
	}
	
	
	
}
