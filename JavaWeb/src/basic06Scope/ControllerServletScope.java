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
@WebServlet("/ControllerServletScope")
public class ControllerServletScope extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerServletScope() {
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
	Description--Receiving User details based on Login info
	@author go.hirano
	@see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 **********************************************/
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*********************************************
		Description--Set a variables for getting/setting attributes for each scope (session/appliaction)
		@author go.hirano
		 **********************************************/
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		ServletContext con = request.getServletContext();

		/*********************************************
		Description--Set a variables for tracking access
		@author go.hirano
		 **********************************************/
		String trackRequest ="";
		String trackSession ="";
		String trackApplication ="";

		/*********************************************
		Description--Track the access from each scope
		@author go.hirano
		 **********************************************/
		ModelAccessTracker tracker = new ModelAccessTracker();
		trackRequest= tracker.trackAccessRequest(request);
		trackSession= tracker.trackAccessSession(session);
		trackApplication= tracker.trackAccessApplication(con);

		/*********************************************
		Description--Set a variables for tracking access
		@author go.hirano
		 **********************************************/
		int reqNo;
		int sessionNo;
		int appNo;

		/*********************************************
		Description--Counts the access number for each Scopes
		@author go.hirano
		 **********************************************/
		ModelAccessCounter counter = new ModelAccessCounter();
		reqNo = counter.countRequest(trackRequest);
		sessionNo = counter.countSession(trackSession, session);
		appNo = counter.countApplication(trackApplication);

		/*********************************************
		Description--Display the result page
		@author go.hirano
		 **********************************************/
		String nSession = request.getParameter("name_parameter");
		session.setAttribute("name_parameter", nSession);

		request.setAttribute("access_request", Integer.toString(reqNo));
		session.setAttribute("access_session", Integer.toString(sessionNo));
		con.setAttribute("access_application", Integer.toString(appNo));

		RequestDispatcher rd = con.getRequestDispatcher("/basic06Scope/scopeResult.jsp");
		rd.forward(request, response);
	}

}
