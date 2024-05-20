package com.tut;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s2")
public class Servlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		Cookie[] cookies=req.getCookies();
		boolean f= false;
		String cname ="";
		if (cookies==null) {
			out.println("You are new user");
		}
		else {
			for (Cookie cookie : cookies) {
				String c=cookie.getName();
				if (c.equals("user_name")) {
					f = true;
					cname = cookie.getValue();
				}
			}
		}
		if (f) {
			out.println("<h2>Hello " + cname + ", Welcome to our website in servlet 2</h2>");
			out.println("<h2>Thank You . . . .. </h2>");
		}
		
	}
}
