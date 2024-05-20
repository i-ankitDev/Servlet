package com.tut;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletImplementing implements Servlet{

	ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("Creating Object");
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return this.config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servicing......");
		
	}

	@Override
	public String getServletInfo() {
		return "The servlet is created";
	}

	@Override
	public void destroy() {
		System.out.println("Destroying Object......");
		
	}
	
}
