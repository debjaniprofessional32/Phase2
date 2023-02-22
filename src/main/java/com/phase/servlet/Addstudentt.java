package com.phase.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.phase.Entity.Student;
import com.phase.helper.FactoryProvider;


public class Addstudentt extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Addstudentt() {
        super();
     
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			//course,subject2,subject1
			String studentname=request.getParameter("studentname");
			String batch=request.getParameter("batch");
			Student stud=new Student(studentname,batch);
			
			//System.out.println(sub.getSucourse()+":"+sub.getSuSubject1()+":"+sub.getSuSubject2());
		Session studentSession=FactoryProvider.getfactory().openSession();
		Transaction tx=studentSession.beginTransaction();
		studentSession.save(stud);
		
		tx.commit();
		studentSession.close();
		//response.setContentType("text/html");
		response.sendRedirect("ListofStudent.jsp");
		//PrintWriter pw=response.getWriter();
		//pw.println("<h2>Subject added as per course successfully!...</h2>");
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
