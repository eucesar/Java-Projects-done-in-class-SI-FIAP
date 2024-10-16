

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Processar
 */
@WebServlet("/Processar")
public class Processar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Processar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email"); 
		String nome = request.getParameter("nome");
		HttpSession session = request.getSession(true); //configurar quando envia - request vai ser true quando enviar - coloco os dados na sessão
		session.setAttribute("email", email);
		session.setAttribute("nome", nome);
		response.sendRedirect("teste.jsp"); //enviar arquivos colocados
	}

}
