<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link href="${pageContext.request.contextPath}/css/styles.css"
	rel="stylesheet" type="text/css">
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Sign Up</title>
</head>
<body>
	<header>
		<h1>SPINDASH</h1>
	</header>
	<div class="new-user">
		<div class="content">
			<h1>SIGN UP</h1>
			<br />
			<form action="${pageContext.request.contextPath}/signup" method="post">
				<input type="text" placeholder="Enter Name" name="username" /><br />
				<br /> <input type="email" placeholder="Enter Email" name="email" /><br />
				<br /> <input type="text" placeholder="Enter Address"
					name="address" /><br /> <br /> <input type="tel"
					placeholder="Enter Phone Number" name="phonenumber" /><br /> <br />
				<input type="password" placeholder="Enter Password" name="password" /><br />
				<br /> <input type="password" placeholder="Confirm Password"
					name="cpassword" /><br /> <br /> <input type="submit" name=""
					id="" value="REGISTER" />
			</form>
			<br />
			<p class="text-advice">Already have an account?</p>
			<a href="login.jsp">Log in here</a> <br /> <br /> <br />
		</div>
	</div>
	<%@ include file="footer.jsp" %>
