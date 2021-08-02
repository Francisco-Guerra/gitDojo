<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta charset="UTF-8">
		<title>Login/Register</title>
	</head>
	<body>
		
		<c:if test="${logout != null}">
        <p><c:out value="${logout}"></c:out></p>
    </c:if>
    <h1>Login</h1>
    <c:if test="${logError != null}">
        <p>${logError}</p>
    </c:if>
    <form method="POST" action="/login">
        <p>Email: <input type="text" id="email" name="username"/></p>
        <p>Password: <input type="password" id="password" name="password"/></p>
        <input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Login!"/>
    </form>
    <br>
    <hr>

    <h1>Register!</h1>
    <p><form:errors path="user.*"/></p>
    <form:form method="POST" action="/register" modelAttribute="user">
        <p><form:label path="email">Email: </form:label><form:input path="email"/></p>
        <p><form:label path="first">First Name: </form:label><form:input path="first"/></p>
        <p><form:label path="last">Last Name: </form:label><form:input path="last"/></p>
        <p><form:label path="password">Password: </form:label><form:password path="password"/></p>
        <p><form:label path="confirm">Confirm Password: </form:label><form:password path="confirm"/></p>
        <input type="submit" value="Register!"/>
    </form:form>
    
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
		
	</body>
</html>