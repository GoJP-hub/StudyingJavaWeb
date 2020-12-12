<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scope Result Page</title>
</head>
<body>
	<p>アクセス回数</p>
	<p><%=session.getAttribute("name_session")%>のアクセス回数
	</p>
	<p>
		リクエスト：<%=request.getAttribute("access_request")%>回
	</p>
	<p>
		セッション：<%=session.getAttribute("access_session")%>回
	</p>
	<p>
		アプリケーション：<%=application.getAttribute("access_application")%>回
	</p>
	<form>
		<input type="button"
			onclick="location.href='./basic06Scope/scopeAccess.jsp'" value="Back">
	</form>
</body>
</html>