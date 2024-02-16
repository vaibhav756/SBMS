<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<meta charset="ISO-8859-1">
<title>Employee Joinig</title>
<style type="text/css">
table, th, td {
  border:1px solid black;
}
</style>
</head>
<body>
<h2>Employee Joining Form</h2>
<table>
<form:form modelAttribute="emp" action="submitempform" method="POST">
	<tr>
		<td>Employee Name :</td>
		<td><form:input path="empName" /></td>
	</tr>
	<tr>
		<td>Employee Email</td>
		<td><form:input path="empEmail" /></td>
	</tr>
	<tr>
		<td>Employee Gender</td>
		<td><form:radiobutton path="empGender" value="Male" />Male<form:radiobutton path="empGender" value="Female"/>Female</td>
	</tr>
	<tr>
		<td>Employee Department</td>
		<td><form:select path="empDept">
		<form:options items="${department}"/>
		</form:select></td>
	</tr>
	<tr>
		<td>Employee Shift</td>
		<td><%-- <form:checkboxes items="${shift}" path="empShift"/> --%>
		<form:checkbox path="empShift" value="Morning"/>Morning
		<form:checkbox path="empShift" value="Afternoon"/>Afternoon
		<form:checkbox path="empShift" value="Evening"/>Evening
		</td>
	</tr>
	<tr>
		<td>Employee Address</td>
		<td><form:textarea path="empAddress" /></td>
	</tr>
	<tr>
		<td><input type="submit" value="Submit"></td>
	</tr>
</form:form>
</table>

</body>
</html>