package br.fiap.modelo.util;

import java.sql.Connection;
import java.sql.SQLException;

import br.fiap.modelo.bean.Cliente;
import br.fiap.modelo.connection.ConnectionFactory;
import br.fiap.modelo.dao.DAO;

public class ClienteDAO extends DAO {

	public ClienteDAO() {
		this.connection = ConnectionFactory.getInstance().getConnection();
	}
	
	public void inserir(Cliente cliente) {
		int idCliente = 0;
		
		try {
			//desativar commit
			connection.setAutoCommit(false);
			
			sql = "select max(id_cliente) from java_cliente";
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				idCliente = rs.getInt(1);
			}
			
			sql = "insert into java cliente values(?, ?, ?)";
			ps = connection.prepareStatement(sql);
			ps.setInt(1, idCliente + 1);
			ps.setString(2, cliente.getNome());
			ps.setLong(3, cliente.getCpf());
			ps.execute();
			
			connection.commit();
			
		} catch (Exception e) {
			System.out.println("erro ao cadastrar cliente\n" + e);
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
}
