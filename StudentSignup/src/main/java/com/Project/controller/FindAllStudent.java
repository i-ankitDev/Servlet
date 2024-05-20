package com.Project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Project.dao.StudentDao;
import com.Project.dto.Student;
import com.Project.dto.Validate;

@WebServlet("/studentDisplay")
public class FindAllStudent extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession=req.getSession();
		Validate validate=(Validate) httpSession.getAttribute("userDetails");
		if (validate==null) {
			resp.getWriter().print("<h1>New User Detected...</h1>");
			resp.getWriter().print("<h1>Login First</h1>");
			req.getRequestDispatcher("Signin.html").forward(req, resp);
		}
		else {
			int id = Integer.parseInt(req.getParameter("id"));
			StudentDao dao = new StudentDao();
			Student student = dao.findStudentById(id);
			PrintWriter out = resp.getWriter();
			if (student!=null) {
				
				out.println("<h1>Student Details : ");
				out.println("<h1>Name is : "+ student.getName()+"</h1>");
				out.println("<h1>Email is : "+ student.getEmail()+"</h1>");
				out.println("<h1>Gender is : "+ student.getGender()+"</h1>");
				out.println("<h1>Address is : "+ student.getAddres()+"</h1>");
				out.println("<h1>Pincode is : "+ student.getPincode()+"</h1>");
				out.println("<h1>Date is : "+ student.getDate()+"</h1>");
				out.println("<h1>Mobile Number is : "+ student.getMobileNumber()+"</h1>");
				
			}
			else {
				out.println("<h1>Student not found</h1>");
				req.getRequestDispatcher("Homepage.html").include(req, resp);
			}
		}
	}
}
