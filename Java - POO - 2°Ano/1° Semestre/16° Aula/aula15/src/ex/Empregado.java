package ex;

public abstract class Empregado {
	
	
		String nome;
		long matricula;
		
		
		public Empregado(String nome, long matricula) {
			super();
			this.nome = nome;
			this.matricula = matricula;
		}


		//alterando corrigo do toString
		//tostring + ctrl + espaço + enter
		//mudando obejeto do java
		@Override
		public String toString() {
		return nome + " " + matricula;
		}
	
	
}
