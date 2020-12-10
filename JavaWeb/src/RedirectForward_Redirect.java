import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RedirectForward_Redirect")
public class RedirectForward_Redirect extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public RedirectForward_Redirect() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("./RedirectForward_Landing.jsp");
	}
}
