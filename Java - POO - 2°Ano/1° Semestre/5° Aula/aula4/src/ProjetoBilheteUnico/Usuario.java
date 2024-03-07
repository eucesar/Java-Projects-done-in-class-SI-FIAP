package ProjetoBilheteUnico;

public class Usuario {
	
	String nome;
	int cpf;
	
	//metodo construtor - precisa ter algo dentro - para n ficar nome = null - e cpf = 0 ==> so chamo igual;
	//boa pratica para colocar em Usuario() - valores obriagatorios - e colocar valores dentro, todos os 
	//valores q vou usar
	public Usuario(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
		System.out.println(this);
	}
	
}
