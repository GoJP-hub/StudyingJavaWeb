package basic03JspForm;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FormServlet() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet was triggered");

		String text1 = "";
		String text2 = "";

		text1 = req.getParameter("str1");
		text2 = req.getParameter("str2");

		System.out.println(text1);
		System.out.println(text2);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet was triggered");

		String text1 = "";
		String text2 = "";

		text1 = req.getParameter("str1");
		text2 = req.getParameter("str2");

		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");

		PrintWriter pw = resp.getWriter();

		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Java入門</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>入力結果</h1>");
		pw.println("<p>入力された値は「" + text1 + "」と「" + text2 + "」です。</p>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
