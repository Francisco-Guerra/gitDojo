<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<script type="text/javascript" src="js/date.js"></script>
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<meta charset="ISO-8859-1">
		<title>Date</title>
	</head>
	<body>
		
		<h1 id="date"><c:out value="${date}"/></h1>
		
	</body>
</html>