package com.pavan.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public testServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Test Servlet</h1>");
		out.println("</body></html>");
	}
}

/*  //tomcat-users.xml  (Under the Servers)

	<?xml version="1.0" encoding="UTF-8"?>
	<tomcat-users xmlns="http://tomcat.apache.org/xml" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://tomcat.apache.org/xml tomcat-users.xsd" version="1.0">
	    <role rolename="pavanrole"/>
	    <user username="pavan" password="pavan" roles="pavanrole"/>
	    <user username="nithin" password="nithin" roles="pavanrole"/>
	</tomcat-users>

*/