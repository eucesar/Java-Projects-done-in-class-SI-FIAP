
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calcular
 */
@WebServlet("/calcular")
public class Calcular extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Calcular() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DecimalFormat mascara = new DecimalFormat("#,##0.00"); //virar valor decimal
		double total = 0;
		String nome = request.getParameter("nome"); //armazenar some insrido no index 
		int diaria = Integer.parseInt(request.getParameter("diaria")); // mudar o numero de String para int - armazenar diaria do index
		for (int i = 1; i <= diaria; i++) {
			total += 350.00 / i; //calcular total de diarias
		}
		System.out.println("Nome: " + nome);
		System.out.println("Total R$ " + mascara.format(total)); 
		response.sendRedirect("index.html");

	}

}
