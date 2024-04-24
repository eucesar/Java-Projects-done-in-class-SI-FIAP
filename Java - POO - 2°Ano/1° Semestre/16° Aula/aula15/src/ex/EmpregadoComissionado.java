package ex;

public class EmpregadoComissionado extends Empregado {
	double totalDeVendas;
	double comissao;
	
	
	public EmpregadoComissionado(String nome, long matricula, double totalDeVendas, double comissao) {
		super(nome, matricula); //ele pega os atributos da superclasse 'empregados' que ele esat pegando em cima
		this.totalDeVendas = totalDeVendas;
		this.comissao = comissao;
	}


	@Override
	public String toString() {
		return "EmpregadoComissionado [totalDeVendas=" + totalDeVendas + ", comissao=" + comissao + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
