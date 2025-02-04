<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link href="${pageContext.request.contextPath}/css/styles.css"
	rel="stylesheet" type="text/css">
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Log In</title>
</head>
<body>
	<header>
		<h1>SPINDASH</h1>
	</header>
	<div class="new-user">
		<div class="content">
			<h1>LOGIN</h1>
			<br />
			<form action="${pageContext.request.contextPath}/login" method="post">
				<input type="text" placeholder="Enter Email" name="email" /><br />
				<br /> <input type="password" placeholder="Enter Password" name="password" />
				<br /> 
				<br /> 
				<input type="submit" name="" id="" value="LOG IN" /> 
				<br />
				<p class="text-advice">Don't have an account?</p>
				<a href="signup.jsp">Register here</a>
			</form>
			<br />
			<br />
			<br />
		</div>
	</div>
	<%@ include file="footer.jsp" %>
