package com.tut;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class ServletHome extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String n1=req.getParameter("n1");
	String n2 = req.getParameter("n2");
	int nn1=Integer.parseInt(n1);
	int nn2=Integer.parseInt(n2);
	int s = nn1+nn2;
	req.setAttribute("sum", s);
	RequestDispatcher rDispatcher = req.getRequestDispatcher("s2");
	rDispatcher.include(req, resp);
	}
}
