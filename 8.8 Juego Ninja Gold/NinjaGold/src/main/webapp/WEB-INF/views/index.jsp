<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="assets/css/style.css">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta charset="ISO-8859-1">
		<title>Ninja Gold Game</title>
	</head>
	<body>
	
     	<div class="gold_count_container"><h4>Your Gold:</h4></div>
        <div class="goldcount"><h4><c:out value="${gold}"/></h4></div>

        <div class="box_selection_container">
            <form action="getGold" method="post">                
                <div class="selection_box">
                    <h4>Farm</h4>
                    <p>(earns 10-20 gold)</p>
                    <button type="submit" class="btn btn-outline-dark" name="button" value="farm">Find Gold!</button>
                </div>
                <div class="selection_box">
                    <h4>Cave</h4>
                    <p>(earns 5-10 gold)</p>
                    <button type="submit" class="btn btn-outline-dark" name="button" value="cave">Find Gold!</button>
                </div>
                <div class="selection_box">
                    <h4>House</h4>
                    <p>(earns 2-5 gold)</p>
                    <button type="submit" class="btn btn-outline-dark" name="button" value="house">Find Gold!</button>
                </div>
                <div class="selection_box">
                    <h4>Casino!</h4>
                    <p>(earn/lose 0-50 gold)</p>                        
                    <button type="submit" class="btn btn-outline-dark" name="button" value="casino">Find Gold!</button>
                </div>
            </form>                
        </div>
        
        <div class="activity_log">
			<p>Activities:</p>
            	<div id="text_area">
            		<c:forEach items="${logList}" var="event">
                  	<c:out value="${event}" escapeXml="false" />
					</c:forEach>                       
                </div>
			<br>
			<br>
			<a href="/reset" class="startover"><button type="button" class="btn btn-outline-danger">Start Over</button></a>
		</div> 
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
		
	</body>
</html>