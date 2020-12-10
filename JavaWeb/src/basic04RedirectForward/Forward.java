package basic04RedirectForward;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Forward")
public class Forward extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public Forward() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext con = req.getServletContext();
		RequestDispatcher rd = con.getRequestDispatcher("/basic04RedirectForward/RedirectForward_Landing.jsp");

		rd.forward(req, resp);
	}
}
