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
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta charset="UTF-8">
		<title>Events</title>
	</head>
	<body>
		
		<div class="container">
			<div class="row">
			
				<div class="col">
					 <h1>Register</h1>    
				    <p><form:errors path="user.*"/></p>	    
				    <form:form method="POST" action="/registration" modelAttribute="user">
					    	<div class="row">
						    	<div class="col-3 py-2"><form:label path="first_name">First Name:</form:label></div>
						    	<div class="col-3 py-2"><form:input path="first_name"/></div>
						    </div>
						    <div class="row">
						    	<div class="col-3 py-2"><form:label path="last_name">Last Name:</form:label></div>
						    	<div class="col-3 py-2"><form:input path="last_name"/></div>
						    </div>	
						    <div class="row">
						    	<div class="col-3 py-2"><form:label path="email">Email:</form:label></div>
						    	<div class="col-3 py-2"><form:input path="email"/></div>
						    </div>	  
						    <div class="row">
						    	<div class="col-3 py-2"><form:label path="password">Password:</form:label></div>
						    	<div class="col-3 py-2"><form:password path="password"/></div>
						    </div>	   
							<div class="row">
						    	<div class="col-3 py-2"><form:label path="passwordConfirmation">Password Conf:</form:label></div>
						    	<div class="col-3 py-2"><form:password path="passwordConfirmation"/></div>
						    </div>
						    <div class="col-8 py-4 text-right">	
						    	<button type="submit" class="btn btn-secondary">Register</button>					        					        
					        </div>				      
			    	</form:form>
			    </div>
			    			    
			    <div class="col">		
			    	<c:if test="${logoutMessage != null}">
				        <c:out value="${logoutMessage}"></c:out>
				    </c:if>
				
				    <h1>Login</h1>
				    <c:if test="${errorMessage != null}">
				        <c:out value="${errorMessage}"></c:out>
				    </c:if>				    
				    <form method="POST" action="/login">
				    <div class="row">
				    	<div class="col-3 my-4" ><label for="username">Email: </label></div>
				    	<div class="col-3 my-4"><input type="text" id="username" name="username"/></div>
				    </div>
					<div class="row">
				    	<div class="col-3"><label for="password">Password: </label></div>
				    	<div class="col-3"><input type="password" id="password" name="password"/></div>
				    </div>				        
				    <div class="row">
				    	<div class="col-8 py-4 text-right">
				    		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				       		<button type="submit" class="btn btn-secondary">Login</button>
				    	</div>
				    </div>				        
				    </form>			    	
		    	</div>
		    	
	    	</div>
    	</div>
	   
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
		
	</body>
</html>