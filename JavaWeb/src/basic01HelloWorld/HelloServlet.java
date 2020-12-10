package basic01HelloWorld;

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
		// TODO 自動生成されたコンストラクター・スタブ
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//setting the format of response: HTML page with UTF-8 character type
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");

		//Call instance for displaying the result on the screen
		PrintWriter pw = resp.getWriter();

		//adding html contents to display
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>HelloServlet</title>");
		pw.println("<body>");
		pw.println("<p>HiServlet</p>");
		pw.println("</body>");
		pw.println("</head>");
		pw.println("</html>");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		doGet(req, resp);
	}

}
