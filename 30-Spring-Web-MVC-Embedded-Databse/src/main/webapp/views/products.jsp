<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta charset="ISO-8859-1">
<title>Products Details</title>
<style type="text/css">
table, th, td {
  border:1px solid black;
}
</style>
</head>
<body>
<table>
<h2>Product Details</h2>
<form:form action="/" modelAttribute="products" method="GET">
	<tr>
		<td>Product Id</td>
		<td>Product Name</td>
		<td>Product Price</td>
		<td>Product Quantity</td>
	</tr>
	<c:forEach var="prod" items="${products}">
		<tr>
			<td>${prod.productId}</td>
			<td>${prod.productName}</td>
			<td>${prod.productPrice}</td>
			<td>${prod.productQuantity}</td>
		</tr>
	</c:forEach>
	<tr><td><input type="submit" value="Back" /></td></tr>
</form:form>
</table>

</body>
</html>