<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix ="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ page import= "java.util.Date"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta charset="UTF-8">
		<title>Events</title>
	</head>
	<body>
		
		<div class="container">
        <a href="/logout" class="pull-right">Logout</a>
        <h1>Welcome, ${user.first}</h1>
        <table style="text-align: left; outline: 1px black solid;">
            <tr style="margin: 5px;">
                <td style="padding: 10px;">First Name:</td>
                <td style="padding: 10px;">${user.first}</td>
            </tr>
            <tr style="margin: 5px;">
                <td style="padding: 10px;">Last Name:</td>
                <td style="padding: 10px;">${user.last}</td>
            </tr>
            <tr style="margin: 5px;">
                <td style="padding: 10px;">Email:</td>
                <td style="padding: 10px;">${user.email}</td>
            </tr>
            <tr style="margin: 5px;">
                <td style="padding: 10px;">Sign Up Date:</td>
                <td style="padding: 10px;"><fmt:formatDate pattern = "MMMMM dd, yyyy" value="${user.createdAt}"></fmt:formatDate></td>
            </tr>
            <tr style="margin: 5px;">
                <td style="padding: 10px;">Last Sign In:</td>
                <td style="padding: 10px;"><fmt:formatDate pattern = "MMMMM dd, yyyy" value="${user.lastSignIn}"></fmt:formatDate></td>
            </tr>
        </table>
    </div>
		
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
		
	</body>
</html>