package fiap.venda.modelo;

public class Vendedor {
	private int id;
	private String nome;
	
	public Vendedor(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	//faço a sobrecarca pq oq ele quer mandar é so o nome do vendedor
	//crio a tabeal no banco de dados, mas pego só oque preciso
	public Vendedor(String nome) {
		super();
		this.nome = nome;
	}
	
	public Vendedor(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " -- " + nome;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
