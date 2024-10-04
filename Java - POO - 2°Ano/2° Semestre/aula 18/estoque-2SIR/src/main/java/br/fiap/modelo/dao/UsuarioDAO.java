package br.fiap.modelo.dao;
import java.sql.SQLException;
import br.fiap.modelo.bean.Usuario;
import br.fiap.modelo.conexao.ConnectionFactory;

public class UsuarioDAO extends DAO{
 
	public UsuarioDAO() {
		this.connection = ConnectionFactory.getInstance().getConnection();
	}
	
	
	
	public void cadastrar(Usuario usuario) {
		int idUsuario = 0, idPerfil = 0; //criando idUsuario e Perfil por conta do oq esta no bd - e o valor é 0 pq é valor inteiro
		try {
			// desativar o commit automatico para realizar uma transação
			connection.setAutoCommit(false);
			
			// inserção na tabela usuario
			sql = "insert into java_usuario values(sequencia_usuario.nextval, ?, ?, ?, ?, ?)";
			ps = connection.prepareStatement(sql);
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getEmail());
			ps.setString(3, usuario.getSenha());
			ps.setInt(4, 1); //ativou ou inativo
			ps.setString(5, usuario.getSalt());//salt = String - gerar o valor aleatorio 
			ps.execute(); //por ser inseção sera execute
			
			//obtem o ID do usuario que acabou de ser inserido
			sql = "select sequencia _usuario.currval from dual";
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery(); //passando pela tabela
			if (rs.next()) {
				idUsuario = rs.getInt(1);
			}
			
			// obtem o ID do perfil do usuario
			// pegando um valor do banco de dados
			sql = "select id_perfil from java_perfil where nome = ?";
			ps = connection.prepareStatement(sql);
			ps.setString(1, usuario.getPerfil().getPerfil());
			rs = ps.executeQuery(); //vai ser query por obter valores
			if (rs.next()) {
				idPerfil = rs.getInt(1);
			}
			
			// inserção dos dados na tabela java usuario perfil
			sql =  "insert into java_usuario_perfil values(sequencia_usuario_perfil.nextval, ?, ?)";
			ps = connection.prepareStatement(sql);
			ps.setInt(1, idUsuario);
			ps.setInt(2, idPerfil);
			ps.execute(); //por ser inseção sera execute
			
			connection.commit();
			
		}
		catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		
	}

}
