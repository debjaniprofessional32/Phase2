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


public class TeacherUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TeacherUpdateServlet() {
        super();
     
    }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		 int tid= Integer.parseInt(request.getParameter("tid").trim());
			String fname=request.getParameter("fname");
			String Qualification=request.getParameter("Qualification");
			int age=Integer.parseInt(request.getParameter("age"));
			Session sessionupdateforteacher=FactoryProvider.getfactory().openSession();
			Transaction tx=sessionupdateforteacher.beginTransaction();
			Teacher t=sessionupdateforteacher.get(Teacher.class, tid);
			t.setTname(fname);
			t.setQualification(Qualification);
			t.setAge(age);
			tx.commit();
			sessionupdateforteacher.close();
			response.sendRedirect("ListofTeacher.jsp");
		
	}

	catch(Exception e) {
		
		e.printStackTrace();
	}
	
	}

}
