<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import=" org.hibernate.Session" %>
      <%@ page import="  com.phase.helper.FactoryProvider" %>
       <%@ page import="java.util.List" %>
       <%@ page import="org.hibernate.Query" %>
       <%@ page import=" com.phase.Entity.LAClass" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Summary of Class</title>
<%@include file="link.jsp" %>
</head>
<body>
<div class="container-fluid m-0 p-0">
<%@include file="navbar.jsp" %>
<div class="row">
<div class="text-center my-2"><h3>Summary of Class</h3></div>



<div class="col-md-12 offset-md-12 my-3 py-2">
<h2>Batch 1</h2>
<table class="table table-hover">
<caption>Summary of class</caption>
 <thead>
    <tr>
      <th scope="col">SN</th>
      <th scope="col">Class/Course Name</th>
      <th scope="col">Batch Name</th>
       <th scope="col">Period No.</th>
      <th scope="col">Teacher</th>
      <th scope="col">Subject</th>
      <th scope="col">Date</th>          
    <th scope="col"> List OF Student</th>
    <!-- private int cid;
	private String cName;
	private String bName;
	private String period_No;
	private String cteacher;
	private String csubject;
	private String date; 
	Query query = session.createQuery("from User where Employee_Name= :name");
query.setParameter("name", "asdf");
List list = query.list();-->
    </tr>
  </thead>
  <%

Session classSession=FactoryProvider.getfactory().openSession();
//Query q=classSession.createQuery("from LAClass");
Query q=classSession.createQuery("from  LAClass where bName=:bbname");
q.setParameter("bbname", "Batch1");
List<LAClass> list2=q.list();
for(LAClass cclass:list2){
	%>
  <tbody>
    <tr>
  
      <th scope="row"><%=cclass.getCid() %></th>
      <td><%=cclass.getcName() %></td>
      <td><%=cclass.getbName() %></td>
       <td><%=cclass.getPeriod_No() %></td>
      <td><%=cclass.getCteacher() %></td>
      <td><%=cclass.getCsubject() %></td>
      <td><%=cclass.getDate() %></td>
     <td><a href="Batch1.jsp">Link</a></td>
     
    </tr>
      
  </tbody>
  <%}
classSession.close();
%>
</table>
<h2>Batch 2</h2>
<table class="table table-hover">
<caption>Summary of class</caption>
 <thead>
    <tr>
      <th scope="col">SN</th>
      <th scope="col">Class/Course Name</th>
      <th scope="col">Batch Name</th>
       <th scope="col">Period No.</th>
      <th scope="col">Teacher</th>
      <th scope="col">Subject</th>
      <th scope="col">Date</th>          
    <th scope="col"> List OF Student</th>
    <!-- private int cid;
	private String cName;
	private String bName;
	private String period_No;
	private String cteacher;
	private String csubject;
	private String date; -->
    </tr>
  </thead>
  <%
  
Session classSession1=FactoryProvider.getfactory().openSession();
//Query q=classSession.createQuery("from LAClass");
Query q1=classSession1.createQuery("from  LAClass where bName=:bbname2");
q1.setParameter("bbname2", "Batch2");
List<LAClass> list1=q1.list();
for(LAClass cclass2:list1){
	%>
  <tbody>
    <tr>
  
      <th scope="row"><%=cclass2.getCid() %></th>
      <td><%=cclass2.getcName() %></td>
      <td><%=cclass2.getbName() %></td>
       <td><%=cclass2.getPeriod_No() %></td>
      <td><%=cclass2.getCteacher() %></td>
      <td><%=cclass2.getCsubject() %></td>
      <td><%=cclass2.getDate() %></td>
     <td><a href="Batch2.jsp">Link</a></td>
     
    </tr>
      
  </tbody>
  <%}
classSession1.close();
%>
</table>
</div>
</div>
</div>
</body>
</html>