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


public class SubjectUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SubjectUpdateServlet() {
        super();
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			 int subid= Integer.parseInt(request.getParameter("subid").trim());
			String course=request.getParameter("course");
			String subject1=request.getParameter("subject1");
			String subject2=request.getParameter("subject2");
			Session sessionupdateforSubject=FactoryProvider.getfactory().openSession();
			Transaction tx=sessionupdateforSubject.beginTransaction();
			Subject sub=sessionupdateforSubject.get(Subject.class, subid);
			sub.setSucourse(course);
			sub.setSuSubject1(subject1);
			sub.setSuSubject2(subject2);
			tx.commit();
			sessionupdateforSubject.close();
			response.sendRedirect("ListofSubject.jsp");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
