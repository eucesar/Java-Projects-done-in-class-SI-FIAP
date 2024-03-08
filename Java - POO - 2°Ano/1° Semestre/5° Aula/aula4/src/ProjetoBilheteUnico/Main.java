package ProjetoBilheteUnico;

public class Main {

	public static void main(String[] args) {

		//ele me obriga a colcoar um valor no 'USUARIO' - Pq eu criei q precisa entrar no usuario
		Usuario usuario = new Usuario("selmini", 123456);
		Tarifa tarifa = new Tarifa("professor");
		BilheteUnico bilhete = new BilheteUnico(usuario, tarifa);
		
		bilhete.carregarBilhete(4);
		System.out.println(bilhete.consultarSaldo());
		bilhete.passarNaCatraca();
		System.out.println(bilhete.consultarSaldo());
		
		
		
		//COMO ESTAVA ANTES :
		//System.out.println(bilhete.numero);
		//System.out.println(bilhete.saldo);
		//System.out.println(Tarifa.tarifaBase); //eu tenho que acesar um para acessar o outro dps - melhor pratica - pq é no bilhete que fica td
		
		
	}

}
