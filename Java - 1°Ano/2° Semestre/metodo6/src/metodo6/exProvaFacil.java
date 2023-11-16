package metodo6;

import java.util.Scanner;

public class exProvaFacil {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		  int qtdproduto;
		  
		  System.out.print("Total de produtos --> ");
		  qtdproduto = sc.nextInt();
		  
		  String[] nome = new String[qtdproduto];
		  double[] out22 = new double[qtdproduto];
		  double[] out23 = new double[qtdproduto];
		  double[] porc = new double[qtdproduto];
		  
		  //entrada de dados--> item a
		  lerDados(nome,out22,out23,porc);
		  
		  //metodo para imprimir os dados no console//--> item b 
		  imprimir(nome,out22,out23,porc);
		  
		  //metodo para imprimir o produto com maior alta --> item c
		  maioralta(nome,out22,out23,porc);
		  menoralta(nome,out22,out23,porc);



		}
		public static void menoralta(String[] nome, double[] out22, double[] out23, double[] porc) {
			double menor=Double.MAX_VALUE;
			int index=0;
			for (int i = 0; i < nome.length; i++) {
				if (porc[i] < menor) {
					menor=porc[i];
					index=i;
				}
			}
			
			System.out.println("Produto com a menor alta = " + nome[index]) ;
			
		}
		public static void maioralta(String[] nome, double[] out22, double[] out23, double[] porc) {
			double maior =Double.MIN_VALUE;
			int index=0;
			for (int i = 0; i < nome.length; i++) {
				if(porc[i] > maior) {
					maior=porc[i];
					index=i;
					
				}
				
			
			}
			
			System.out.println("\nProduto com a maior alta = " + nome[index]);
			
		}
		public static void imprimir(String[] nome, double[] out22, double[] out23, double[] porc) {
			
			for (int i = 0; i < nome.length; i++) {
				System.out.print(nome[i]+ "\t");
				System.out.print(String.format("%.2f", out22[i])+ "\t");
				System.out.print(String.format("%.2f", out23[i])+ "\t");
				System.out.println(String.format("%.2f", porc[i])+ "%");



			}
		}
		//metodo para entrada de dados//

		private static void lerDados(String[] nome, double[] out22, double[] out23, double[] porc) {
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < nome.length; i++) {
				System.out.print("Nome do produto---> ");
				nome[i]=sc.nextLine();
				System.out.print("Preço e, outubro de 2022 --> ");
				out22[i]=sc.nextDouble();
				System.out.print("Preço e, outubro de 2023 --> ");
				out23[i]=sc.nextDouble();
				sc.nextLine();
				
				//calculo da porcentagem 
				porc[i] = (out23[i]-out22[i])/out22[i]*100;
				System.out.println();
			}
			
		}
		
	}


