<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student</title>
</head>
<body>
	<form:form action="updatestu" modelAttribute="edit">
		Id : <form:input path="id" readonly="true"/>
		<br>
		Name : <form:input path="name"/>
		<br>
		Age : <form:input path="age"/>
		<br>
		Phone : <form:input path="phone"/>
		<br>
		Email : <form:input path="email"/>
		<br>
		Password : <form:input path="password"/>
		<br>
		<form:button>Update</form:button>
	</form:form>
</body>
</html>