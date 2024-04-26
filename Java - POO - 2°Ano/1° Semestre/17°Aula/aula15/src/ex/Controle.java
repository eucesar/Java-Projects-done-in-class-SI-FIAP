package ex;

import java.util.ArrayList;
import java.util.Iterator;

public class Controle {

	private ArrayList<Empregado> lista;
	
	public Controle() {
		lista = new ArrayList<Empregado>();
	}
	
	public void inserir (Empregado empregado) { //vai percorrer a class empregado
		lista.add(empregado); //so vai inserir os empregaods
	}
	
	public Empregado pesquisar(long matricula) { //pesquisa qual matricula
		for(Empregado empregado : lista) { //vai percorrer todos
			if (empregado.matricula == matricula) {
				return empregado; //vai retornar o empregado 
			}
		}
		return null; //tem q retornar fora
	}
	
	public String listar() {
		String aux = "";
		for (Empregado empregado : lista) {
			aux += empregado + "\n";
		}
		return aux;
	}
}
