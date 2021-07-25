<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<meta charset="ISO-8859-1">
		<title>Details</title>
	</head>
	<body class="bg-secondary">
       
		<div class="pr-2 mt-2 mb-5 text-right">
        	<a href="/dashboard"><button type="button" class="btn btn-outline ml-auto" style="color: gold; background: #003153; border: solid 2px blue;">Dashboard</button></a>
		</div>
		
		<div class="container">
			<h1 class="text-warning"><u>Song Info</u></h1>
			<br>			
			<h3 style="color: #003153;">Title: <span style="color: gold;"><c:out value="${song.name}"/></span></h3>
			<h3 style="color: #003153;">Artist: <span style="color: gold;"><c:out value="${song.artist}"/></span></h3>
			<h3 style="color: #003153;">Rating (1-10): <span style="color: gold;"><c:out value="${song.rating}"/></span></h3>
			<br>
			<form action="/dashboard/<c:out value="${song.id}"/>" method="post" class="d-inline-block">
				<input type="hidden" name="_method" value="delete">
				<input type="submit" class="btn btn-outline-dark" style="color: gold; background: #003153; border: solid 2px blue;" value="Delete">
			</form >
		</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
	
	</body>
</html>