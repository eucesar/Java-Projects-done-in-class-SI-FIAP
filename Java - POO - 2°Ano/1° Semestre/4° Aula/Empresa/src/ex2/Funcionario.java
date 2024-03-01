package ex2;

public class Funcionario {
	// variaveis de instancia
	String nome;
	String cargo;
	double salario;
	
	//metodo para aumentar o salario de um funcionario - não preciso colocar valor da porcentagem se coloque entre aspas, fica mais facil para enviar um valor para o metodo, isso se chama variavel GLOBAL/parametro
	//salario para geral
	// assinatura do método - a linha todinha é referente a tudo do metodo, pode ter nomes iguais mas se os parametros são diferentes já é um diferencial - tudo q eu escrevo é um diferencial
	public void aumentarSalario(double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	
	//soma mais
	// metodo para aumentar o salario de um funcionario de acordo com o cargo
	public void aumentarSalario(double porcentagem, String cargo) {
		// cargo = cargo; - da erro pq defino duas variaveis locais - a variavel local tem prioridade
		
		//this - variavel para pegar a referencia dos dados das clases que eu estou com o codigo aberto 
		//equalsIgonereCase - serve para ignorar se a letra esta em maiuscula e minuscula - e esta nem ai para oque digitar so ira alterar
		//ele só esta criando de forma generalista, n esta colocando valor de alemento por qq cargo - posso criar em casa diferente dps
		//faz a conta dnv
		if (this.cargo.equalsIgnoreCase(cargo)) {
			salario += salario * porcentagem / 100;
		}
		
	}
	
	// metodo para alterar o cargo de um funcionario
	//refazer esse meotodo realemnte estudando para a porva !!
	public void promover(String cargo) {
		this.cargo = cargo;
	}
	
	
}
