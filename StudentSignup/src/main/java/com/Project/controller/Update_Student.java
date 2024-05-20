package com.Project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Project.dao.StudentDao;
import com.Project.dto.Student;
import com.Project.dto.Student_Course;
import com.Project.dto.Validate;

@WebServlet("/Update_Student")
public class Update_Student extends HttpServlet{
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
			int student_id = Integer.parseInt(req.getParameter("student_id"));
			String student_course = req.getParameter("Course");
			StudentDao dao = new StudentDao();
			
			if (dao.findStudentById(student_id)==null) {
				resp.getWriter().println("<h1>Student Not Found</h1>");
				resp.getWriter().println("<h1>Enter Details Again</h1>");
				req.getRequestDispatcher("Update_Student.html").include(req, resp);
			}
			else {
				Student student=dao.findStudentById(student_id);
				Student_Course course = new Student_Course();
				course.setCourseName(student_course);
				List<Student_Course> courses=student.getCourse();
				courses.add(course);
				student.setCourse(courses);
				course.setStudent(student);
				dao.update(student,course);
				resp.getWriter().println("<h1>Succesfully Added details</h1>");
				req.getRequestDispatcher("Homepage.html").include(req, resp);
			}
		}
	}
}
