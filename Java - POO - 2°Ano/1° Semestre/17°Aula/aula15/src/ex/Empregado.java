package ex;

public abstract class Empregado {
	
	
		String nome;
		long matricula;
		
		
		public Empregado(String nome, long matricula) {
			super();
			this.nome = nome;
			this.matricula = matricula;
		}

		//faço isso para poder manipular o ebejeto por classes - abstrato, não retorna valor nenhum, apenas armazena algo para ser preenchido
		public abstract double calcularSalario();
		
		
		//alterando corrigo do toString
		//tostring + ctrl + espaço + enter
		//mudando obejeto do java
		@Override
		public String toString() {
		return nome + " " + matricula;
		}
	
	
}
