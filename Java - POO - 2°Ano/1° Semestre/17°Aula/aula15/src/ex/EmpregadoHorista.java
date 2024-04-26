package ex;

//HORISTA = PAGO POR HORAS
//extends - extende e pega os atributos da classe empregados
public class EmpregadoHorista extends Empregado{

	int totalDeHorasTrabalhadas;
	double valorDaHora;
	
	
	
	public EmpregadoHorista(String nome, long matricula, int totalDeHorasTrabalhadas, double valorDaHora) {
		super(nome, matricula);
		this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
		this.valorDaHora = valorDaHora;
	}

	public double calcularSalario() {
		return totalDeHorasTrabalhadas * valorDaHora / 100;
	}

	//adionando as variaveis no endereço de memoria
	@Override
	public String toString() {
		return super.toString() + " " + totalDeHorasTrabalhadas + " " + valorDaHora;
	}
}

