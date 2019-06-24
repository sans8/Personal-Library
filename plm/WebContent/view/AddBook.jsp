<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="static/css/AddBook.css">
<link rel="stylesheet" href="static/css/HeaderFooter.css">
<script type="text/javascript" src="static/js/AddBook.js"></script>
<title>PLM | ADD BOOK</title>

</head>
<body>   
	<jsp:include page="../static/include/header.jsp"></jsp:include>
	<div id="container">
		<h2>ADD BOOK</h2>
		<p id="error"><%=request.getAttribute("errMsg") %></p>
		<form action="AddBookController" method="post" onsubmit="return validate()">
			<table>
				<tr>
					<td>Title:</td>
					<td><input id="titleId" type="text" name=title>
					<span id=stitle></span></td>
				</tr>
				<tr>
					<td>Author:</td>
					<td><input id="authorId" type="text" name=author>
					<span id=sauthor></span></td>
				</tr>
				<tr>
					<td>Price:</td>
					<td><input id="priceId" type="text" name=price>
					<span id=sprice></span></td>
				</tr>
				<tr>
					<td>Publisher:</td>
					<td><input type="text" id="publisherId" name=publisher>
					<span id=spublisher></span></td>
				</tr>
				<tr>
					<td>ISBN:</td>
					<td><input id="isbnId" type="text" name=isbn>
					<span id=sisbn></span></td>
				</tr>
				<tr>
					<td colspan=2 align="right"><input type="submit"
						value="Submit" id="submit" ></td>
				</tr>
			</table>
		</form>
	</div>
	<jsp:include page="../static/include/footer.jsp"></jsp:include>
</body>
</html>