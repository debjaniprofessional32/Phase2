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


public class DeleteteacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeleteteacherServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		int tid=Integer.parseInt(request.getParameter("tid").trim());
		Session sessiondeletefoTeacher=FactoryProvider.getfactory().openSession();
		Transaction tx=sessiondeletefoTeacher.beginTransaction();
		Teacher teacher=(Teacher)sessiondeletefoTeacher.get(Teacher.class, tid);
		sessiondeletefoTeacher.delete(teacher);
		tx.commit();
		sessiondeletefoTeacher.close();
		response.sendRedirect("ListofTeacher.jsp");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

	

}
