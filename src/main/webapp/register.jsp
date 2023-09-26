<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
	<form:form action="savestu" modelAttribute="stu">
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
		<form:button>Save</form:button>
	</form:form>
</body>
</html>