<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Note-Redirect and Forward</title>
</head>
<body>
<h5>What is Forward/Redirect</h5>
<ul>
<li>In short, it is th method to shift from one page to another</li>
<li>Redirect: Server secretly moves from one page to another</li>
<li>ex) Client sends a request to move to Page A, and Server changes this responds/converts from Page A to B in secret</li>
<li>Redirect is used to show new webpage</li>
<li>How to call: response.sendRedirect("./url.jsp")</li>
<li>Forward: Server acts to create and display the page</li>
<li>Forward is used to display the same website (different page).</li>
<li>Foward is preferred for this action, rather than redirect, which can be used</li>
<li>How to call: </li>
<li>①ServletContext con = request.getServletContext(); </li>
<li>②RequestDispatcher rd = con.getRequestDispatcher("./project/jsp")</li>
<li>③rd.forward(request, response);</li>
<li>Template</li>
</ul>

<h5>Difference between Forward and Redirect</h5>
<ul>
<li>Req/Resp: Redirect is twice, Foward is once</li>
<li>Req info: Redirect cannot carry, Foward can carryover</li>
<li>transition to another web: Redirect can, Foward cannot</li>
<li>Process speed: Redirect relatively slow, Foward relatively faster</li>
<li>URL used are different: Redirect uses landing page's URL while Forward uses original URL (/forward)</li>
</ul>

<h5>Template</h5>
<ul>
<li>Template</li>
</ul>

</body>
</html>