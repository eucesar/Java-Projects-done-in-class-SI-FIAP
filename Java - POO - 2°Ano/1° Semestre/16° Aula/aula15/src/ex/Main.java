package ex;

public class Main {

	public static void main(String[] args) {

		
		Empregado[] empregado = new Empregado[4]; //4 empregadp
		
		empregado[0] = new EmpregadoHorista("Patricia", 100, 160, 250);
		empregado[1] = new EmpregadoComissionado("Israel", 200, 350000, 20);
		empregado[2] = new EmpregadoHorista("Age", 300, 160, 150);
		empregado[3] = new EmpregadoHorista("Xuxa", 400, 50000, 15);
	
		//vai da 1° a ultima
		for (Empregado e : empregado) {
			System.out.println(e);
		}
		
	}

}
