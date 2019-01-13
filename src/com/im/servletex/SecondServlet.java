package com.im.servletex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Second")
public class SecondServlet extends HttpServlet {

	Date date;

	@Override
	public void init() throws ServletException {  //This method executes when the servlet initialize
		super.init();
		date = new Date();
		System.out.println("Init() V3 Called...");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("Date =" + date);
		System.out.println("doGet() V3 Called...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("Date =" + date);
		System.out.println("doPost() V3 Called...");
	}
	
	@Override
	public void destroy() { //Object Destroy when changed the source code
		super.destroy();
		date = null;
		System.out.println("destroy() V3 Called...");
	}

}
