package com.admin.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.dao.AdminDao;
import com.admin.dto.UserDetails;

@WebServlet("/Signup")
public class UserSignUp extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDetails details = new UserDetails();
		details.setName(req.getParameter("name"));
		details.setEmail(req.getParameter("email"));
		details.setPassword(req.getParameter("pass"));
		details.setDob(Date.valueOf(req.getParameter("dob")));
		details.setGender(req.getParameter("gender"));
		details.setMob(Long.parseLong(req.getParameter("mob")));
		AdminDao dao = new AdminDao();
		dao.saveDetails(details);
		req.getRequestDispatcher("dashboard.jsp").include(req, resp);
	}
}
