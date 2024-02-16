<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<style type="text/css">
table, th, td {
  border:1px solid black;
}
</style>
</head>
<body>
<h2>Product Details</h2>
<table>
	<form:form action="addproduct" method="POST" modelAttribute="dto" >
	<table>
		<tr>
			<td>Product Name : </td>
			<td><form:input path="productName" /></td>
		</tr>
		<tr>
			<td>Product Price : </td>
			<td><form:input path="productPrice" /></td>
		</tr>
		<tr>
			<td>Product Quantity : </td>
			<td><form:input path="productQuantity" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" /></td>
			<td></td>
		</tr>
	</table>
	</form:form>
</table>
</body>
</html>