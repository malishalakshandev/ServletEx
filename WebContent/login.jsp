<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>



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
		<div class="jumbotron">
			<h2>Car Sale</h2>
			<p>Find Your Dream Car</p>
			<hr/>
			<a href="login.jsp" class="btn btn-success">Login</a> <a
				href="register.jsp" class="btn btn-warning">Register</a>
			<hr />
		</div>

		<div class="well">
			<form action="LoginServlet" method="post">
				<label>User Name</label> <input type="text" name="un"
					class="form-control" /> <label>Password</label> <input type="text"
					name="pw" class="form-control" />
				<hr />
				<input type="reset" value="Reset" class="btn btn-danger" /> <input
					type="submit" value="Login" class="btn btn-success" />
			</form>
		</div>

	</div>


</body>
</html>