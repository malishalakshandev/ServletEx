<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>



<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="container">
		

		<div class="well">
			<form action="RegisterServlet" method="post">
				<label>Name</label> 
				<input type="text" name="name"class="form-control" />
				
				<label>Email</label> 
				<input type="email" name="email" class="form-control" />
				
				<label>Telephone</label> 
				<input type="number" name="phone"class="form-control" />
				
				<label>Password</label> 
				<input type="password" name="password"class="form-control" />
				 
			 	<label>Confirm Password</label> 
				<input type="password" name="confirm"class="form-control" />
				 
				<hr />
				
				<label>Education</label>
				<input type="checkbox" name="eq" class="form-control"/>O/L
				<input type="checkbox" name="eq" class="form-control"/>A/L
				<input type="checkbox" name="eq" class="form-control"/>BSc
				<br/>
				
				<input type="reset" value="Reset" class="btn btn-danger" /> 
				<input type="submit" value="Register" class="btn btn-success" />
			</form>
		</div>

	</div>


</body>
</html>