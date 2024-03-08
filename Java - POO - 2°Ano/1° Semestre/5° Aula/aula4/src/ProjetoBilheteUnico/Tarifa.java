package ProjetoBilheteUnico;

public class Tarifa {

	//final - variavel fixa - n muda para n mduar o codigo quando esta compliando - valor q n muda
	//quando vou colocar valores na varivel dentro do construtor eu n preciso colocar como variavel global
	// static - n vai para dentro do obj, é uma variavel que n altera de maneira nenhuma
	static double tarifaBase = 5.00; //variavel percetence a classe e não ao objeto
	String tipoTarifa;
	
	//método contrutor - tem q inicializar o 'final'
	public Tarifa(String tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}
	
	// método para aumentar o valor da tarifa de acordo com uma porcentagem
	//metodo de um valor q n altera ent é static
	public static void aumentarTarifaBase(double porcentagem) {
		//n preciso dar um 'this' pq é static
		tarifaBase += tarifaBase * porcentagem / 100;
	}
	
	//método para alterar o tipo de tarifa
	public void alterarTipoTarifa(String novoTipoTarifa) {
		this.tipoTarifa = novoTipoTarifa;
	}
	
}
