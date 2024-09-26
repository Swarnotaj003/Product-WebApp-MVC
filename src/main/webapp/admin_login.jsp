<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product WebApp : Admin Login</title>
<meta charset="UTF-8" />
	<meta name = "viewport" content = "width=device-width" />
	<link rel = "stylesheet" href = "css/styles.css" />
</head>
<body>
<div class = "container">
	<div class = "center">
		<h1>Admin Login</h1>
		<form action = "" method = "post">
			<div class = "txt_field">
				<input type = "text" name = "text" required>
				<span></span>
				<label>Username</label>
			</div>
			<div class = "txt_field">
				<input type = "password" name = "password" required>
				<span></span>
				<label>Password</label>
			</div>
			<div class = "pass">Forgot password?</div>
			<input name = "Submit" type = "submit" value = "Login" onclick="window.location.href='adm_dashboard.jsp';return false;">
			<div class = "signup_link">
				Not a member? <a href = "#">Signup</a>
			</div>
		</form>
	</div>
</div>
</body>
</html>