package basic08MvcLogin;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/*********************************************
Description--Model class for setting the User Data
@author go.hirano
 **********************************************/
public class ModelUserAccessibility {

	/*********************************************
	Description--Assess Login Details and return adequate UserBean
	@author go.hirano
	 **********************************************/
	public ModelLoginUserBean getUserDetails(String id, String password) {
		ModelLoginUserBean bean = new ModelLoginUserBean();

		if("Sample01".equals(id) && "password01".equals(password)){
			bean.setId(id);
			bean.setName("Mr. Sample");
			bean.setAge(27);
		}else if("Sample02".equals(id) && "password02".equals(password)) {
			bean.setId(id);
			bean.setName("Mrs. Sample");
			bean.setAge(24);
		}else {
			bean = null;
		}
		return bean;
	}
	/*********************************************
	Description--Conduct loging actions by asserting Login Details and return adequate UserBean
	@author go.hirano
	 **********************************************/

	public RequestDispatcher login(HttpServletRequest request, HttpSession session) {
		/*********************************************
		Description--Set a variables for getting a login details
		@author go.hirano
		 **********************************************/
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		RequestDispatcher rd;

		/*********************************************
		Description--call an instances for Login Assertion
		@author go.hirano
		 **********************************************/
		ModelLoginUserBean bean = getUserDetails(id, password);

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
		return rd;
	}

	/*********************************************
	Description--Conduct logout action by initializing login details
	@author go.hirano
	 **********************************************/
	public HttpSession logout(HttpSession session) {

		/*********************************************
		Description--Initialize the session
		@author go.hirano
		 **********************************************/
		session.removeAttribute("state");
		session.removeAttribute("user");
		return session;
	}

}
