<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ page import=" org.hibernate.Session" %>
      <%@ page import="  com.phase.helper.FactoryProvider" %>
       <%@ page import="java.util.List" %>
       <%@ page import="org.hibernate.Transaction" %>
       <%@ page import=" com.phase.Entity.Teacher" %>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add teacher</title>
<%@include file="link.jsp" %>
</head>
<body>
<div class="container-fluid m-0 p-0">
<%@include file="navbar.jsp" %>

<div class="row">



<div class="col-md-4 offset-md-4 my-4 py-2">
<div class="my-1 py-1 text-center"><h4>Add Teacher</h4></div>
<% int t_id=Integer.parseInt(request.getParameter("tid").trim());
Session sessionTeacher=FactoryProvider.getfactory().openSession();
Teacher tech=(Teacher)sessionTeacher.get(Teacher.class, t_id);

%>
<form action="TeacherUpdateServlet" method="post">
<input value="<%=tech.getTid() %>" name="tid" type="hidden"/>
  <div class="mb-3">
    <label for="coursename" class="form-label">Teacher Full Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="fname"value="<%=tech.getTname()%>">
    </div>
  <div class="mb-3">
    <label for="subject1" class="form-label">Teacher Qualification</label>
    <input type="text" class="form-control" id="exampleInputPassword1"  name="Qualification" value="<%=tech.getQualification() %>">
  </div>
  <div class="mb-3">
    <label for="subject1" class="form-label">Teacher Age</label>
    <input type="text" class="form-control" id="exampleInputPassword1"  name="age" value="<%=tech.getAge() %>">
  </div>
<div class="text-center">
  <button type="submit" class="btn btn-primary">Submit</button></div>
</form>

</div>



</div>

</div>

</body>
</html>