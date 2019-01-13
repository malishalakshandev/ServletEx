package com.im.servletex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String telephone = req.getParameter("telephone");
		String password = req.getParameter("password");
		String confirm = req.getParameter("confirm");
	
		String[] eq = req.getParameterValues("eq");
		 
		for(String string : eq) {
			System.out.println("EQ ="+string);
		}
		
		Map<String, String[]> map = req.getParameterMap();
		for(String key : map.keySet()) {
			
			String[] value = map.get(key);
			System.out.println("Key ="+key+ "value"+value[0]);
		}
		
		String method = req.getMethod();
		System.out.println("Method = "+method);
		
		String sessionID = req.getSession().getId();
		System.out.println("sessionID = "+sessionID);
		
		String path = req.getContextPath();
		System.out.println("Path = "+path);
		
		String uri = req.getRequestURI();
		System.out.println("URI= "+uri);
		
		resp.setContentType("application/pdf");
		PrintWriter out = resp.getWriter();
		out.println("Hi");
		
		
		
		
		
		
		
	}
	
}
