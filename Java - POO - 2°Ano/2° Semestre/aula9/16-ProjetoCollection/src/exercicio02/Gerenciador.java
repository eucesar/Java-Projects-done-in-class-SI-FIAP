package exercicio02;

import java.util.HashSet;
import java.util.Set;

public class Gerenciador {
	
	//igual lista so que n pode repetir, chave primaria(tipo isso), n tem ordem de inserção 
	//n repete valor e n deixa um de baixo do outro
	//o hash faz um calculo de resto de divisão, isso serve para busca de dadaos, pego um valor e divido pela quantidade de lementos inseridos dentro do indice, e vai dar um valor de indice aonde ele é alocado
	// hash - indicardor unico, mesmo com nome igual eu adiciono outro index, mesma coisa do cpf, mesmo nome mas cpf diferente
	private Set<Participante> lista = new HashSet<Participante>();
	
	public void inserir(Participante participante) {
		lista.add(participante);
	}
	
	public void imprimir() {
		lista.forEach(participantes -> {
			System.out.println(participantes);
		});
	}
}
