package br.fiap.controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.fiap.modelo.bean.Perfil;
import br.fiap.modelo.dao.PerfilDAO;

/**
 * Servlet implementation class PerfilServelet
 */
@WebServlet("/perfil")
public class PerfilServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PerfilServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Perfil> lista = new PerfilDAO().lista();
		HttpSession session = request.getSession();
		session.setAttribute("lista", lista);
		response.sendRedirect("usuario/formCadastroUsuario.jsp");
	
	}

}
