<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.yash.plm.model.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="static/css/Home.css">
<title>Welcome</title>
</head>
<body>
	
	<h1>Welcome, <%=((User)session.getAttribute("User")).getName() %> !</h1>
	<br><br>
	<p>" Good friends, good books, and a sleepy conscience: this is the ideal life."</p>
	<form action="HomeController" method="post">
		<br><br>
		<button id="add" type="submit" name=add value="add">Add Book To Collection</button> 
		<button id="view" type="submit" name = view value="view">View Book Collection</button>
	
	</form>
	</body>
</html>