<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix ="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta charset="UTF-8">
		<title>Edit Event</title>
	</head>
	<body>
		
		<div class="container">
	        <a href="/events">Back</a>
	        <h1>${event.name}</h1>
	        <div class="col-md-6">
	            <h3>Edit Event</h3>
	            <form:form method="POST" action="/events/${event.id}/edit" modelAttribute="emptyevent">
	                <p><form:label path="name">Name: </form:label><form:input path="name"/> (previously: ${event.name})</p>
	                <p><form:label path="eventDate">Date: </form:label><form:input type="date" path="eventDate"/>  (previously: <fmt:formatDate pattern = "dd/MM/yyyy" value="${event.eventDate}"></fmt:formatDate>)</p>
	                <p><form:label path="city">Location: </form:label>
	                    <form:input path="city"/>
	                    <form:select path="state">
	                        <c:forEach items="${states}" var="st">
	                            <form:option path="state" value="${st}"></form:option>
	                        </c:forEach>
	                    </form:select>
	                    (previously: ${event.city}, ${event.state})
	                </p>  
	                <input type="submit" value="Edit"/>
	            </form:form>   
	        </div>  
	        <div class="col-md-6"><p><form:errors path="emptyevent.*"/></p></div>
	    </div>
		
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
		
	</body>
</html>