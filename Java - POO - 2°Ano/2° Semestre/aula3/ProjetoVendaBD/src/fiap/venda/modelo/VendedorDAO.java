package fiap.venda.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fiap.venda.conexao.ConnectionFactory;

public class VendedorDAO {

	private Connection connection;
	private String sql;
	//classe de quem transporta o sql para base da dados
	private PreparedStatement ps;
	
	//metodo para inserir na base de dados
	public void inserir(Vendedor vendedor) {
		connection = ConnectionFactory.getInstance().getConnection(); //pego a instancia da conexão para funcionar 
		sql = "insert into java vendedor values(?, ?)"; //extraido na base de dados coloco interrogação
		//precisa de uma excessão
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, vendedor.getId()); //index - 1° valor = ordem da interrogação - 1° valor = oq vai ser inserido
			ps.setString(2, vendedor.getNome());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
