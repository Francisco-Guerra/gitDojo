<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Bienvenido!</h1>
<h2>Por favor, ingrese sus datos en el formulario a continuación</h2> <br>

<form name=Home action=Home method=post>
<label for=firstName>What's your First Name &nbsp;</label>
<input type=text value="" name=firstName><br>
<label for=lastName>What's your Last Name &nbsp;</label>
<input type=text value="" name=lastName><br>
<label for=language>What's your Favorite language? &nbsp;</label>
<input type=text value="" name=language><br>
<label for=hometown>What's you hometown? &nbsp;</label>
<input type=text value="" name=hometown>
<br>
<input type=submit>

</form>


</body>
</html>