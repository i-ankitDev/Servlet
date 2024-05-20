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

@WebServlet("/Update")
public class Update extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminDao dao = new AdminDao();
		UserDetails details =dao.findDetailsByID(Integer.parseInt(req.getParameter("id")));
		details.setName(req.getParameter("name"));
		details.setEmail(req.getParameter("email"));
		details.setPassword(req.getParameter("pass"));
		details.setDob(Date.valueOf(req.getParameter("dob")));
		details.setMob(Long.parseLong(req.getParameter("mob")));
		dao.updateDetails(details);
		req.getRequestDispatcher("dashboard.jsp").include(req, resp);
	}
}
