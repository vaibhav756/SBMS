<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<style type="text/css">
table, th, td {
  border:1px solid black;
}
</style>
</head>
<body>
<h2>Student Enquiry Form</h2>
<h3><font color="red">${msg}</font></h3>
<form:form modelAttribute="enquiry" method="POST" action="submitenqform">
<table>
	<tr>
		<td>Name :</td>
		<td><form:input type="text" path="studName"></form:input></td>
	</tr>
	<tr>
		<td>Email :</td>
		<td><form:input type="text" path="studEmail"></form:input></td>
	</tr>
	<tr>
 		<td>Gender</td>
		<td>
		<form:radiobutton path="studGender" value="Male" />Male
		<form:radiobutton path="studGender" value="Female"/>Female
		</td>
	</tr>
	<tr>
 		<td>Course</td>
		<td><form:select path="course">
		<%-- <form:options items="${courses}"/> --%>
			<form:option value="">--Select--</form:option>
 			<form:option value="1">Core Java</form:option>
			<form:option value="2">Advanced Java</form:option>
			<form:option value="3">Spring</form:option>
			<form:option value="4">Spring Boot</form:option>
			<form:option value="5">Angular</form:option>
			<form:option value="6">React Js</form:option>
		</form:select></td>
	</tr>
 	<tr>
		<td>Timing</td>
		<td>
		<form:checkbox value="1" path="timing"/>Morning
		<form:checkbox value="2" path="timing"/>Afternoon
		<form:checkbox value="3" path="timing"/>Evening
		<%-- <form:checkboxes items="${time}" path="timing"/> --%>
		</td>
	</tr>
	<tr><td>Address</td><td><form:textarea path="studAddress"/></td></tr>
	<tr><td><input type="submit" value="Submit" /></td></tr>
</table>
</form:form>

</body>
</html>