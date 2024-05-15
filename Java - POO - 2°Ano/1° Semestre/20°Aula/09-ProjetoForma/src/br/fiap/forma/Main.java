package br.fiap.forma;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		//herança multipla - 2 super n existe no java
		ArrayList<Forma> lista = new ArrayList<>(); //criando um array [] para o Forma e seus filhos
		lista.add(new Circulo(1, 1, 2)); //add Forma ou abaixo de forma
		lista.add(new Cilindro(2, 1, 3, 4));
		lista.add(new Circulo(2, 2, 2));
		
		for (Forma forma : lista) { //vai percorrer todo o array
			System.out.println(forma);
			System.out.println("Área = " + forma.calcularArea() + "\n");
			if (forma instanceof Volume) { //sininimo para objeto - intancia - vc recebe volume e dps vc imprime volume -  
				//Volume – como esta intancinado volume, ele altomaticamente pega recebendo a class Cilindro 
				Volume aux = (Volume) forma; //para acessar o Cilindro mas para isso tenbho que converter que o Clilindro seja cabe no forma como = (int) double - serve para acessar os metodos que estão no filhho - ja que o metodo não esta como "abstrato" - mas esta especifico no Cilindro
				System.out.println("volume = " + aux.calcularVolume());
			}
			System.out.println();
		}
		
	}

}
