<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form JSP with Servlet</title>
</head>
<body>
	<p>Input form</p>
	<p>Please insert a value</p>
	<%-- This is for get method --%>
	<form action="../FormServlet">
		<p>
			Insert a value here; <input type="text" name="str1">
		</p>
		<p>
			Insert a value here; <input type="text" name="str2">
		</p>
		<input type="submit" value="Send by GET">
	</form>

	<%-- This is for post method --%>
	<form method="post" action="../FormServlet">
		<p>
			Insert a value here; <input type="text" name="str1">
		</p>
		<p>
			Insert a value here; <input type="text" name="str2">
		</p>
		<input type="submit" value="Send by POST">
	</form>
</body>
</html>