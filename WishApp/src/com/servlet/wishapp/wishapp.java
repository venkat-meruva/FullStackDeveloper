package com.servlet.wishapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class wishapp extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public wishapp() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	pw.print("<body bgcolor= lightgreen><center><br><br>");
	pw.print(" <br><br>");
	Date d1 = new Date();
	pw.print("The Current time is "+d1);
	
	Calendar c = Calendar.getInstance();
	int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
	String name =request.getParameter("fname");
	String name1 =request.getParameter("lname");
	
	if(timeOfDay >= 0 && timeOfDay < 12){
		pw.print(" <br><br> Good Morning" +name1 );    
	}else if(timeOfDay >= 12 && timeOfDay < 16){
		pw.print("<br><br>Good Afternoon +fname +lname");       
	}else if(timeOfDay >= 16 && timeOfDay < 21){
		pw.print("<br><br> Good Evening " + name1 );      
	}else if(timeOfDay >= 21 && timeOfDay < 24){
		pw.print(" <br><br> Good Night " +name1);      
	}
	pw.print("<br><br><a href =index.html > Home </a>");
	
}
}