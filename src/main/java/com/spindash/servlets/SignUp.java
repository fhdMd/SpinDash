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
// * Servlet implementation class SignUp
// */
//@WebServlet("/signup")
//public class SignUp extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		if(request.getParameter("password").equals(request.getParameter("cpassword"))) {
//			int x=new UserController().addUser(new User(1,request.getParameter("username"),
//					request.getParameter("email"),request.getParameter("password"),
//					request.getParameter("address"),Long.parseLong(request.getParameter("phonenumber"))));			
//			response.sendRedirect((x==1)?"success.jsp":"failure.jsp");
//		}
//		else {
//			response.sendRedirect("failure.jsp");
//		}
//	}
//
//}
