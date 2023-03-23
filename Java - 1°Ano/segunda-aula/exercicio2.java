import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaração de variaveis
		double  area, perimetro,base,altura;
		Scanner teclado = new Scanner(System.in);
		
		// Entrada de dados
		 System.out.println("Base-->");
		 base= teclado.nextDouble();
		 System.out.println("Altura--->");
		 altura= teclado.nextDouble();
		 
		 // processamento de dados 
		 area = (base*altura);
		 //pode fazer = 2*basse + 2*altura
		 perimetro = 2*(base + altura);
		 
		 
		 // Saida de dados
		 System.out.println("area = "+ area);
		 System.out.println("perimetro = " + perimetro);

	}

}
