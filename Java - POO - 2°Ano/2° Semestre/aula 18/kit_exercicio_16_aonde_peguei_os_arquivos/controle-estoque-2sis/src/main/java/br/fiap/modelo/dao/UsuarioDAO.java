package br.fiap.modelo.dao;

import br.fiap.modelo.connection.ConnectionFactory;

public class UsuarioDAO extends DAO {
	
	public UsuarioDAO() {
		this.connection = ConnectionFactory.getInstance().getConnection();
	}
	
}
