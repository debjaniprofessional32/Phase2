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

<div class="text-center">
<a class="btn btn-outline-dark" href="addclass.jsp" role="button">Add class</a>
</div>

<div class="col-md-12 offset-md-12 my-3 py-2">

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
    <th scope="col"> Delete</th>
    <th scope="col">Edit</th>
    </tr>
  </thead>
  <%
Session classSession=FactoryProvider.getfactory().openSession();
Query q=classSession.createQuery("from LAClass");
List<LAClass> list=q.list();
for(LAClass cclass:list){
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
     
       <td><a href="DeletServletClass?c_id=<%=cclass.getCid() %>" class="btn btn-danger"><i class="fa-sharp fa-solid fa-trash"></i></a></td>
     <td><a href="editClass.jsp?c_id=<%=cclass.getCid() %>" class="btn btn-success"><i class="fa-sharp fa-solid fa-pen-nib"></i></a></td>
    
    </tr>
      
  </tbody>
  <%}
classSession.close();
%>
</table>


</div>
</div>
</div>
</body>
</html>