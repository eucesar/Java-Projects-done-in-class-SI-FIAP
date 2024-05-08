package br.fiap.forma;

public class Circulo extends Forma{
	public Circulo(int cx, int cy, double raio) {
		super(cx,cy, raio);
	}
	
	@Override //tem q colocar o metodo, se n da erro
	public double calcularArea() {
		return Math.PI * raio * raio; //
	}
}
