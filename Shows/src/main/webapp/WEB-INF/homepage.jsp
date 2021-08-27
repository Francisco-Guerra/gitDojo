<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
			integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
			crossorigin="anonymous">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta charset="UTF-8">
		<title>HomePage</title>
	</head>
	<body>
		
			<h1>Welcome <c:out value="${currentUser.getFirst_name()}" /> <c:out value="${currentUser.getLast_name()}" />!</h1>
		    <p><b>TV Shows</b></p>	  
		 
		 <div class="container mt-5">
        	<table class="table table-bordered">
			  <thead class="table" style="background: gray; color: White;">			  	
			    <tr>
			      <th scope="col">Show</th>
			      <th scope="col">Network</th>
			      <th scope="col">Avg Rating</th>
			    </tr>				
			  </thead>
			  <tbody>
			  	<c:forEach items="${show}" var="show">
					<tr>
						<td><a href="/show/<c:out value="${show.id}"/>"> <c:out value="${show.name}"/></a></td>
					    <td><c:out value="${show.name}"/></td>
					    <td><c:out value="${show.network}"/></td>
					    <td><c:out value="${show.avg}"/></td>
				    </tr>
				</c:forEach>			 
			  </tbody>
			</table>
        </div>    
		       
		    <form id="logoutForm" method="POST" action="/new">
		        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		        <button type="submit" class="btn btn-secondary">Add a show</button>
		    </form>	    
    
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
		
	</body>
</html>