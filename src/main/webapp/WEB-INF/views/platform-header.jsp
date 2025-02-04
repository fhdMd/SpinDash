<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet" type="text/css">
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <title><%=session.getAttribute("platform") %></title>
  </head>
  <body>
    <header>
      <nav>
        <a href="home" class="logo">SPINDASH</a>

        	<%if(session.getAttribute("user") == null || session.getAttribute("user").equals("")){ %>
        		  <!-- Show Login and Sign Up if user is not logged in -->
            <a href="signup.jsp">SIGN UP</a> <a href="login.jsp">LOG IN</a>
        		<%
        	}
        	else{
        	%>
        	
            <!-- Show Wishlist, Cart and Log Out if user is logged in -->
          	<a href="wishlist">WISHLIST</a><a href="cart">CART</a> <a href="logout">LOG OUT</a>
            <%} %>
      </nav>
    </header>

    <div class="category">
      <a href="Switch">Switch</a>
      <a href="PS5">PS5</a>
      <a href="XBOX">XBOX</a>
      <a href="PS4">PS4</a>
      <a href="PC">PC</a>
    </div>
