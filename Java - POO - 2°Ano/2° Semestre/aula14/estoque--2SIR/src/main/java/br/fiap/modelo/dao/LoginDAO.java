package br.fiap.modelo.dao;

import java.sql.SQLException;

import br.fiap.modelo.beans.Perfil;
import br.fiap.modelo.beans.Usuario;
import br.fiap.modelo.conexap.ConnectionFactory;

public class LoginDAO extends DAO{

	public LoginDAO() {
		this.connection = ConnectionFactory.getInstance().getConnection();
	}
	
	public Usuario autenicar(String email, String senha) {
		Usuario usuario = null;
		sql = "";
		
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, senha);
			rs = ps.executeQuery();
			if (rs.next()) {
				Perfil perfil = new Perfil();
				perfil.setPerfil(rs.getString("perfil"));
				usuario.setPerfil(perfil);
				usuario.setNome(rs.getString("nome"));
				
			}
		} catch (SQLException e) {
			System.out.println("erro ao autenticar o usuario");
		}
		return usuario;
	}
}
