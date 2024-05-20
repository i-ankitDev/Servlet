package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Signup extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String nameString = req.getParameter("name");
		String email = req.getParameter("email");
		String passString = req.getParameter("pass");
		String gender = req.getParameter("Gender");
		String dobString = req.getParameter("dob");
		long mob = Long.parseLong(req.getParameter("mob"));
		PrintWriter out = resp.getWriter();
		out.print("<h1>ID : "+id+ " </h1>");
		out.print("<h1>NAME : "+nameString+ " </h1>");
		out.print("<h1>EMAIL : "+email+ " </h1>");
		out.print("<h1>PASSWORD : "+passString+ " </h1>");
		out.print("<h1>GENDER : "+gender+ " </h1>");
		out.print("<h1>DOB : "+dobString+ " </h1>");
		out.print("<h1>MOBILE : "+mob+ " </h1>");
	}
}
