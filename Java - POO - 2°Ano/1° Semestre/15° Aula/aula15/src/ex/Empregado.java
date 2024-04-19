package ex;

public abstract class Empregado {
	
	
		String nome;
		long matricula;
		int cpf;
		
		//alterando corrigo do toString
		//tostring + ctrl + espaço + enter
		//mudando obejeto do java
		@Override
		public String toString() {
		return nome + " " + matricula;
		}
	
	
}
