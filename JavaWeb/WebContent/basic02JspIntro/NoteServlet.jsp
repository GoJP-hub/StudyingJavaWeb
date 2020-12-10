<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet</title>
</head>
<body>
<h3>What is servlet?</h3>
<h5>Servlet is basically java. </h5>
<ul>
<li>It is used for implementing process at server-side</li>
<li>More simply, it is used as a "receiver" of Requests</li>
</ul>
<h5>It extends (inherits) from HttpServlet class</h5>

<h3>What is unique about servlet?</h3>
<h5>It has sets of methods that we can override</h5>
<ul>
<li>doGet method:  </li>
<li>doPost method: </li>
<li>doHead method: </li>
<li>doPut method: </li>
<li>doDelete method: </li>
</ul>

<h5>Common methods used for Html is doGet and doPost</h5>
<ul>
<li>doGet method:  passes a value to server by attaching at URL (explicitly viewable)</li>
<li>doPost method:  passes a value to server by attaching in HTML body (implicit= unviewable)</li>
</ul>

<h5>Structure of using Servlet</h5>
<ul>
<li>JSP is the front side. JSP calls the Servlet, which is the server side</li>
<li>Key point is that JSP is passing over the data to Servlet.</li>
<li>This can be done by various methods including Form</li>
</ul>

<h5>How to use Form</h5>
<ul>
<li>Calling Form Tag: [form method="POST" action="./FormServlet"]</li>
<li>TextFields: Create a field by [P] and define trait and data by [input type="text" name="text 1"]</li>
<li>Request Trigger: Create a field [input type="submit" value="POSTで送信"]</li>
<li>Explanation-- action: sets the destination of POST, form method: defines type of HTTP</li>
<li>Explanation-- name: variable name that Servlet will use to notice</li>
<li>Template</li>
</ul>

<h5>Template</h5>
<ul>
<li>Template</li>
</ul>

</body>
</html>