package ex;

//HORISTA = PAGO POR HORAS
//extends - extende e pega os atributos da classe empregados
public class EmpregadoHorista extends Empregado{

	int totalDeHorasTrabalhadas;
	double valorDaHora;
	
	//adionando as variaveis no endereço de memoria
	@Override
	public String toString() {
		return super.toString() + " " + totalDeHorasTrabalhadas + " " + valorDaHora;
	}
}

