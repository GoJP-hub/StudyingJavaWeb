<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AccessPage</title>
</head>
<body>
	<p>Input form</p>
	<form action="../ControllerServletScope" method="post">
		<p>
			Please insert name: <input type="text" name="name_request">
		</p>
		<input type="submit" value="Send">
	</form>
</body>
</html>