import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//setting the format of response: HTML page with UTF-8 character type
		response.setContentType("type/html");
		response.setCharacterEncoding("UTF-8");

		//Call instance for displaying the result on the screen
		PrintWriter pw = response.getWriter();

		//adding html contents to display
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Java入門</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>Hello World!!</h1>");
		pw.println("</body>");
		pw.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
