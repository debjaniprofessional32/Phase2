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


public class DeletServletSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public DeletServletSubject() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			int subid=Integer.parseInt(request.getParameter("Su_id").trim());
			Session sessiondeleteforSubject=FactoryProvider.getfactory().openSession();
			Transaction tx=sessiondeleteforSubject.beginTransaction();
			Subject sub=(Subject)sessiondeleteforSubject.get(Subject.class, subid);
			sessiondeleteforSubject.delete(sub);
			tx.commit();
			sessiondeleteforSubject.close();
			response.sendRedirect("ListofSubject.jsp");
		
			
		}
		
		catch(Exception e) 
		
		{
			e.printStackTrace();
		}
	}



}
