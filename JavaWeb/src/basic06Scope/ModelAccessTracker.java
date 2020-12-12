package basic06Scope;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ModelAccessTracker {
	/*********************************************
	Description--Counts the access number from Request Scope and set as String
	@author go.hirano
	 **********************************************/
	public String trackAccessRequest(HttpServletRequest request) {
		String trackRequest = (String)request.getAttribute("access_request");
		return trackRequest;
	}

	/*********************************************
	Description--Counts the access number from Session Scope and set as String
	@author go.hirano
	 **********************************************/
	public String trackAccessSession(HttpSession session) {
		String trackSession = (String)session.getAttribute("access_session");
		return trackSession;
	}
	/*********************************************
	Description--Counts the access number from Application Scope and set as String
	@author go.hirano
	 **********************************************/
	public String trackAccessApplication(ServletContext con) {
		String trackApplication = (String)con.getAttribute("access_application");
		return trackApplication;
	}
}
