<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <link href="${pageContext.request.contextPath}/css/styles.css?v=1.0" rel="stylesheet" type="text/css">
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Home</title>
  </head>
  <body>
    <header>
      <nav>
        <a href="${pageContext.request.contextPath}/home" class="logo">SPINDASH</a>
        	<%if(session.getAttribute("user") == null || session.getAttribute("user").equals("")){ %>
        		  <!-- Show Login and Sign Up if user is not logged in -->
            <a href="signup.jsp">SIGN UP</a> <a href="login.jsp">LOG IN</a>
        		<%
        	}
        	else{
        	%>
        	
            <!-- Show Wishlist, Cart and Log Out if user is logged in -->
          	<a href="${pageContext.request.contextPath}/wishlist">WISHLIST</a><a href="${pageContext.request.contextPath}/cart">CART</a> <a href="${pageContext.request.contextPath}/logout">LOG OUT</a>
            <%} %>
      </nav>
    </header>

    <div class="category">
      <a href="${pageContext.request.contextPath}/Switch">Switch</a>
      <a href="${pageContext.request.contextPath}/PS5">PS5</a>
      <a href="${pageContext.request.contextPath}/XBOX">XBOX</a>
      <a href="${pageContext.request.contextPath}/PS4">PS4</a>
      <a href="${pageContext.request.contextPath}/PC">PC</a>
    </div>
