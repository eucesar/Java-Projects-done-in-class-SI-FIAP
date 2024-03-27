package br.fiap.cliente;

public class Cliente {

	private int cnpj;
	private String cliente;
	
	public Cliente(String cliente, int cnpj) {
		this.cnpj = cnpj;
		this.cliente = cliente;
	}

	public String getDados() {
		//um sysout
		return cnpj + "\n" + cliente;
	}
	
	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}
