package com.tut;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formDisplay")
public class FormDisplay extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Heyy");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("sname");
		String email = req.getParameter("email");
		String gender = req.getParameter("Gender");
		String course = req.getParameter("Course");
		String address = req.getParameter("address");
		String cond = req.getParameter("condition");
		out.println("<h2>Welcome to Response Servlet</h2>");
		if (cond != null) {
			if (cond.equals("checked")) {
				
				out.println("<h2>Name : " + name + " </h2>");
				out.println("<h2>Email : " + email + " </h2>");
				out.println("<h2>Gender : " + gender + " </h2>");
				out.println("<h2>Course : " + course + " </h2>");
				out.println("<h2>Address : " + address + " </h2>");
				RequestDispatcher rDispatcher = req.getRequestDispatcher("Home.jsp");
				rDispatcher.forward(req, resp);

			}
		} else {
			out.println("<h2>You have not checked checkbox</h2>");
			RequestDispatcher rDispatcher = req.getRequestDispatcher("form.jsp");
			rDispatcher.include(req, resp);
			}
	}

}
