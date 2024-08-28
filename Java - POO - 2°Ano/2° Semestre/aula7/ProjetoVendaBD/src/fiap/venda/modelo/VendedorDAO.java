package fiap.venda.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fiap.venda.conexao.ConnectionFactory;

public class VendedorDAO {
	private Connection connection;
	private String sql;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public void inserir(Vendedor vendedor) {
		connection = ConnectionFactory.getInstance().getConnection();
		sql = "insert into java_vendedor values(?, ?)";
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, vendedor.getId());
			ps.setString(2, vendedor.getNome());
			ps.execute();
		} catch (SQLException e) {
			System.out.println("erro ao inserir vendedor\n" + e);
		}		
	}
	
	public Vendedor pesquisarId(int id) {
		Vendedor vendedor = null; //quando vou inserir valores na tabela eu n preciso listar
		connection = ConnectionFactory.getInstance().getConnection();
		sql = "select * from java_vendedor where id_vendedor = ?"; 
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				vendedor = new Vendedor(id, rs.getString("nome_vendedor"));
			}
		} catch (SQLException e) {
			System.out.println("erro ao pesquisar por ID\n" + e);
		}
		return vendedor;
	}

	public List<Vendedor> lista() { //quando eu n vou inserir valores na tabeal mas retornar nada faço 'lista'
		List<Vendedor> lista = new ArrayList<Vendedor>();
		connection = ConnectionFactory.getInstance().getConnection();
		sql = "select * from java_vendedor";
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				lista.add(new Vendedor(rs.getInt("id_vendedor"), rs.getString("nome_vendedor")));
			}
		} catch (SQLException e) {
			System.out.println("erro ao listar\n" + e);
		}
		return lista;
	}
}
