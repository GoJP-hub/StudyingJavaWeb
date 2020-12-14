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

	public ControllerLogin() {
		super();
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
	Description--Performs user-access actions: Login or Logout
	@author go.hirano
	@see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 **********************************************/
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*********************************************
		Description--Set instances to store and display results of Login
		@author go.hirano
		 **********************************************/
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		RequestDispatcher rd;

		/*********************************************
		Description--Get action request driven by clicked button and perform defined action
		@author go.hirano
		 **********************************************/
		ModelUserAccessibility userAccess = new ModelUserAccessibility();
		String userAction = request.getParameter("submit");

		if (userAction.equals("login")) {
			rd = userAccess.login(request, session);
			rd.forward(request, response);
		} else {
			userAccess.logout(session);
			response.sendRedirect("./basic08MvcLogin/LoginReq.jsp");
		}
	}

}
