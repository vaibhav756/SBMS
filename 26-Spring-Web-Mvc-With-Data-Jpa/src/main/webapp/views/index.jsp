<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border:1px solid black;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="getBookById">
	<span>Enter BookId :</span>
	<input name="bookId" type="number" >
	<input type="submit" value="search">
	</form>
	<table>
		<tr>
			<th>Book Id</th>
			<th>Book Name</th>
			<th>Book Price</th>
		</tr>
		</tr>
		<tr>
			<td>${book.bookId}</td>
			<td>${book.bookName}</td>
			<td>${book.bookPrice}</td>
		</tr>
	</table>
	</body>
	</html>