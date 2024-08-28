package fiap.venda.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fiap.venda.conexao.ConnectionFactory;

public class VendaDAO {
	private Connection connection;
	private String sql;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public void inserir(Venda venda) {
		connection = ConnectionFactory.getInstance().getConnection();
		sql = "insert into java_venda values(?, ?, ?, ?)";
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, venda.getId_venda());
			ps.setInt(2, venda.getVendedor().getId());
			ps.setDouble(3, venda.getTotal());
			ps.setDate(4, Date.valueOf(venda.getData()));
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Venda> totalPorVendedor() {
		List<Venda> lista = new ArrayList<Venda>(); //poor ser pesquisa já coloco o List
		connection = ConnectionFactory.getInstance().getConnection();
		sql = "select vo.nome_vendedor, sum(va.total) as total_venda "
				+ "from java_vendedor vo " //inner em baixo
				+ "inner join java_venda va " //so tras no de vendedor com vendas registradas com inner, mas com o left tras todos os vendedor mesmo sem venda registrada
				+ "on vo.id_vendedor = va.id_vendedor "
				+ "group by vo.nome_vendedor";
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				lista.add(new Venda(new Vendedor(rs.getString("nome_vendedor")),
						rs.getDouble("total_venda")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
}
