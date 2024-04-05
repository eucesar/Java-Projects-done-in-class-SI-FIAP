package br.fiap.util;

import static javax.swing.JOptionPane.*;

import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;
import br.fiap.viagem.Viagem;

//pra quando o usuario digitar transfomar a string para int ou double - integer de inverter
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {

	Viagem viagem = new Viagem();
	
	
	public void menu() {
	int opcao;
	String aux = "Reserva de Cargas Boa Viagem \n";
	aux += "1. Reservar\n";
	aux += "2. Pesquisar \n";
	aux += "3. Listar \n";
	aux += "4. Capacidade reservada \n";
	aux += "5. Cancelar \n";
	aux += "6. Finalizar \n";
	
	int peso;
	
	 do {
		 //ele vai armazenar uma string e mudar para int ou double
		 opcao = parseInt(showInputDialog(aux));
		 if (opcao < 1 || opcao > 6) {
			 showMessageDialog(null, "Opção Inválida");
		 }
		 else {
			switch(opcao) {
			   case 1 :
				   reservar();
				   break;
			   case 2 :
				   pesquisar();
				   break;
			   case 4 :
				   capacidade();
				   break;
			}
		}
	 }while(opcao != 6);

 }
	
	private void pesquisar() {
		int cnpj = parseInt(showInputDialog("cnpj"));
		Carga carga = viagem.pesquisar(cnpj);
		//se não der ruim
		if (carga != null) {
			showMessageDialog(null, carga.getDados());
		}
	}
	
	private void capacidade() {

		showMessageDialog(null, viagem.capacidadeReservada());
	}

	private void reservar() {
		int cnpj;
		String destino, cliente;
		
		cnpj = parseInt(showInputDialog("CNPJ"));
		destino = showInputDialog("Destino");
		cliente = showInputDialog("Cliente");
		
		Cliente client = new Cliente(cnpj, cliente);
		Carga carga = new Carga(destino, client);
		
		if (viagem.reservar(carga)) {
			showMessageDialog(null, "Carga reservada com sucesso");
		}
		else {
			showMessageDialog(null, "Entre em contato, não foi reservada");
		}
	}
	
	
}
