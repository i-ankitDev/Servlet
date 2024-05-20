package com.tut;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.UserData;

@WebServlet("/Signup")
public class SignUp extends HttpServlet {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("signup");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	private static final long serialVersionUID = 1L;
       
    public SignUp() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("user_name");
		String useremail = request.getParameter("user_email");
		String userpwd = request.getParameter("user_pwd");
		UserData ud = new UserData();
		ud.setName(username);
		ud.setEmail(useremail);
		ud.setPassword(userpwd);
		transaction.begin();
		manager.persist(ud);
		transaction.commit();
		response.setContentType("text/html");
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("SignUp.jsp");
		requestDispatcher.include(request, response);
	}

}
