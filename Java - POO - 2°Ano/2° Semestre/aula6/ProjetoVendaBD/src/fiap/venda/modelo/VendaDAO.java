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
	
	public void inserir(Venda venda) { //coloco o Venda pq é ele q quero pegar
		connection = ConnectionFactory.getInstance().getConnection(); 
		sql = "insert into java_venda values(?, ?, ?, ?)"; //cada '?' é uma inserção na tabela
		
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, venda.getId_venda());
			ps.setDouble(2, venda.getVendedor().getId()); //pegando o get id da forkey
			ps.setDouble(3, venda.getTotal());
			ps.setDate(4, Date.valueOf(venda.getData()));
			ps.execute();
		} catch (SQLException e) {
			System.out.println("erro ao inseir vendedor \n" + e);
		}
	}	
	
}
