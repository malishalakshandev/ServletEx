package com.im.servletex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
			//Read the Request
			String un = request.getParameter("un");
			String pw = request.getParameter("pw");
			
		
			
			//Generate the Response
			PrintWriter out = response.getWriter();
			if (un.equals("admin") && pw.equals("123")) {
				
				HttpSession session = request.getSession();
				session.setAttribute("login", "true");
				session.setAttribute("name", "ADMIN");
//				out.println("Login Successfull!");
				response.sendRedirect("index.jsp");
				
			}else {
//				out.print("Login Failed!");
//				response.sendRedirect("login.jsp");
				response.sendError(404,"File Not Found");
			}
		}

}
