package fiap.venda.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fiap.venda.conexao.ConnectionFactory;

public class VendedorDAO {

	private Connection connection;
	private String sql;
	//classe de quem transporta o sql para base da dados
	private PreparedStatement ps;
	private ResultSet rs;
	
	//metodo para inserir na base de dados
	public void inserir(Vendedor vendedor) {
		connection = ConnectionFactory.getInstance().getConnection(); //pego a instancia da conexão para funcionar 
		//configuro qual tabela vou inserir valores
		sql = "insert into JAVA_VENDEDOR values(?, ?)"; //extraido na base de dados coloco interrogação
		//precisa de uma excessão
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, vendedor.getId()); //index - 1° valor = ordem da interrogação - 1° valor = oq vai ser inserido
			ps.setString(2, vendedor.getNome());
			ps.execute(); //comando de executar, de colcoar codigo
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Vendedor pesquisarId(int id) {
		Vendedor vendedor = null;
		connection = ConnectionFactory.getInstance().getConnection();
		sql = "select * from java_vendedor where id_vendedor = ?"; //tanto faz maiusculo ou minusculo
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			//ele pesquisa e manda para o banco de dados, por isso o 'rs' - envia pro resut set
			rs = ps.executeQuery(); //execute query faz somente BUSCA
			if(rs.next()) { //se tiver algo dentro do resultset é vdd se n é falso//se tiver algo dentro do resultset é vdd se n é falso
				vendedor = new Vendedor(id, rs.getString("NOME_VENDEDOR")); //id do vendedr e o nome dele
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return vendedor;
	}
	
}
