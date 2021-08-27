<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix ="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
			integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
			crossorigin="anonymous">
		<meta name="viewport" 
			content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta charset="UTF-8">
		<title>Edit</title>
	</head>
	<body>
		
		<h1><b>${show.name} </b></h1>
		
		<div class="container">		
			<form method="POST" action="/show/{id}/edit">
				    <div class="row">
				    	<div class="col-3 my-4" ><label for="title">Title: </label></div>
				    	<div class="col-3 my-4"><input type="text" id="title" name="title" value="${show.title}"/></div>
				    </div>
					<div class="row">
				    	<div class="col-3"><label for="network">Network: </label></div>
				    	<div class="col-3"><input type="text" id="network" name="network" value="${show.network}"/></div>
				    </div>				        
				    <div class="row">
				    	<div class="col-8 py-4 text-right">
				    		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				       		<button type="submit" class="btn btn-secondary">Update</button>
				    	</div>
				    	<br>
				    	<div class="col-8 py-4 text-right">
				    		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				       		<button type="submit" class="btn btn-secondary">Delete</button>
				    	</div>
				    </div>				        
		  	</form>
		</div>
		
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
		
	</body>
</html>