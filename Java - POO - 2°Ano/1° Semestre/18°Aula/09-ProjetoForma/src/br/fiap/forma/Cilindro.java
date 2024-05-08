package br.fiap.forma;

public class Cilindro extends Forma{

	private double altura;
	
	public Cilindro(int cx, int cy, double raio, double altura) {
		super(cx, cy, raio); //super vem de herança, vem de Forma graças ao extend Forma - recebe os valores de FORMA
		this.altura = altura;
	}
	
	public double calcularVolume() {
		return Math.PI * raio * raio * altura;
	}
	
	@Override
	public String toString() {
		String aux = super.toString();
		aux += "altura =" + altura + "\n"; //esta adicionado mais uma linha - manipula o "toString" aonde der
		return super.toString();
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override //tem q colocar o metodo, se n da erro
	public double calcularArea() {
		return 2 * Math.PI * raio * (raio + altura);
	}
	
	
}
