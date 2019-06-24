<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.yash.plm.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="static/css/HeaderFooter.css">
<link rel="stylesheet" href="static/css/UpdateBook.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PLM | UPDATE BOOK</title>
</head>
<body>
	<jsp:include page="../static/include/header.jsp"></jsp:include>
	<%
		Book book = (Book) request.getAttribute("book");
	%>
	<div id="container">
		<h2>Book Details </h2>
		<form action="UpdateBookController" method="post">
			<table>
				<tr>
					<td>Title</td>
					<td><input type="text" name=title value='${book.title}'></td>
				</tr>
				<tr>
					<td>Author</td>
					<td><input type="text" name=author value='${book.author}'></td>
				</tr>
				<tr>
					<td>Price</td>
					<td><input type="text" name=price value='${book.price}'></td>
				</tr>
				<tr>
					<td>Publisher</td>
					<td><input type="text" name=publisher
						value='${book.publisher}'></td>
				</tr>
				<tr>
					<td>ISBN</td>
					<td><input type="text" name=isbn value='${book.isbn}' readonly></td>
				</tr>
				<tr>
					<td colspan=2 align="right"><input type="submit"
						value="Update"></td>
				</tr>
			</table>
		</form>
	</div>
	<jsp:include page="../static/include/footer.jsp"></jsp:include>
</body>
</html>