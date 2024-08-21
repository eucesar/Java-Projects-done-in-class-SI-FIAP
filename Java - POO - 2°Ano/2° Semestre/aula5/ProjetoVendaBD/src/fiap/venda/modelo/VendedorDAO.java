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
			System.out.println("Erro ao inserir vendedor \n" + e);
		}
	}
	
	public Vendedor pesquisarId(int id) {
		Vendedor vendedor = null;
		connection = ConnectionFactory.getInstance().getConnection();
		sql = "select * from java_vendedor where id_vendedor = ?"; //tanto faz maiusculo ou minusculo - buscar 1 só
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			//ele pesquisa e manda para o banco de dados, por isso o 'rs' - envia pro resut set
			rs = ps.executeQuery(); //execute query faz somente BUSCA
			//se tiver algo dentro retorna vdd no id_venda - quando acha resultado retorna um valor
			if(rs.next()) { //se tiver algo dentro do resultset é vdd se n é falso - if para achar o conteudo q eu qeuro
				vendedor = new Vendedor(id, rs.getString("NOME_VENDEDOR")); //id do vendedr e o nome dele
			} 
//			ps.setString(2, vendedor.getNome());
			ps.execute();
		} catch (SQLException e) {
			System.out.println("Erro ao pesquisar por ID \n" + e);
		}

		
		return vendedor;
	}
	
	public List<Vendedor> lista() { //array que cresce com forme add
			List<Vendedor> lista = new ArrayList<Vendedor>();
			connection = ConnectionFactory.getInstance().getConnection(); //conectar ao bd
			sql = "select * from java_vendedor"; //tanto faz maiusculo ou minusculo - buscar todos
			try {
				ps = connection.prepareStatement(sql);
				rs = ps.executeQuery();
				while (rs.next()) { //loop em pesquisar - todos os elementoss, n algo espeicifco-listar 1 por 1
					lista.add(new Vendedor(rs.getInt("id_vendedor"), rs.getString("nome_vendedor"))); //vai pegar todos, por isso o id de cima vira rs.getINT - pegar td, percorrer por td
					
				}
			} catch (SQLException e) {
				System.out.println("Erro ao listar \n" + e);
			}

			return lista;
	}
	
}
