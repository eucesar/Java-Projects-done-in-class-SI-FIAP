package ex;

public class EmpregadoComissionado extends Empregado {
	double totalDeVendas;
	double comissao;
	
	
	@Override
	public String toString() {
		return "EmpregadoComissionado [totalDeVendas=" + totalDeVendas + ", comissao=" + comissao + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
