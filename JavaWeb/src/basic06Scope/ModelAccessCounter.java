package basic06Scope;

import javax.servlet.http.HttpSession;

public class ModelAccessCounter {
	private int requestNo=1;
	private int sessionNo=1;
	private int applicationNo=1;

	public int countRequest(String trackRequest) {
		if(trackRequest !=null) {
			requestNo = Integer.parseInt(trackRequest);
			requestNo++;
		}
		return requestNo;
	}

	public int countSession(String trackSession, HttpSession session) {
		if(trackSession !=null) {
			sessionNo = Integer.parseInt(trackSession);
			sessionNo++;
		}else {
			session.setMaxInactiveInterval(60);
		}
		return sessionNo;
	}

	public int countApplication(String trackApplication) {
		if(trackApplication !=null) {
			applicationNo = Integer.parseInt(trackApplication);
			applicationNo++;
		}
		return applicationNo;
	}

}
