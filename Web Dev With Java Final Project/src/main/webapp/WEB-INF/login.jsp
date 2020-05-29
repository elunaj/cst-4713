<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>

	label {
		display:inline-block;
		width: 1in;
		padding-bottom: 6px;
	}
</style>
</head>
<body>

	<h1>Login Page</h1>

	<form method="POST" action="./login">
		<label>User id:</label><input type="text" name="userId" /> <br />
		<label>Password:</label><input type="text" name="password" /> <br />
		<br />
		<input type="submit" />
	</form>
</body>
</html>