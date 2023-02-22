package com.phase.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.phase.Entity.LAClass;
import com.phase.Entity.Subject;
import com.phase.Entity.Teacher;
import com.phase.helper.FactoryProvider;


public class AddClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddClass() {
        super();
     
    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			
			 String cName=request.getParameter("name");
		     String bName=request.getParameter("batch");
			 String period_No=request.getParameter("period");
			 String cteacher=request.getParameter("select1");
			 String csubject=request.getParameter("select2");
		     String cdate=request.getParameter("date");
		    
		     
		     SimpleDateFormat cdateformat = new SimpleDateFormat("yyyy-MM-dd");
             Date cdatec=cdateformat.parse(cdate);
            
            LAClass lclass=new LAClass(cName, bName, period_No, cteacher,  csubject,  cdate);
            Session classSession=FactoryProvider.getfactory().openSession();
    		Transaction tx=classSession.beginTransaction();
    		classSession.save(lclass);
    		
    		tx.commit();
    		classSession.close();
    		//response.setContentType("text/html");
    		response.sendRedirect("summary.jsp");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
