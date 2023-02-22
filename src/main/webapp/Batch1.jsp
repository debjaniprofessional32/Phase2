<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import=" org.hibernate.Session" %>
      <%@ page import="  com.phase.helper.FactoryProvider" %>
       <%@ page import="java.util.List" %>
       <%@ page import="org.hibernate.Query" %>
       <%@ page import=" com.phase.Entity.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List OF Student</title>
<%@include file="link.jsp" %>
</head>
<body>
<div class="container-fluid m-0 p-0">
<%@include file="navbar.jsp" %>
<div class="row">
<div class="text-center my-2"><h3>List Of Student</h3></div>

<div class="text-center">
<a class="btn btn-outline-dark" href="Student.jsp" role="button">Add Student</a>
</div>

<div class="col-md-4 offset-md-4 my-3 py-2">

<table class="table table-hover">
<caption>List of Student</caption>
 <thead>
    <tr>
      <th scope="col">SN</th>
      <th scope="col">Student Full Name</th>
      <th scope="col">Student Batch</th>
      
   
    </tr>
  </thead>
    <%
Session studentSession=FactoryProvider.getfactory().openSession();
Query q=studentSession.createQuery("from Student where batch=:bbatch");
q.setParameter("bbatch", "Batch1");
List<Student> list=q.list();
for(Student stud:list){
	%>
  <tbody>
    <tr>
      <th scope="row"><%=stud.getStid() %></th>
      <td><%=stud.getStuname() %></td>
       <td><%=stud.getBatch() %></td>
    
    </tr>
   
    
  </tbody>
  	
	<%}
studentSession.close();
%>
</table>


</div>
</div>

</div>
</body>
</html>