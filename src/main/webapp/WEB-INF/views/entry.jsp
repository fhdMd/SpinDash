<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<%@ page import="com.spindash.entity.Game"%>
<%@ page import="java.util.Map"%>
<%
Game game = (Game) session.getAttribute("game");
%>
<div class="content">
	<div class="game-entry">
		<div class="game-img">
			<img
				src="${pageContext.request.contextPath}/game-img/<%=game.getImgPath() %>"
				alt="" />
		</div>
		<div class="game-deet">
			<p class="game-name"><%=game.getTitle()%></p>
			<p class="price"><%=game.getPrice()%>
				INR
			</p>
			<p>
				<a
					href="${pageContext.request.contextPath}/platform/<%=game.getPlatform()%>"
					class="platform"><%=game.getPlatform()%></a>
			</p>
		</div>

		<div class="icons">
			<%
			if (session.getAttribute("user") == null || session.getAttribute("user").equals("")) 
			{
			%>
			<a href="${pageContext.request.contextPath}/login.jsp"><img
				src="${pageContext.request.contextPath}/images/heart-e.png" alt="" /></a>
				
			<a href="${pageContext.request.contextPath}/login.jsp"><img
				src="${pageContext.request.contextPath}/images/cart.png" alt="" /></a>

			<%
			} 
			else 
			{ 
				if(((Map<Integer,Boolean>)session.getAttribute("wishlistMap")).containsKey(game.getGameId()) && ((Map<Integer,Boolean>)session.getAttribute("wishlistMap")).get(game.getGameId()))
				{
			%>		
					<a
				href="${pageContext.request.contextPath}/wremove/<%=game.getGameId()%>"><img
				src="${pageContext.request.contextPath}/images/heart-f.png" alt="" /></a>
					<%
				}
				else
				{
					%>
					<a
				href="${pageContext.request.contextPath}/wadd/<%=game.getGameId()%>"><img
				src="${pageContext.request.contextPath}/images/heart-e.png" alt="" /></a>
				<%
				}
				if(((Map<Integer,Boolean>)session.getAttribute("cartMap")).containsKey(game.getGameId()) && ((Map<Integer,Boolean>)session.getAttribute("cartMap")).get(game.getGameId()))
				{
				%>
				<a
				href="${pageContext.request.contextPath}/cremove/<%=game.getGameId()%>"><img
				src="${pageContext.request.contextPath}/images/cart.png" alt="" /></a>
				<%
				}
				else
				{
				%>
							<a
				href="${pageContext.request.contextPath}/cadd/<%=game.getGameId()%>"><img
				src="${pageContext.request.contextPath}/images/cart.png" alt="" /></a>

				<%
			}
			}
			%>
		</div>
	</div>
</div>
<%@ include file="footer.jsp"%>
