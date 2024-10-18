package br.fiap.controle;

import java.io.IOException;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.fiap.modelo.bean.Perfil;
import br.fiap.modelo.bean.Usuario;
import br.fiap.modelo.dao.UsuarioDAO;
import br.fiap.modelo.util.Util;

/**
 * Servlet implementation class CadastrousuarioServlet
 */
@WebServlet("/cadastroUsuario")
public class CadastrousuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usuario = new Usuario();
		Perfil perfil = new Perfil();
		
		// obtém o valor do salt
		byte[] salt = Util.getSalt();
		
		// aplicar o algoritmo de hash
		String senhaCodificada = Util.codificar(request.getParameter("senha"), salt);
		
		// configuração dos atributos do objeto usuário
		perfil.setPerfil(request.getParameter("perfil"));
		usuario.setPerfil(perfil);
		usuario.setNome(request.getParameter("nome"));
		usuario.setEmail(request.getParameter("email"));
		usuario.setSenha(senhaCodificada);
		usuario.setSalt(Base64.getEncoder().encodeToString(salt));
		
		new UsuarioDAO().cadastrar(usuario);
		
		response.sendRedirect("index.html");
		
		String nome = request.getParameter("nome");
		HttpSession session = request.getSession(true); //configurar quando envia - request vai ser true quando enviar - coloco os dados na sess�o
		session.setAttribute("nome", nome);
		response.sendRedirect("deshboard.jsp"); //enviar arquivos colocados
		
		
	}
	

}
