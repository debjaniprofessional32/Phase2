package com.phase.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.phase.Entity.Subject;
import com.phase.helper.FactoryProvider;


public class Addsubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Addsubject() {
        super();
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try {
			
			//course,subject2,subject1
			String course=request.getParameter("course");
			String subject1=request.getParameter("subject1");
			String subject2=request.getParameter("subject2");
			
			Subject sub=new Subject(course,subject1,subject2);
			
			//System.out.println(sub.getSucourse()+":"+sub.getSuSubject1()+":"+sub.getSuSubject2());
		Session subjectSession=FactoryProvider.getfactory().openSession();
		Transaction tx=subjectSession.beginTransaction();
		subjectSession.save(sub);
		
		tx.commit();
		subjectSession.close();
		//response.setContentType("text/html");
		response.sendRedirect("ListofSubject.jsp");
		//PrintWriter pw=response.getWriter();
		//pw.println("<h2>Subject added as per course successfully!...</h2>");
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
