package com.phase.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.phase.Entity.Teacher;
import com.phase.helper.FactoryProvider;


public class AddTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddTeacher() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try {
    	
    	String fname =request.getParameter("fname");
    	String Qualification =request.getParameter("Qualification");
    	int age=Integer.parseInt(request.getParameter("age"));
    	Teacher teacher= new Teacher(fname,Qualification,age);
    	
    	Session sessteach=FactoryProvider.getfactory().openSession();
    	Transaction tx=sessteach.beginTransaction();
    	sessteach.save(teacher);    	  	
    	
    	tx.commit();    	   	
    	sessteach.close();
    	response.sendRedirect("ListofTeacher.jsp");
    	
    }
    catch(Exception e) {
    	
    	e.printStackTrace();
    }
    
	}

}
