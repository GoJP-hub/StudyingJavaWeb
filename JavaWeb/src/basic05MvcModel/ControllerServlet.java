package basic05MvcModel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * Description-- Uses doPost methods
	 * @author gohir
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * Description--Method to trigger Search by ID and call relevant display
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*********************************************
		Description--get the parameter
		@author go.hirano
		 **********************************************/
		String id = request.getParameter("id");

		/*********************************************
		Description--Search user info by having ID as key
		@author go.hirano
		 **********************************************/
		ModelIdProcessing ip = new ModelIdProcessing();
		ModelUserBean bean = ip.getUserInfoById(id);

		/*********************************************
		Description--Based on the result, select & dispatch to adequate View
		@author go.hirano
		 **********************************************/
		RequestDispatcher rd;

		if(bean != null) {
			request.setAttribute("user", bean);
			rd = request.getRequestDispatcher("./basic05MvcModel/userRespSuccess.jsp");
		}else {
			rd = request.getRequestDispatcher("./basic05MvcModel/userRespError.jsp");
		}
		rd.forward(request, response);
	}

}
