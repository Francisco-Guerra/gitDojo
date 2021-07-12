<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Button Clicker</title>
	</head>
	<body style="text-align: center;">
		<br><br>
		<a href="/Counter"><button type="button">Click Me!</button></a> 
		<br>
 		<h1> You have clicked this button <c:out value="${count}"/> times </h1>
	</body>
</html>