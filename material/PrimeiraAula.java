//publico = class-associar ao objeto = nome da class
public class PrimeiraAula {

    // main/principal - void, definição de um elemento = parte padrão - esqueleto
    public static void main(String[] args) {

        // CRIAÇÃO DE VARIAVEL - SEPARAR :
        // DETALHES - MANIPULA A VARIAVEL PRIMEIRO
        int idade;
        int TotalDeLivros;
        // apenas uma SIMBOLO - 1 só
        char genero;
        // string com letra maiscula - aramazenarar caracteristica
        String nome;
        // criação da variavel - CONTAS/NOTAS - virgula - separador de variavel
        double nota1, nota2, nota3;
        double SomaDasNotas;
        double media;

        // CITAR VARIVAEL :
        // DEFINI OQ A VARIAVEL VALE
        idade = 20;
        //M = MASCULINO
        genero = 'M';
        TotalDeLivros = 3;
        nome = "Antonio Carlos da Silva";
        nota1 = 2;
        nota2 = 4;
        nota3 = 6;
        SomaDasNotas = (nota1 + nota2 + nota3);
        // trabalho com PONTO n com virgula
        media = (SomaDasNotas) / 3;

        // print line = pode ser numero ou string
        System.out.println("Meu nome é: " + nome);
        System.out.println("Minha idade é: " + idade + " anos");
        System.out.println("Comprei um total de: " + TotalDeLivros + " livros");
        System.out.println("Sou do genero: " + genero);
        System.out.println("Minhas notas no trimestre foram: " + nota1 + " - " + nota2 + " - " + nota3);
        System.out.println("A soma das minhas notas foram: " + SomaDasNotas);
        System.out.println("A media das notas de " + nome + "," + " sera: "  + media);

    }

}