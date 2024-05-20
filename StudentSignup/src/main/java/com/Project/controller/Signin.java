package com.Project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Project.dao.StudentDao;
import com.Project.dto.Student;
import com.Project.dto.Validate;

@WebServlet("/signin")
public class Signin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("pass");
		StudentDao dao = new StudentDao();
		Student studentFind=dao.findUserByEmail(req.getParameter("email"));
		if (studentFind != null && studentFind.getEmail().equals(email) && studentFind.getPassword().equals(password)) {
			HttpSession httpSession = req.getSession();
			Validate validate = new Validate();
			validate.setUsername(email);
			validate.setPassword(password);
			httpSession.setAttribute("userDetails", validate);
			resp.getWriter().print("<h1>Login Successfull</h1>");
			req.getRequestDispatcher("Homepage.html").include(req, resp);
		}
		else {
			resp.getWriter().print("<h1>Wrong Credentials</h1>");
			req.getRequestDispatcher("Signin.html").include(req, resp);
		}
	}
}
