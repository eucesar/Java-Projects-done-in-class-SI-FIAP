package exercicio02;

import java.util.Objects;

public class Participante {
	private String nome;
	private String email;
	
	public Participante(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return nome + " -- " + email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}

	//hash code como Override ele faz com que atributos igual n sejam inseridos
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}
	
	
}
