package com.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.tut.dao.Studentdao;
import com.tut.dto.Student;

public class Signup extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Student student = new Student();
		student.setName(req.getParameter("name"));
		student.setEmail(req.getParameter("email"));
		student.setPassword(req.getParameter("pass"));
		student.setGender(req.getParameter("gender"));
		student.setAddress(req.getParameter("address"));
		student.setPinCode(Long.parseLong(req.getParameter("pincode")));
		student.setDateOfBirth(Date.valueOf(req.getParameter("dob")));
		student.setMobile(Long.parseLong(req.getParameter("mob")));
		System.out.println(student.getName());
		System.out.println(req.getParameter("name"));
		Studentdao dStudentdao = new Studentdao();

		if (dStudentdao.saveStudent(student)) {
			PrintWriter out = res.getWriter();
			out.print("<h1>Successfully Registered</h1>");
			req.getRequestDispatcher("Signin.html").include(req, res);
		}

	}
}
