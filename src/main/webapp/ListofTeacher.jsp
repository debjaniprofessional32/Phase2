<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import=" org.hibernate.Session" %>
      <%@ page import="  com.phase.helper.FactoryProvider" %>
       <%@ page import="java.util.List" %>
       <%@ page import="org.hibernate.Query" %>
       <%@ page import=" com.phase.Entity.Teacher" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List OF Teacher</title>
<%@include file="link.jsp" %>
</head>
<body>
<div class="container-fluid m-0 p-0">
<%@include file="navbar.jsp" %>
<div class="row">
<div class="text-center my-2"><h3>List Of Teacher</h3></div>

<div class="text-center">
<a class="btn btn-outline-dark" href="Teacher.jsp" role="button">Add Teacher</a>
</div>

<div class="col-md-4 offset-md-4 my-3 py-2">

<table class="table table-hover">

 <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Teacher Name</th>
      <th scope="col">Qualification</th>
      <th scope="col">Age</th>
     <th scope="col">Delete</th>
       <th scope="col">Edit</th>
    </tr>
  </thead>
  <%
Session teacherSession=FactoryProvider.getfactory().openSession();
Query q=teacherSession.createQuery("from Teacher");
List<Teacher> list=q.list();
for(Teacher t:list){
	%>
  <tbody>
    <tr>
      <th scope="row"><%=t.getTid() %></th>
      <td><%=t.getTname() %></td>
      <td><%=t.getQualification() %></td>
      <td><%=t.getAge() %></td>
      <td><a href="DeleteteacherServlet?tid=<%=t.getTid() %>" class="btn btn-danger"><i class="fa-sharp fa-solid fa-trash"></i></a></td>
     <td><a href="Editteacher.jsp?tid=<%=t.getTid() %>" class="btn btn-success"><i class="fa-sharp fa-solid fa-pen-nib"></i></a></td>
    </tr>
    
 
     
  </tbody>
 <%}
teacherSession.close();
%>
</table>


</div>
</div>
</div>
</body>
</html>