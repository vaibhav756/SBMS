<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<meta charset="ISO-8859-1">
<style>
table, th, td {
  border:1px solid black;
}
</style>
<title>Insert title here</title>
</head>
<body>
<form action="insertBook"  method="GET">
	Book Name<input type="text" name="book_name" />
	Book Price<input type="number" name="book_price" />
	<input type="submit" value="Submit">
</form>
<table>
	<tr>
		<th>Book Id</th>
		<th>Book Name</th>
		<th>Book Price</th>
	</tr>
	<c:forEach items="${books}" var="book">
	<tr>
		<td>${book.bookId}</td>
		<td>${book.bookName}</td>
		<td>${book.bookPrice}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>