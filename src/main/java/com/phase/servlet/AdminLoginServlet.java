package com.phase.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String email=request.getParameter("email");
			String pass=request.getParameter("pass");
			
			if("admin@gmail.com".equals(email) && "adminpwd".equals(pass)) {
				
				response.sendRedirect("adminHome.jsp");
			}
			else {
			
				response.sendRedirect("index.jsp");
			}
				
			
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}

	}

}
