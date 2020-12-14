<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="user" scope="session"
	class="basic08MvcLogin.ModelLoginUserBean" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン成功</title>
<link href="/basic08MvcLogin/css/login.css" rel="stylesheet"
	type="text/css">
</head>
<body>
	<h1>ログインユーザ情報</h1>
	<p>
		ID:<jsp:getProperty property="id" name="user" /></p>
	<p>
		Name:<jsp:getProperty property="name" name="user" /></p>
	<p>
		Age:<jsp:getProperty property="age" name="user" /></p>
	<form>
		<input class="common_button" type="button"
			onclick="location.href='./basic08MvcLogin/LoginReq.jsp'" value="BACK">
	</form>
</body>
</html>