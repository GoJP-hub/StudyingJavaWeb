<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Note-MVP Model</title>
</head>
<body>

<h5>What is MVP model?</h5>
<ul>
<li>It stands for Model-View-Controller</li>
<li>It is the design for creating an application</li>
<li>Model: Processes</li>
<li>View: Display</li>
<li>Controller: Entrypoint</li>
</ul>

<h5>Merits of using MVP model</h5>
<ul>
<li>System design is structured and clear</li>
<li>Improves maintenability</li>
<li>Distinguishes the role of Web Designer and Programmer</li>
</ul>

<h5>How does the MVP model works?</h5>
<ul>
<li>Two actors: Client and Application (with MVP model)</li>
<li>Controller receives the Request (HTTP) from the client</li>
<li>Controller selects and trigger the functions noted in Model</li>
<li>Then, Controller orders View to display the results conducted in the model</li>
<li>View refers to Model based on command from Controller</li>
<li>View gives Response (HTTP) to the client</li>
</ul>

<h5>Why is MVC model unpopular?</h5>
<ul>
<li>Originally, MVC model was one directional: [request]>Controller>Model>View>[Response]</li>
<li>In this model, Model had the responsibility to generate and edit the data</li>
<li>However, USER (Request) wanted to be the driver of changing the data rather than SYSTEM (Model)</li>
<li>Therefore, the key concept now is that CONTROLLER is driver on triggering different models</li>
</ul>

<h5>Template</h5>
<ul>
<li>Template</li>
</ul>

</body>
</html>