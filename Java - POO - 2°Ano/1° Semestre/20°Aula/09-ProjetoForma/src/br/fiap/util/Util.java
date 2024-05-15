package br.fiap.util;

import static java.lang.Integer.parseInt;
//tem que importar double
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import br.fiap.forma.Cilindro;
import br.fiap.forma.Circulo;
import br.fiap.forma.Forma;
import br.fiap.forma.Volume;

public class Util {
	
	//nesse caso uso atalho de tecla
	//control + shift + o -- ele importa o 'forma' - coloca
	//control + shift + m -- ele insire
	private List<Forma> lista = new ArrayList<>(); //vai crescendo quando vai adicionando coisa
	
	public void menu() {
		int opcao;		
		while(true) { //o try se acontecer erro ele para e vai para o cach
		try {
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
		 catch (NumberFormatException e) { //o number format se for diferente de tudo
		    	showMessageDialog(null, "Vc deve digitar um numero"); //se der erro vai aparecer - o null poder ser qq coisa - Null = nenhuma formatação 
	   }
    }
}

	private void listarFigura() {
		DecimalFormat mascara = new DecimalFormat("0.00"); //vai tirar as casas decimais
		String aux = "";
		for (Forma forma : lista) {
			aux += forma;
			aux += "área = " + forma.calcularArea() + "\n";
			if (forma instanceof Volume) {
				 Volume volume = (Volume) forma;
				 aux += "Volume = " + mascara.format(volume.calcularVolume()) + "\n";
			}
		}
		
		showMessageDialog(null, aux);
	}

	private void gerarCilindro() {
		int cx = parseInt(showInputDialog("cordenada x"));	//parse int converte para tudo texto
		int cy = parseInt(showInputDialog("cordenada y"));		
		double raio = parseDouble(showInputDialog("raio"));	
		double altura = parseDouble(showInputDialog("altura"));	
		//tem que importar o "cilindro"
		lista.add(new Cilindro(cx,cy,raio, altura));
	}

	private void gerarCirculo() {
		int cx = parseInt(showInputDialog("cordenada x"));	//parse int converte para tudo texto
		int cy = parseInt(showInputDialog("cordenada y"));		
		double raio = parseDouble(showInputDialog("raio"));	
		lista.add(new Circulo(cx,cy,raio));

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
