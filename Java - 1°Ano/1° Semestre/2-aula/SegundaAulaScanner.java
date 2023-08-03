import java.util.Scanner;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class SegundaAulaScanner {
    public static void main(String[] args) {
        
        //declaração de var
        double nota1, nota2, media;

        //scanner = comunicar com o teclado = a pessoa tem q digitar - INPUT
        //system.in = está lincando o array do teclado, ativando teclado = in = ENTER 
        Scanner teclado = new Scanner(System.in);

        //entrada de dados
        System.out.println("Informe sua primeira nota");
        //vai até o deposito e retira oq tem na variavel - ele vai ler a parte System.in
        //nextDouble = escrever no TECLADO
        nota1 = teclado.nextDouble();
        
        System.out.println("Informe sua segunda nota");
        nota2 = teclado.nextDouble();

        //Print = imprime no console a linha do lado
        //Println = imprime no console a linha de baixo

        //processamento de dados
        media = (nota1 + nota2) / 2;
    }
}