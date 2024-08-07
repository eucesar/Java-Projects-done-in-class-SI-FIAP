package aula1;

public class Teste {

	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria(600, 1500);
		try { //se ele tentar sacar, vai, se n cai no catch
			conta.sacar(550);
			System.out.println(conta.getSaldo());
		} catch (ContasException e) { //controlar a excessão do codigo - oq vai aparecer na mensagem de erro
			System.out.println(e.getMessage()); //Para sumir a mensagem azul do um getMessage() 
		}
	}

}
