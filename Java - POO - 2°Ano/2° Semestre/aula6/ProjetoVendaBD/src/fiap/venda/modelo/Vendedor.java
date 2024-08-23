package fiap.venda.modelo;

public class Vendedor {

	private int id;
	private String nome;
	
	public Vendedor(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public Vendedor(int id) {
		super();
		this.id = id;
	}
	//crio outro igual por causa da fk q puxa na tabela no TESTE e no vendaDAO esta puxando o fk de outra tabela, e na hora de inserir da trave no teste, então para n dar ruim faço isso
	
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

	@Override
	public String toString() {
		return id + "--" + nome ;
	}
	
	
	
	
	
	
	
	
}
