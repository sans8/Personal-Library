<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="../static/css/Registration.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PLM</title>
</head>
<body>
	<h1>Personal Library Management</h1>
	<div id="container">
	
	<form action="../RegisterController" method="post">
		<h2>Registration</h2>
		<p id="errMsg"><%=session.getAttribute("errMsg") %></p>
		<table>
			<tr>
				<td><input type="text"  placeholder="Name" name="name"/></td>
			</tr>
			<tr>
				<td><input type="text"  placeholder="Username" name="username"/></td>
			</tr>
			<tr>
				<td><input type="password"  placeholder="Password" name="password"/></td>
			</tr>
			<tr>
				<td><input type="password"  placeholder="Confirm Password" name="repassword"/></td>
			</tr>
			<tr>	
				<td><button type="submit">Register</button></td>			
			</tr>
		</table>
	</form>
	</div>
</body>
</html>