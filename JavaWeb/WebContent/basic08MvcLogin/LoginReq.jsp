<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:useBean id="user" scope="session" class="basic08MvcLogin.ModelLoginUserBean" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<link href="/basic08MvcLogin/css/login.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
	<div class="login_pane">
		<h1>ログイン画面</h1>
		<h2>ログインIDとパスワードを入力してください</h2>
		<form action="../ControllerLogin" method="post">
			<table class="table_form">
				<tbody>
					<tr>
						<%--ログイン済みの場合、IDを表示 --%>
						<th>ログインID</th>
						<td><input type="text" name="id" value="<%=user.getId()%>" /></td>
					</tr>
					<tr>
						<th>パスワード</th>
						<td><input type="text" name="password" /></td>
					</tr>
				</tbody>
			</table>
			<input class="common_button" type="submit" name="submit" value="login" />
			<%--Display if you are already logged in--%>
			<% if("login".equals(session.getAttribute("status"))){ %>
			<input class="common_button" type="submit" name="submit" value="logout" />
			<% } %>
		</form>
	</div>

</body>
</html>