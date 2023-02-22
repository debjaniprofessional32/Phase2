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


public class DeletServletStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeletServletStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	try {
			
			int studid=Integer.parseInt(request.getParameter("Stu_id").trim());
			Session sessiondeleteforStudent=FactoryProvider.getfactory().openSession();
			Transaction tx=sessiondeleteforStudent.beginTransaction();
			Student stud=(Student)sessiondeleteforStudent.get(Student.class, studid);
			sessiondeleteforStudent.delete(stud);
			tx.commit();
			sessiondeleteforStudent.close();
			response.sendRedirect("ListofStudent.jsp");
		
			
		}
		
		catch(Exception e) 
		
		{
			e.printStackTrace();
		}
	}



}
