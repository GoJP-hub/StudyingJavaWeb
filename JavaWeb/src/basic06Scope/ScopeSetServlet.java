package basic06Scope;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*********************************************
Description--Model class: Alternative/simplified codes for DAO
@author go.hirano
**********************************************/
@WebServlet("/ScopeSetServlet")
public class ScopeSetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ScopeSetServlet() {
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
		doPost(request, response);
	}

	/*********************************************
	Description--
	@author go.hirano
	@see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 **********************************************/
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*********************************************
		Description--Counts the access number from Request Scope and set as String
		@author go.hirano
		 **********************************************/
		String aRequest= (String)request.getAttribute("access_request");

		/*********************************************
		Description--Counts the access number from Session Scope and set as String
		@author go.hirano
		 **********************************************/
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		String aSession = (String)session.getAttribute("access_session");

		/*********************************************
		Description--Counts the access number from Application Scope and set as String
		@author go.hirano
		 **********************************************/
		ServletContext con = request.getServletContext();
		String aApplication = (String)con.getAttribute("access_application");

		/*********************************************
		Description--Set a variable for counting the access frequency of each Scope
		@author go.hirano
		 **********************************************/
		int accessReq = 1;
		int accessSession = 1;
		int accessApp = 1;

		/*********************************************
		Description--Set a variable for counting the access frequency of each Scope
		@author go.hirano
		 **********************************************/
		if(aRequest != null) {
			accessReq = Integer.parseInt(aRequest);
			accessReq++;
		}

		if(aSession != null) {
			accessSession = Integer.parseInt(aSession);
			accessSession++;
		}else {
			session.setMaxInactiveInterval(60);
		}

		if(aApplication != null) {
			accessApp= Integer.parseInt(aApplication);
			accessApp++;
		}

		/*********************************************
		Description--Display the result page
		@author go.hirano
		 **********************************************/
		String nSession = request.getParameter("name_parameter");
		session.setAttribute("name_parameter", nSession);

		request.setAttribute("access_request", Integer.toString(accessReq));
		session.setAttribute("access_session", Integer.toString(accessSession));
		con.setAttribute("access_application", Integer.toString(accessApp));

		RequestDispatcher rd = con.getRequestDispatcher("/basic06Scope/scopeResult.jsp");
		rd.forward(request, response);
	}

}
