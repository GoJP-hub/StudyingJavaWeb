<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Note-BeanClass</title>
</head>
<body>

	<h5>Objective</h5>
	<ul>
		<li>Let's learn Bean class to understand better about Model</li>
	</ul>

	<h5>What is Bean class?</h5>
	<ul>
		<li>AKA. Java Beans</li>
		<li>Java Beans is a class for using the properties</li>
		<li>Property: The data required for the display (JSP)</li>
		<li>This data includes ①data being displayed on window, ②data used for config/regulating display</li>
		<li>ex1-display data: ID... user.getID(); name... user.getName</li>
		<li>ex2-regulate data: user.getAuth... the value set for Auth defines the logic whether to display</li>
	</ul>

	<h5>What is the rule for using Bean Class?</h5>
	<ul>
		<li>--Critical Rules/Traits--</li>
		<li>needs Constructor that is ①public and ②with no input</li>
		<li>needs member variable that is ①private</li>
		<li>needs access methods for these member variables</li>
		<li>needs Serialized interface--- for output java instance as byte</li>
		<li>--Minor Rules/for creations--</li>
		<li>put class name as ●●●Bean</li>
		<li>set unique serialVersionUID</li>
		<li>use the name "set--" and "get--" for access methods</li>
	</ul>

	<h5>Confusing/Contrasting Design Concepts (to Bean)</h5>
	<ul>
		<li>VO: Value Object-- design to display the value as itself</li>
		<li>-- cannot change the values stored in variables</li>
		<li>DTO: Data transfer object--design for transferring data and NOT display</li>
		<li>-- how to define the request/response... is related to DTO</li>
		<li>-- display related data maintained by classes such as Collection and Bean</li>
		<li>Entity: design to display values in DB</li>
	</ul>

	<h5>Template</h5>
	<ul>
		<li>Template</li>
	</ul>

</body>
</html>