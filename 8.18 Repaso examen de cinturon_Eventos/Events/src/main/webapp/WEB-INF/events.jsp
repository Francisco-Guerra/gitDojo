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
	        <form id="logoutForm" method="POST" action="/logout">
	            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	            <input type="submit" value="Logout" class="btn btn-xs pull-right"/>
	        </form> 
	        <h1>Welcome, ${user.first}</h1>
	        <br>
	        <h4>Here are some of the events in your state:</h4>
	        <c:if test="${instate.size() == 0}"><h5>Sorry, There are currently no events in your area</h5></c:if>
	        <c:if test="${instate.size() > 0}">
	            <table class="table table-striped table-ruled">
	                <tr>
	                    <th>Name</th>
	                    <th>Date</th>
	                    <th>Location</th>
	                    <th>Host</th>
	                    <th>Action / Status</th>
	                </tr>
	                <c:forEach items="${instate}" var="event">
	                        <tr>
	                            <td><a href="/events/${event.id}">${event.name}</a></td>
	                            <td><fmt:formatDate pattern = "dd/MM/yyyy" value="${event.eventDate}"></fmt:formatDate></td>
	                            <td>${event.city}, ${event.state}</td>
	                            <td>${event.hostess.first} ${event.hostess.last}</td>
	                            <c:choose>
	                                <c:when test="${event.hostess == user}">
	                                    <td><a href="/events/${event.id}/edit">Edit</a> | <a href="events/${event.id}/delete">Delete</a></td>
	                                </c:when>
	                                <c:otherwise>
	                                    <c:set var = "attending" value= "${false}"/>
	                                    <c:forEach items="${event.getUsersAttending()}" var="partier">
	                                        <c:if test="${partier == user}">
	                                            <c:set var = "attending" value= "${true}"/>
	                                        </c:if>
	                                    </c:forEach>
	                                    <c:choose>
	                                        <c:when test="${attending == false}">
	                                            <td><a href="/events/${event.id}/join">Join</a></td>
	                                        </c:when>
	                                        <c:otherwise>
	                                            <td>Joining | <a href="events/${event.id}/bail">Cancel</a></td>
	                                        </c:otherwise>
	                                    </c:choose>
	                                </c:otherwise>
	                            </c:choose>        
	                        </tr>
	                </c:forEach>
	            </table>
	        </c:if>
	        <br>
	        <h4>Here are some of the events in other states:</h4>
	        <table class="table table-striped table-ruled">
	            <tr>
	                <th>Name</th>
	                <th>Date</th>
	                <th>Location</th>
	                <th>State</th>
	                <th>Host</th>
	                <th>Action / Status</th>
	            </tr>
	            <c:forEach items="${outofstate}" var="event">
	                <tr>
	                    <td><a href="/events/${event.id}">${event.name}</a></td>
	                    <td><fmt:formatDate pattern = "MM/dd/yyyy" value="${event.eventDate}"></fmt:formatDate></td>
	                    <td>${event.city}</td>
	                    <td>${event.state}</td>
	                    <td>${event.hostess.first} ${event.hostess.last}</td>
	                    <c:choose>
	                        <c:when test="${event.hostess == user}">
	                            <td>Joining | <a href="/events/${event.id}/edit">Edit</a> | <a href="events/${event.id}/delete">Delete</a></td>
	                        </c:when>
	                        <c:otherwise>
	                            <c:set var = "attending" value= "${false}"/>
	                            <c:forEach items="${event.getUsersAttending()}" var="partier">
	                                <c:if test="${partier == user}">
	                                    <c:set var = "attending" value= "${true}"/>
	                                </c:if>
	                            </c:forEach>
	                            <c:choose>
	                                <c:when test="${attending == false}">
	                                    <td><a href="/events/${event.id}/join">Join</a></td>
	                                </c:when>
	                                <c:otherwise>
	                                    <td>Joining | <a href="events/${event.id}/bail">Cancel</a></td>
	                                </c:otherwise>
	                            </c:choose>
	                        </c:otherwise>
	                    </c:choose>
	                </tr>
	            </c:forEach>
	        </table>
	        <br>
	        <div class="col-md-6">
	            <h3>Create an Event</h3>
	            <form:form method="POST" action="/event/create" modelAttribute="event">
	                <p><form:label path="name">Name: </form:label><form:input path="name"/></p>
	                <p><form:label path="eventDate">Date: </form:label><form:input type="date" path="eventDate"/></p>
	                <p>Location: 
	                    <form:input path="city"/>
	                    <form:select path="state">
	                        <c:forEach items="${states}" var="st">
	                            <form:option path="state" value="${st}"></form:option>
	                        </c:forEach>
	                    </form:select>
	                </p>  
	                <input type="submit" value="create!"/>
	            </form:form>   
	        </div>  
	        <div class="col-md-6"><p><form:errors path="course.*"/></p></div>
	    </div>
		
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
		
	</body>
</html>