<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alex App Login</title>

<style>
body {
	background-color: powderblue;
}

h2 {
	color: blue;
}

.divform {
	width: 100%;
	text-align: center
}
</style>
</head>
<body>
	<div class="divform">
		<h2>Login</h2>
		<form action="<%=request.getContextPath()%>/login" method="post">
			<div class="divform">
				UserName:&nbsp; <input type="text" name="username">
			</div>
			<br>
			<div class="divform">
				Password:&nbsp;&nbsp;&nbsp; <input type="password" name="password">
			</div>
			<br>
			<div>
				<input type="submit" value="Login">
			</div>
		</form>
	</div>
	<br>
	<br>
	<div class="divform">
		<a href="signup.jsp">Sign up</a>
	</div>
</body>
</html>