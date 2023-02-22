<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import=" org.hibernate.Session" %>
      <%@ page import="  com.phase.helper.FactoryProvider" %>
       <%@ page import="java.util.List" %>
       <%@ page import="org.hibernate.Query" %>
       <%@ page import=" com.phase.Entity.Subject" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List OF Subject</title>
<%@include file="link.jsp" %>
</head>
<body>
<div class="container-fluid m-0 p-0">
<%@include file="navbar.jsp" %>
<div class="row">
<div class="text-center my-2"><h3>List Of Subject</h3></div>

<div class="text-center">
<a class="btn btn-outline-dark" href="subject.jsp" role="button">Add Student</a>
</div>

<div class="col-md-5 offset-md-3 my-3 py-2">

<table class="table table-hover">
<caption>List of Subject</caption>
 <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Subject1</th>
      <th scope="col">Subject1</th>
      <th scope="col">Subject3</th>
     <th scope="col">Delete</th>
       <th scope="col">Edit</th>
    </tr>
  </thead>
  <%
Session subjectSession=FactoryProvider.getfactory().openSession();
Query q=subjectSession.createQuery("from Subject");
List<Subject> list=q.list();
for(Subject sub:list){
	%>
	
	  <tbody>
    <tr>
      <th scope="row"><%=sub.getSuid() %></th>
      <td><%=sub.getSucourse() %></td>
      <td><%=sub.getSuSubject1() %></td>
     <td><%=sub.getSuSubject2() %></td>
    <td><a href="DeletServletSubject?Su_id=<%=sub.getSuid() %>" class="btn btn-danger"><i class="fa-sharp fa-solid fa-trash"></i></a></td>
     <td><a href="Editteacher.jsp?Su_id=<%=sub.getSuid() %>" class="btn btn-success"><i class="fa-sharp fa-solid fa-pen-nib"></i></a></td>
    </tr>
    
   
  </tbody>
	
	
	<%}
subjectSession.close();
%>

</table>


</div>
</div>

</div>
</body>
</html>