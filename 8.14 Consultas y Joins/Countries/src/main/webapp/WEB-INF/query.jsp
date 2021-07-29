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
		<title>Queries Countries</title>
	</head>
	<body>
		
		<div style="padding: 5px; text-align: center;">
	        <a style="padding: 5px;" href="/slovene">Slovene</a>
	        <a style="padding: 5px;" href="/total">Total Cities</a>
	        <a style="padding: 5px;" href="/mexico">Mexico</a>
	        <a style="padding: 5px;" href="/mainlangs">Main Languages</a>
	        <a style="padding: 5px;" href="/surfpop">Surface Area & Population</a>
	        <a style="padding: 5px;" href="/monarch">Some Constitutional Monarchies</a>
	        <a style="padding: 5px;" href="/argentina">Argentina</a>
	        <a style="padding: 5px;" href="/regions">Regions</a>
	    </div>
	    <h1>${query}</h1>
	    <h4>${desc}</h4>
	    <br>
	    <table>
	        <thead>
	            <tr style="padding: 5px; text-align: left;">
	                <c:forEach items="${columns}" var="name">
	                    <th style="padding: 5px; text-align: left; border: 1px solid black;">${name}</th>
	                </c:forEach>
	            </tr>
	        </thead>
	        <tbody>
	            <c:forEach items="${table}" var="row">
	                <tr style="padding: 5px; text-align: left;">
	                <c:forEach items="${row}" var="data">
	                    <td style="padding: 5px; text-align: left; border: 1px solid black;">${data}</td>
					</c:forEach>
	                </tr>
	            </c:forEach>
	        </tbody>
	    </table>
		
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
		
	</body>
</html>