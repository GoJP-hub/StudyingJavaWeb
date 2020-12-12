<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="user" scope="request"
	class="basic05MvcModel.ModelUserBean" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Response-Success</title>
</head>
<body>
	<p>The result for request</p>
	<p>
		ID:<%=user.getId()%></p>
	<p>
		名前:<%=user.getName()%></p>
	<p>
		年齢：<%=user.getAge()%></p>
	<form>
		<input type="button"
			onclick="location.href='./basic05MvcModel/userReq.jsp'" value="BACK">
	</form>
</body>
</html>