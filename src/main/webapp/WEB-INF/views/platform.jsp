<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%List<Game> list= (List<Game>)session.getAttribute("platGameList"); %>
     <%@ page import="java.util.List" %>
     <%@ page import="com.spindash.entity.Game" %>
<%@ include file="header.jsp" %>
    <div class="content">
      <div class="img-grid">
         <% for(Game g:list){
        	%>
        	<div class="img-cell">
          <a href="${pageContext.request.contextPath}/game/<%=g.getGameId()%>">
            <div class="product">
              <img src="${pageContext.request.contextPath}/game-img/<%=g.getImgPath() %>" alt="" />
              <p class="game-name">
                <%=g.getTitle() %>
              </p>
              <p class="price"><%=g.getPrice() %></p>
              <a href="${pageContext.request.contextPath}/platform/<%=g.getPlatform()%>" class="platform">
              <%=g.getPlatform() %>
              </a>
            </div>
          </a>
        </div>
        	<%
        }%>
        </div>   
        </div>
    <%@ include file="footer.jsp" %>
