<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Student</title>
</head>
<body>
	<table border="2px solid" cellpadding="5px" cellspacing="5px">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>AGE</th>
			<th>PHONE</th>
			<th>EMAIL</th>
			<th>PASSWORD</th>
			<th>EDIT</th>
			<th>DELETE</th>
		</tr>
		
		<c:forEach var="list" items="${list}">
		<tr>
			<td>${list.getId()}</td>
			<td>${list.getName()}</td>
			<td>${list.getAge()}</td>
			<td>${list.getPhone()}</td>
			<td>${list.getEmail()}</td>
			<td>${list.getPassword()}</td>
			<td><a href="editstu?id=${list.getId()}">Edit</a></td>
			<td><a href="deletestu?id=${list.getId()}">Delete</a></td>
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>