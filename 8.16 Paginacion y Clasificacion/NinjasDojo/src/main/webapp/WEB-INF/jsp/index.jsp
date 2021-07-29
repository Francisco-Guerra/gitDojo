<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<meta charset="ISO-8859-1">
		<title>Dojo Page</title>
	</head>
	<body>	
	
		<div class="container">
	        <h1 class="jumbotron">${dojo.name} Location - Ninjas</h1>
	        <a href="/"><button class="button btn-sm btn pull-right">Home</button></a>
	        <table class="table table-striped">
	            <thead>
	                <tr>
	                    <th>First Name</th>
	                    <th>Last Name</th>
	                    <th>Age</th>
	                </tr>
	            </thead>
	            <tbody>
	            <c:forEach items="${ninjas}" var="ninja">
	                <tr>
	                    <td>${ninja.firstname}</td>
	                    <td>${ninja.lastname}</td>
	                    <td>${ninja.age}</td>
	                </tr>
	            </c:forEach>
	            </tbody>
	        </table>
	    <h3 class="text-center">${noone}</h3>
	    </div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
	
	
	</body>
</html>