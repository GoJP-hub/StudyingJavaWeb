<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Starting Page</title>
</head>
<body>
	<p>Input Form</p>
	<%--Uses POST Methods for sending data--%>
	<form action ="../ControllerServlet" method="post">
		<P>
			Please insert value <input type="text" name="id">
		</P>
		<p>The value to be inserted are Sample1 or Sample2</p>
		<input type="submit" value="Request">
	</form>
</body>
</html>