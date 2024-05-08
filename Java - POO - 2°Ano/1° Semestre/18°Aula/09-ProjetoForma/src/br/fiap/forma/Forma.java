package br.fiap.forma;

//abstrato significa que vou manipular alem de variavel e metodo
public abstract class Forma {

	protected int cx;
	protected int cy;
	protected double raio;
	
	
	public Forma(int cx, int cy, double raio) {
		this.cx = cx;
		this.cy = cy;
		this.raio = raio;
	}
	
	//so coloco como abstrato para metodos repetidos
	public abstract double calcularArea(); //eu crio o metodo somente para usar no metodo SUPER - n herança

	@Override
	public String toString() {
		String aux ="";
		aux += "x = " + cx + "\n";
		aux += "y = " + cy + "\n";
		aux += "raio = " + raio + "\n";
		return aux;
	}

	public int getCx() {
		return cx;
	}

	public void setCx(int cx) {
		this.cx = cx;
	}

	public int getCy() {
		return cy;
	}

	public void setCy(int cy) {
		this.cy = cy;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
}
