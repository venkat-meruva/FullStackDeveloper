package com.vote;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoteApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public VoteApp() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("<body bgcolor= lightgreen><center>Request Arrived...");

		String name = request.getParameter("uname");
		int age = Integer.parseInt(request.getParameter("age"));
		

		if (age >= 21) {
		
			pw.print("<b><br><br>" + name + "<br><br>Eligible to Vote");
		} else
			pw.print("<b><br><br>" + name + " <br> <br> Not Eligible to Vote");
	
	}

}
