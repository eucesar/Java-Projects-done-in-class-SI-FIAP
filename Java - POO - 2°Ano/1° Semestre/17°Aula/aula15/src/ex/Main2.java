package ex;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		//instancia o array novamente
		ArrayList<Empregado> lista = new ArrayList<>();
		
		lista.add(new EmpregadoHorista("Patricia", 100, 160, 250));
		lista.add(new EmpregadoComissionado("Israel", 200, 350000, 20));
		lista.add(new EmpregadoHorista("Age", 300, 160, 150));
		lista.add(new EmpregadoHorista("Xuxa", 400, 50000, 15));
		
		// impressão dos dados usando o for tradicional
		//lista.size() tamanho total do array
		//lista.get(i) - vai pegar item da lsita por item da lista e passando por i somando 0 + 1 + 1... vai emprimir todo o array
		for (int i = 0; i < lista.size(); i++) {
			Empregado aux = lista.get(i);
			System.out.println(aux);
			System.out.println();
		}
		
		// impressão dos dados usando o for each
		//vai percorrer todo o array
		for (Empregado empregado : lista) {
			System.out.println(empregado); //a ausencia de qq metodo e impressão da super classes faz com que ele imprima a superclass()
			System.out.println();
		}
	}

}
