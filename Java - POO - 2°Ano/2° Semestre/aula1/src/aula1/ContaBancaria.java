package aula1;

public class ContaBancaria {

	private double saldo;
	private double limite;
	
	
	public ContaBancaria(double saldo, double limite) {
		super();
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public boolean sacar(double valor) throws ContasException { 
		
		if (valor > 500) {
			//vai aparecer a mensagem a excessão
			throw new ContasException("Valor de saque superior a R$500"); //se o numero for maior que 500 ele vai aparecer um erro - e vai acessar o erro da exsseção q esta na outra classe
		} //se passar do if e aparecer a mensagem de erro, já para tudo, dai n tem if
		saldo -= valor;
		return true;
	}
	
	public double getSaldo() {
		return saldo;
	}

	
}
