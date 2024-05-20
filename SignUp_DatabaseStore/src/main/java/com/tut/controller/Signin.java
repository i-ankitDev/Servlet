package com.tut.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tut.dao.Studentdao;
import com.tut.dto.Student;
import com.tut.dto.Validate;

@WebServlet("/signin")
public class Signin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String emailString = req.getParameter("email");
		String passString = req.getParameter("pass");
		Studentdao dStudentdao  = new Studentdao();
		Student student = dStudentdao.findStudentByEmail(emailString);
		if (student.getEmail().equals(emailString) && student.getPassword().equals(passString)) {
			HttpSession httpSession=req.getSession();
			Validate validate = new Validate();
			validate.setUsername(emailString);
			validate.setPassword(passString);
			httpSession.setAttribute("userDetails", validate);
			resp.getWriter().print("<h1>Login Successfull</h1>");
			req.getRequestDispatcher("homepagemain.html").include(req, resp);
		} else {
			resp.getWriter().print("<h1>Invalid Credentitals</h1>");
			req.getRequestDispatcher("Signin.html").include(req, resp);
		}
			
		
		
	}
}
