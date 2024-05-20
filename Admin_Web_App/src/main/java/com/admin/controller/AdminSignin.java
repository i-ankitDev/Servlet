package com.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.admin.dto.AdminValidate;

@WebServlet("/adminLogin")
public class AdminSignin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameter("username").equals("admin") && req.getParameter("password").equals("admin")) {
			AdminValidate validate = new AdminValidate();
			HttpSession httpSession = req.getSession();
			validate.setUsername(req.getParameter("username"));
			validate.setPassword(req.getParameter("password"));
			httpSession.setAttribute("adminDetails", validate);
			req.getRequestDispatcher("Signup.jsp").include(req, resp);
		} else {
			resp.getWriter().print("<h1><center>Wrong Credentials</center></h1>");
			req.getRequestDispatcher("Admin_login.jsp").include(req, resp);
		}
	}
}
