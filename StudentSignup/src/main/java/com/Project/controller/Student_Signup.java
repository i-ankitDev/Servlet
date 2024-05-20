package com.Project.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Project.dao.StudentDao;
import com.Project.dto.Student;
import com.Project.dto.Student_Course;

@WebServlet("/signup")
public class Student_Signup extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student student = new Student();
		student.setName(req.getParameter("name"));
		student.setEmail(req.getParameter("email"));
		student.setPassword(req.getParameter("pass"));
		student.setGender(req.getParameter("gender"));
		student.setAddres(req.getParameter("address"));
		student.setPincode(Long.parseLong(req.getParameter("pincode")));
		student.setDate(Date.valueOf(req.getParameter("dob")));
		student.setMobileNumber(Long.parseLong(req.getParameter("mob")));
		List<Student_Course> courses = new ArrayList<Student_Course>();
		student.setCourse(courses);
		StudentDao dao = new StudentDao();
		Student studentFind=dao.findUserByEmail(req.getParameter("email"));
		if (studentFind==null) {
			dao.saveStudent(student);
			resp.getWriter().print("<h1>Registered Successfull</h1>");
			req.getRequestDispatcher("Signin.html").include(req, resp);
		}
		else {
			resp.getWriter().print("<h1>Email already registered</h1>");
			req.getRequestDispatcher("Signup.html").include(req, resp);
		}
		
	}

}
