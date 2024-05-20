package com.tut.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tut.dto.Student;
import com.tut.dto.Validate;

@WebServlet("/homepageServlet1")
public class HomepageServlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession();
		Validate validate = (Validate) httpSession.getAttribute("userDetails");
		if (validate==null) {
			resp.getWriter().print("<h1>FIrst Login</h1>");
			req.getRequestDispatcher("Signin.html").include(req, resp);
		} else {
			resp.getWriter().print("<h1>Homepage 1</h1>");
			req.getRequestDispatcher("Homepage.html").include(req, resp);
		}
	}
}
