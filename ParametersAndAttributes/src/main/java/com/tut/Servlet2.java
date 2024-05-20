package com.tut;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s2")
public class Servlet2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		int n1=Integer.parseInt(req.getParameter("n1"));
		int n2=Integer.parseInt(req.getParameter("n2"));
		int sum = (int)req.getAttribute("sum");
		int product = n1*n2;
//		resp.setContentType("text/html");
		out.println("<html><body>");
		out.println("<h2>Welcome to output page</h2>");
		out.println("<h2>Sum is "+sum+"</h2>");
		out.println("<h2>Product is "+product+"</h2>");
		out.println("</body></html>");
	}

}
