import java.util.Scanner;

public class pexercicio10 {
    public static void main(String[] args) {
    	
    	//em reação = /
    	//precentual = mutiplicar por 100 no final
    	
    	//var - fomrula
    	int totalEleitores;
    	double percentualVotosValidos,  percentualVotosA, percentualVotosB, percentualVotosC, percentualVotosNulos, percentualVotosBranco; 
    	
        Scanner scanner = new Scanner(System.in);

        //numero - var criada na hora
        System.out.print("Digite o total de votos válidos do candidato A: ");
        int votosA = scanner.nextInt();

        System.out.print("Digite o total de votos válidos do candidato B: ");
        int votosB = scanner.nextInt();

        System.out.print("Digite o total de votos válidos do candidato C: ");
        int votosC = scanner.nextInt();

        System.out.print("Digite o total de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Digite o total de votos em branco: ");
        int votosBranco = scanner.nextInt();

        //formula
        //votos validos = tds os votos normais menos os nulos e brancos
        totalEleitores = votosA + votosB + votosC + votosNulos + votosBranco;
        percentualVotosValidos = (double) (votosA + votosB + votosC) / totalEleitores * 100;
        percentualVotosA = (double) votosA / totalEleitores * 100;
        percentualVotosB = (double) votosB / totalEleitores * 100;
        percentualVotosC = (double) votosC / totalEleitores * 100;
        percentualVotosNulos = (double) votosNulos / totalEleitores * 100;
        percentualVotosBranco = (double) votosBranco / totalEleitores * 100;

        //saida
        System.out.println("Total de eleitores: " + totalEleitores);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualVotosValidos); //mostrar apenas duas casas deciamis dps
        System.out.printf("Percentual de votos válidos do candidato A: %.2f%%\n", percentualVotosA);
        System.out.printf("Percentual de votos válidos do candidato B: %.2f%%\n", percentualVotosB);
        System.out.printf("Percentual de votos válidos do candidato C: %.2f%%\n", percentualVotosC);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualVotosNulos);
        System.out.printf("Percentual de votos em branco: %.2f%%\n", percentualVotosBranco);
    }
}
