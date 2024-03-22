package credo;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		String nome;
		int idade;
		
		nome = JOptionPane.showInputDialog("Qual seu nome ?");
		idade = Integer.parseInt(JOptionPane.showInputDialog("idade")); //No integer eu troco para valor e transformo em int 
		
		//JOptionPane.showMessageDialog(null, nome); - msg de aviso
	}

}
