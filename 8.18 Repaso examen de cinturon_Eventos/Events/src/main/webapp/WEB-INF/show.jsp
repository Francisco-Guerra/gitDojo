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
		<title>${event.name}</title>
	</head>
	<body>
		
		<div class="container">
	        <a href="/events">Back</a>
	        <h1>${event.name}</h1>
	        <div class="col-md-6">
	            <h4>Host: ${event.hostess.first} ${event.hostess.last}</h4>
	            <h4>Date: <fmt:formatDate pattern = "dd/MM/yyyy" value="${event.eventDate}"></fmt:formatDate></h4>
	            <h4>Location: ${event.city}, ${event.state}</h4>
	            <h4># People attending: ${event.usersAttending.size()}</h4><br>
	            <table class="table table-striped table-ruled">
	                <tr>
	                    <th>Name</th>
	                    <th>Location</th>
	                </tr>
	                <c:forEach items="${users}" var="attendee">
	                    <tr>
	                        <td>${attendee.first} ${attendee.last}</td>
	                        <td>${attendee.city}</td>
	                    </tr>
	                </c:forEach>
	            </table>
	        </div>  
	        <div class="col-md-6">
	            <h3>Message Wall</h3>
	            <div style="height: 150px; width: 500px; overflow: auto; outline: solid 1px black;">
	                <c:forEach items="${messages}" var="comment">
	                    <p>${comment.user.first} says: ${comment.message}</p>
	                    <p>--*--*--*--*--*--*--</p>
	                </c:forEach>
	            </div>
	            <br>
	            <form:form method="POST" action="/events/${event.id}/addmsg" modelAttribute="msg">
	                <form:label path="message">Add Comment: </form:label><form:input path="message" type="textarea"/>
	                <br>
	                <input type="submit" value="Submit"/>
	            </form:form>
	            <br><p><form:errors path="msg.*"/></p>
	        </div>
	    </div>
		
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
		
	</body>
</html>