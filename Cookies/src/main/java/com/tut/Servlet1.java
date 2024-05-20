package com.tut;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name=req.getParameter("user_name");
		out.println("Hello "+name+", Welcome to our website");
		out.println("<h2><a href='s2'>Go to Servlet 2</a></h2>");
		Cookie cookie = new Cookie("user_name", name);
		resp.addCookie(cookie);
	}
}
