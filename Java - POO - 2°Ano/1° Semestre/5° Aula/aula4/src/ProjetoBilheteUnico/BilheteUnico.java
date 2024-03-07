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
	
}
