package ProjetoBilheteUnico;

public class Tarifa {

	//final - variavel fixa - n muda para n mduar o codigo quando esta compliando - valor q n muda
	//quando vou colocar valores na varivel dentro do construtor eu n preciso colocar como variavel global
	final double tarifaBase;
	String tipoTarifa;
	
	//método contrutor - tem q inicializar o 'final'
	public Tarifa(String tipoTarifa) {
		this.tarifaBase = 5.00;
		this.tipoTarifa = tipoTarifa;
	}
}
