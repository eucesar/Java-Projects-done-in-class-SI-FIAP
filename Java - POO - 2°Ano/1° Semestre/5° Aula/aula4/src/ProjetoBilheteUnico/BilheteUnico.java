package ProjetoBilheteUnico;

import java.util.Random;

public class BilheteUnico {

	Usuario usuario;
	Tarifa tarifa;
	int numero;
	double saldo;
	
	//contrutor n pode ter tipo - void e etc
	// colcando as clases e variaveis
	//seto os valores q eu vou usar e random e td, e classes tbm
	public BilheteUnico(Usuario usuario, Tarifa tarifa) {
		Random rd = new Random();
		this.numero = rd.nextInt(1000, 10000);
		this.saldo = 0; //0 valor inicial apenas da conta antes de colocar qq valor
		this.usuario = usuario;
		this.tarifa = tarifa;
	}
	
	//método para carregar o bilhete com um valor informado 
	public void carregarBilhete(double valor) {
		this.saldo += valor;
	}
	
	// método para consultar o valor do saldo
	public double consultarSaldo() {
		return this.saldo;
	}
	
	// método para simular a passagem na catraca
	public void passarNaCatraca() {
		if(tarifa.tipoTarifa.equalsIgnoreCase("comum")) {
			if (saldo >= Tarifa.tarifaBase) {
				saldo -= Tarifa.tarifaBase;
			}
		}
		else {
			if (saldo >= Tarifa.tarifaBase * 0.5) {
				saldo -= Tarifa.tarifaBase * 0.5;
			}
		}
	}
}
