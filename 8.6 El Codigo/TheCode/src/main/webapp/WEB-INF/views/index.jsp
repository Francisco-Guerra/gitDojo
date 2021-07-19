<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<style type="text/css">
			h2{color: red;}
		</style>
		<meta charset="ISO-8859-1">
		<title>Secret Code</title>
	</head>
	<body style="text-align: center;">
		
		<div>
			<c:out value="${error}" escapeXml="false"/>
			<h4>What is the code?</h4>
			<form action="CodeProcess" method="post">
				<input type=text name=code placeholder="Enter Code Here">
				<br>
				<br>
				<button type=submit>Try Code</button>
			</form>
		</div>
		
	</body>
</html>