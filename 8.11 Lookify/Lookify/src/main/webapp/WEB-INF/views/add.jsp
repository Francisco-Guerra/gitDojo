<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<meta charset="ISO-8859-1">
		<title>Add Song</title>
	</head>	
	<body class="bg-secondary">
	
        <div class="pr-2 mt-2 mb-5 text-right">
        	<a href="/dashboard"><button type="button" class="btn btn-outline ml-auto" style="color: gold; background: #003153; border: solid 2px blue;">Dashboard</button></a>
		</div>
		
        <div class="container mt-5">      
			<form:form action="/songs/new" method="post" modelAttribute="Music">
				<p><form:errors path="name" class="alert alert-danger"/></p>				
			    <p>
			        <form:label cssClass="h4 text-warning" path="name">Title: </form:label>
			        <form:input cssClass="form-control d-inline-block col-4"   path="name"/>
			    </p>			    
			    <p><form:errors path="artist" class="alert alert-danger"/></p>
			    <p>
			        <form:label cssClass="h4 text-warning" path="artist">Artist: </form:label>			       
			        <form:input cssClass="form-control d-inline-block col-4" path="artist"/>
			    </p>			    
			    <p><form:errors path="rating" class="alert alert-danger"/></p>
			    <p>
			        <form:label cssClass="h4 text-warning" path="rating">Rating: </form:label>			        
			        <form:select cssClass="custom-select col-1" path="rating">
			        	<c:forEach begin="1" end="10" var="loop">
	    					<form:option value="${loop}"> ${loop} </form:option>
						</c:forEach>
					</form:select>
			    </p>			      
			    <input class="btn btn-outline-dark " style="color: gold; background: #003153; border: solid 2px blue;" type="submit" value="Submit"/>
			</form:form>
		</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
			
	</body>
</html>