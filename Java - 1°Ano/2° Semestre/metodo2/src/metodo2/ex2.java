package metodo2;

public class ex2 {

	public static void main(String[] args) {
        //variáveis locais --> escopo ou visibilidade
		int x = 2;
        int y = 3;
		
        int total = somar(x, y); // argumentos --> valor que será enviado para o método
        System.out.println(total);
		
	}
	//void significa que termina a execução e n retorna nd
	public static int somar(int x, int y) { //parâmetros --> varável que recebe o argumento
		return x + y; //tudo q tiver em baixo do return n sera executado, já saiu
		
		
	}

}
