package ex;

import static javax.swing.JOptionPane.*; //improta o metodo
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;


public class Util {
	private Controle controle;
	
	public Util() {
		controle = new Controle(); //para acessar os metodos
	}
	
	public void menu() {
		int opcao;
		String aux = "Escolha uma opção\n";
		aux += "1. Inserir\n. Pesquisar\n3. Listar\n4. Finalizar";
		
		do {
			//parseInt pega um numero e o outro pega algo
			opcao = parseInt (showInputDialog(aux));
		}while(opcao != 4);
	}
	
}
