<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Pets!</title>
</head>
<body style="text-align: center;">
	
	<div style="display: inline-block;">	
		<h1>Create a Dog</h1>
		<form action="Dogs" method=get>
			<h2>Name: <input name="name" placeholder="Name"></h2>
			<br>
			<h2>Breed: <input name="breed" placeholder="Breed"></h2>
			<br>
			<h2>Weight: <input name="weight" placeholder="Weight (lb)"></h2>
			<br>
			<button type="submit">Create Dog</button>
			 
		</form>
	</div>
	
	<div style="display: inline-block">
		<h1 style="margin-left: 50px">Create a Cat</h1>		
		<form action="Cats" method=get style="margin-left: 50px">
			<h2>Name: <input name="name" placeholder="Name"></h2>
			<br>
			<h2>Breed: <input name="breed" placeholder="Breed"></h2>
			<br>
			<h2>Weight: <input name="weight" placeholder="Weight (lb)"></h2>
			<br>
			<button type="submit">Create Cat</button>
			 
		</form>
	</div>
</body>
</html>