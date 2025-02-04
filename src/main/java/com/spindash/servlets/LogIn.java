//package com.spindash.servlets;
//
//import java.io.IOException;
//
//import com.spindash.controller.UserController;
//import com.spindash.entity.User;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class LogIn
// */
//@WebServlet("/logIn")
//public class LogIn extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	/**
//	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		User u=new UserController().find(request.getParameter("email"));
//		if(u.getEmail().equals(request.getParameter("password"))&&u!=null) {
//			request.getSession().setAttribute("user", u);
//			response.sendRedirect("success.jsp");
//		}
//		else {
//			response.sendRedirect("failure.jsp");
//		}
//	}
//}
