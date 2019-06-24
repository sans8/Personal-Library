<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*,com.yash.plm.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//Dth HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dth">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>PLM | BOOK LIST</title>
<link rel="stylesheet" href="static/css/HeaderFooter.css">
<link rel="stylesheet" href="static/css/ListBook.css">
</head>
<body>
	<jsp:include page="../static/include/header.jsp"></jsp:include>
	<div id="container">
		<%
			int count = 1;
			List<Book> books = (List<Book>) request.getAttribute("books");
		%>
		<h2>List Of Books</h2>
		<form action="UpdateDeleteController" method="post">
			<table>
				<tr>
					
					<th>S.No.</th>
					<th>Title</th>
					<th>Author</th>
					<th>Price</th>
					<th>Publisher</th>
					<th>ISBN</th>
					<th></th>
				</tr>

				<c:forEach var="book" items='${books}'>
					<tr>
						<td><%=count++%></td>
						<td><c:out value='${book.title}' /></td>
						<td><c:out value='${book.author}' /></td>
						<td><c:out value='${book.price}' /></td>
						<td><c:out value='${book.publisher}' /></td>
						<td><c:out value='${book.isbn}' /></td>
						<td>
							<input type="checkbox" name="select" value='${book.isbn}' />
							<button type="submit" name=delete value='${book.isbn}'>Delete</button>
							<button type="submit" name=update value='${book.isbn }'>Update</button>
						</td>
					</tr>
				</c:forEach>
			</table>
			<button id="delete" type="submit" name="deleteSelected">Delete Selected Books</button>
			<br>
			<button id="report" type="submit" name="report">Download Excel</button>
		</form>
	</div>
	<jsp:include page="../static/include/footer.jsp"></jsp:include>
</body>
</html>