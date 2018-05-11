package com.servlets;
import java.io.*;

import javax.servlet.*;

/**
 * Servlet implementation class SumSrv
 */
public class SumSrv extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
      
    public SumSrv() {
        super();
       
    }
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	pw.print("<body bgcolor=lightblue> <center> Request Arrived.....");
	
	int x = Integer.parseInt(request.getParameter("fvalue"));
	int y = Integer.parseInt(request.getParameter("svalue"));
	int sum =x+y;
	
	pw.print("<br><br>sum =" +sum);
	pw.print("<a href='index.html'> <br><br><br><br><br><br><br><br><br><br> Home </a>");
	pw.print("</body></center>");
	}

}
