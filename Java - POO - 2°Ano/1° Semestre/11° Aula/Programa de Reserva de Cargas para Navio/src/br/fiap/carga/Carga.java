package br.fiap.carga;

import java.util.Random;

import br.fiap.cliente.Cliente;

public class Carga {
	private int id;
	private String destino; 
	private double peso;
	private Cliente cliente;
	
	
	public Carga(String destino, Cliente cliente) {
		this.destino = destino;
		this.cliente = cliente;
		this.id = gerarId();
		this.peso = gerarPeso();
	}


	private double gerarPeso() {
		Random rd = new Random();
		return rd.nextDouble(1000, 3000);
	}


	private int gerarId() {
		Random rd = new Random();
		return rd.nextInt(1000, 10000);
	}
	//eu n dou um get e set ID, pq q vou informar para o cliente o ID/chave primaria - para buscar dados do cliente seria o cnpj
	
	public String getDados() {
		return destino + "\n" + peso + "\n" + cliente.getDados();
	}

	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	
	
	

}
