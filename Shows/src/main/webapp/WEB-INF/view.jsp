<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix ="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
			integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
			crossorigin="anonymous">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" charset="UTF-8">
		<title>SignUp</title>
	</head>
	<body>
		
		<h1><b><c:out value="${show.name}"></c:out></b></h1>
	    <p>Network: <c:out value="${show.network}"></c:out></p>
	    
	    <h1><b>Users who rated this show</b></h1>
	    
	     <div class="container mt-5">
        	<table class="table table-bordered">
			  <thead class="table" style="background: gray; color: White;">			  	
			    <tr>
			      <th scope="col">Name</th>
			      <th scope="col">Rating</th>
			    </tr>				
			  </thead>
			  <tbody>
			  	<c:forEach items="${user}" var="user">
					<tr>
						<td><c:out value="${user.first_name}"/> <c:out value="${user.last_name}"/></td>
					    <td><c:out value="${user.avg}"/></td>
				    </tr>
				</c:forEach>			 
			  </tbody>
			</table>
        </div>  
        
        <form id="logoutForm" method="POST" action="/edit">
		        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		        <button type="submit" class="btn btn-secondary">Edit</button>
		</form>	
		
		<h1>Leave Rating: </h1>
		<form:form method="POST" action="/registration" modelAttribute="user">
			<div class="col-3 py-2"><form:label path="avg"><h1><b>Leave a Rating: </b></h1></form:label></div>
			<div class="col-3 py-2"><form:input path="avg"/></div>
			<button type="submit" class="btn btn-secondary">Rate!</button>
		</form:form>
    
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
		
	</body>
</html>