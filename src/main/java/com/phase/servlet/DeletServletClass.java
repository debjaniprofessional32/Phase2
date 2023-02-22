package com.phase.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.phase.Entity.LAClass;
import com.phase.helper.FactoryProvider;


public class DeletServletClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DeletServletClass() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int cid=Integer.parseInt(request.getParameter("c_id").trim());
			Session sessiondeletefoClass=FactoryProvider.getfactory().openSession();
			Transaction tx=sessiondeletefoClass.beginTransaction();
			LAClass cclass=(LAClass)sessiondeletefoClass.get(LAClass.class, cid);
			sessiondeletefoClass.delete(cclass);
			tx.commit();
			sessiondeletefoClass.close();
			response.sendRedirect("summary.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
