package basic08MvcLogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*********************************************
Description--Controller class for Login Processes
@author go.hirano
 **********************************************/
@WebServlet("/ControllerLogin")
public class ControllerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*********************************************
	Description--Uses doPOST method
	@author go.hirano
	@see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 **********************************************/
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/*********************************************
	Description--Performs Login process via asserting Login Details and getting User details
	@author go.hirano
	@see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 **********************************************/
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		/*********************************************
		Description--Set instances to store and display results of Login
		@author go.hirano
		 **********************************************/
		HttpSession session = request.getSession();
		RequestDispatcher rd;

		/*********************************************
		Description--Get action request driven by clicked button and perform defined action
		@author go.hirano
		 **********************************************/
		String actionBtn = request.getParameter("submit");
		if ("login".equals(actionBtn)) {

			/*********************************************
			Description--Set a variables for getting a login details
			@author go.hirano
			 **********************************************/
			String id = request.getParameter("id");
			String password = request.getParameter("password");

			/*********************************************
			Description--call an instances for Login Assertion
			@author go.hirano
			 **********************************************/
			ModelLogin login = new ModelLogin();
			ModelLoginUserBean bean = login.loginByUserId(id, password);

			/*********************************************
			Description--Conduct Login assertions and set results to Session Scope
			@author go.hirano
			 **********************************************/
			if (bean != null) {
				session.setAttribute("user", bean);
				session.setAttribute("state", "login");
				session.setMaxInactiveInterval(180);
				rd = request.getRequestDispatcher("./basic08MvcLogin/LoginRespSuccess.jsp");
			} else {
				rd = request.getRequestDispatcher("./basic08MvcLogin/LoginRespError.jsp");
			}
			rd.forward(request, response);
		} else {
			session.removeAttribute("state");
			session.removeAttribute("user");
			response.sendRedirect("./basic08MvcLogin/LoginReq.jsp");
		}
	}

}
