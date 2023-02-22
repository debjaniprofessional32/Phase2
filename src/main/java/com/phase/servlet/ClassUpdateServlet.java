package com.phase.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.phase.Entity.LAClass;
import com.phase.helper.FactoryProvider;

/**
 * Servlet implementation class ClassUpdateServlet
 */
public class ClassUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ClassUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			 int cid= Integer.parseInt(request.getParameter("cid").trim());
			 String cName=request.getParameter("name");
		     String bName=request.getParameter("batch");
			 String period_No=request.getParameter("period");
			 String cteacher=request.getParameter("select1");
			 String csubject=request.getParameter("select2");
		     String cdate=request.getParameter("date");
		     SimpleDateFormat cdateformat = new SimpleDateFormat("yyyy-MM-dd");
             Date cdatec=cdateformat.parse(cdate);
				Session sessionupdateforclass=FactoryProvider.getfactory().openSession();
				Transaction tx=sessionupdateforclass.beginTransaction();
				LAClass c=sessionupdateforclass.get(LAClass.class, cid);
				c.setcName(cName);
				c.setbName(bName);
				c.setPeriod_No(period_No);
				c.setCteacher(cteacher);
				c.setCsubject(csubject);
				c.setDate(cdate);
				tx.commit();
				sessionupdateforclass.close();
				response.sendRedirect("FinalSummary.jsp");
			
		}

		catch(Exception e) {
			
			e.printStackTrace();
		}	
	}

}
