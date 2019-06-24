<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="static/css/UserLogin.css">
</head>
<body>
	<h1>Personal Library Management</h1>
	<div id="container">
		<h2>Login</h2>
		<p id="errMsg"><%=session.getAttribute("errMsg")%></p>
		<form action="UserAuthenticationController" method="post">
			<table>
				<tr>
					<td><input type="text" placeholder="Username" name="userName"></td>
				</tr>
				<tr>
					<td><input type="password" placeholder="Password" name="password"></td>
				</tr>
				<tr>
					<td><button type="submit">Login</button></td>
				</tr>
			</table>
		</form>
		<p id="register">Haven't Register?</p>
		<center><a href="view/Registration.jsp">Register now.</a></center>
	</div>
</body>
</html>