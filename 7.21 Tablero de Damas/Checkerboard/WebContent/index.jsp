<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="styles.css">
	<title>Checkerboard</title>
	<%-- http://localhost:8080/Checkerboard/index.jsp?width=5&height=4 --%>
</head>
<body>
	<%
		int width=0; 
		int height=0;
		
		if(request.getParameter("width") != null){
			width = Integer.parseInt(request.getParameter("width"));	
		}
		if(request.getParameter("height") != null){
			height = Integer.parseInt(request.getParameter("height"));
		}%>
		
	<h1>Checkerboard: <%= width %>w X <%= height %>h </h1>
	
	<table>
		<% for(int i =0; i < height; i++ ){ %>
		<tr>
			<% for(int j = 0; j < width; j++){ %>
				<% int valor = ((i+j)%2)+1; %>
			<td class=cuad<%= valor %>></td>
			<% } %>
		</tr>
		<% } %>
	</table>

</body>
</html>