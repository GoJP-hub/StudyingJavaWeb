<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Note-Scope</title>
</head>
<body>

	<h5>What is Scope</h5>
	<ul>
		<li>The concept for keeping/storing (temp) the data</li>
		<li>ex) Request Scope: request.getParameter("id");</li>
		<li>Storing the data in Request "Scope", and other modules LOOKS
			INTO the Request Scope for data</li>
	</ul>

	<h5>Data storage concept for HTTP</h5>
	<ul>
		<li>Cookies: The scheme to store data in the Browser</li>
		<li>Session: The scheme to create a flow of data between client
			and server using Cookies</li>
		<li>Cashe: (Not HTTP)The scheme to transfer data using tools such
			as Computer's Memory</li>
	</ul>

	<h5>The scopes frequently used</h5>
	<ul>
		<li>Below are three scopes distinguished by broadness of data
			areas its covering</li>
		<li>Request Scope: Scope that is created when Request is sent, but deleted when response returns</li>
		<li>・How to keep Request Scope?? >> Forward methods</li>
		<li>Session Scope: Scope where Server creates and keeps. It will have TIME LIMIT</li>
		<li>・Apache Tomcat has session of 30min as default</li>
		<li>Application Scope: Scope that is created when Application is initiated and lasts until it is closed</li>
		<li>・Context (getServletContext) is one example of Application Scope</li>
	</ul>

	<h5>Template</h5>
	<ul>
		<li>Template</li>
	</ul>

</body>
</html>