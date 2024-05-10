package br.fiap.util;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
	
	public void menu() {
		int opcao;		
		try { //o try se acontecer erro ele para e vai para o cach
		while(true) {
			opcao = parseInt(showInputDialog(gerarMenu())); //se coloca letra n aceita 
			if(opcao == 4) {
				break;
			}
			
			switch(opcao) {
				case 1:
					gerarCirculo();
					break;
				case 2:
					gerarCilindro();
					break;
				case 3:
					listarFigura();
			}
			
		}
	}
    catch (NumberFormatException e) { //o number format se for diferente de tudo
    	showMessageDialog(null, "Vc deve digitar um numero"); //se der erro vai aparecer - o null poder ser qq coisa - Null = nenhuma formatação 
    }
}

	private void listarFigura() {
		// TODO Auto-generated method stub
		
	}

	private void gerarCilindro() {
		// TODO Auto-generated method stub
		
	}

	private void gerarCirculo() {
		// TODO Auto-generated method stub
		
	}

	private Object gerarMenu() {
		String aux = "Escolha uma opção\n";
		aux += "1. Gerar círculo\n";
		aux += "2. Gerar cilindro\n";
		aux += "3. Listar figuras\n";		
		aux += "4. Finalizar\n";
		return aux;
	}
	
}
