package br.fiap.util;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
	
	public void menu() {
		int opcao;		
		
		while(true) {
			opcao = parseInt(showInputDialog(gerarMenu()));
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
