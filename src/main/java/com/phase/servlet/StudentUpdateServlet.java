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


public class StudentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public StudentUpdateServlet() {
        super();
     
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			 int studid= Integer.parseInt(request.getParameter("studid").trim());
			String studentname=request.getParameter("studentname");
			String batch=request.getParameter("batch");
			Session sessionupdateforStudent=FactoryProvider.getfactory().openSession();
			Transaction tx=sessionupdateforStudent.beginTransaction();
			Student stud=sessionupdateforStudent.get(Student.class, studid);
			stud.setStuname(studentname);
			stud.setBatch(batch);
			tx.commit();
			sessionupdateforStudent.close();
			response.sendRedirect("ListofStudent.jsp");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
