package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//General settings
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("My first servlet <br>");
		
		//get requested parameters
		String name = request.getParameter("uname");
		String pswd = request.getParameter("upwd");
		
		if(name.equals("Sravya")&& pswd.equals("bharathi")) {
			writer.println("Success");
			writer.println("user name: " +name+"<br>");
			writer.println("Password: " +pswd+"<br>");
		}else
		{
			writer.println("Login failed");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//General settings
				/*response.setContentType("text/html");
				PrintWriter writer = response.getWriter();
				writer.println("My first Post servlet <br>");
				
				//get requested parameters
				String name = request.getParameter("uname");
				String pswd = request.getParameter("upwd");
				
				if(name.equals("Sravya")&& pswd.equals("bharathi")) {
					writer.println("Success <br>");
//					writer.println("user name: " +name+"<br>");
//					writer.println("Password: " +pswd+"<br>");
					//Request redirect using hyperlink
					writer.println("<a href='https://www.facebook.com'>Location is changed to facebook</a>");
					
					//Request redirect using response headers
//					response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
//					response.setHeader("Location", "https://www.facebook.com");
					
					//Request redirect using send redirect
					response.sendRedirect("https://www.facebook.com");
				}else
				{
					//writer.println("Login failed");
					response.sendError(880,"Oops ! You have enter the wrong details");
				}*/
	}

}
