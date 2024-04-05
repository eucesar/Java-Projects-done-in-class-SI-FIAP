package br.fiap.util;

import static javax.swing.JOptionPane.*;
//pra quando o usuario digitar transfomar a string para int ou double - integer de inverter
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {

	
	public void menu() {
	int opcao;
	String aux = "Reserva de Cargas Boa Viagem \n";
	aux += "1. Reservar\n";
	aux += "2. Pesquisar \n";
	aux += "3. Listar \n";
	aux += "4. Capacidade reservada \n";
	aux += "5. Cancelar \n";
	aux += "6. Finalizar \n";
	
	 do {
		 //ele vai armazenar uma string e mudar para int ou double
		 opcao = parseInt(showInputDialog(aux));
		 if (opcao < 1 || opcao > 6) {
			 showMessageDialog(null, "Opção Inválida");
		 }
	 }while(opcao != 6);

 }
	
}
