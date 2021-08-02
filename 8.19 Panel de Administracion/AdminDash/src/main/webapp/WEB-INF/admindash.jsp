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
        <a href="/logout" class="pull-right">Logout</a>
        <h1>Welcome, ${user.first}</h1>
        <table class="table table-ruled table-striped">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Actions</th>
                    <th>Last Login</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${allUsers}" var="single">
                    <tr>
                        <td>${single.first} ${single.last}</td>
                        <td>${single.email}</td>
                        <c:if test="${user.getRoles().size() > 2}">
                            <td>
                                <c:if test="${single.getRoles().size() == 3}">Super Admin</c:if>
                                <c:if test="${single.getRoles().size() != 3}">
                                    <c:if test="${single == user}">Admin</c:if>
                                    <c:if test="${single != user}">
                                        <a href="/delete/${single.id}">Delete</a>
                                        <c:if test="${single.getRoles().size() == 1}"> | <a href="/make-admin/${single.id}">Make Admin</a></c:if>
                                        <c:if test="${single.getRoles().size() == 2}"> | <a href="/revoke-admin/${single.id}">Revoke Admin</a></c:if>
                                    </c:if>
                                </c:if>
                            </td>
                        </c:if>
                        <c:if test="${user.getRoles().size() == 2}">
                            <c:if test="${single.getRoles().size() > 1}">
                                <td>Admin</td>
                            </c:if>
                            <c:if test="${single.getRoles().size() == 1}">
                                <td><a href="/delete/${single.id}">Delete</a> | <a href="/make-admin/${single.id}">Make Admin</a></td>
                            </c:if>
                        </c:if>
                        <c:if test="${single.lastSignIn == null}">
                            <td>Never signed in</td>
                        </c:if>
                        <c:if test="${single.lastSignIn != null}">
                            <td><fmt:formatDate pattern = "MMMMM dd, yyyy" value="${user.lastSignIn}"></fmt:formatDate></td>
                        </c:if>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
		
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
		
	</body>
</html>