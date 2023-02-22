<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ page import=" org.hibernate.Session" %>
      <%@ page import="  com.phase.helper.FactoryProvider" %>
       <%@ page import="java.util.List" %>
       <%@ page import="org.hibernate.Transaction" %>
       <%@ page import=" com.phase.Entity.Subject" %>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Subject</title>
<%@include file="link.jsp" %>
</head>
<body>
<div class="container-fluid m-0 p-0">
<%@include file="navbar.jsp" %>
<div class="row">



<div class="col-md-4 offset-md-4 my-4 py-2">
<div class="my-1 py-1 text-center"><h4>Edit Subject</h4></div>
<% int subid=Integer.parseInt(request.getParameter("Su_id").trim());
Session sessionupdateforSubject=FactoryProvider.getfactory().openSession();
Subject sub=(Subject)sessionupdateforSubject.get(Subject.class, subid);

%>
<form action ="SubjectUpdateServlet" method ="post">
<input value="<%=sub.getSuid() %>" name="subid" type="hidden"/>
  <div class="mb-3">
    <label for="coursename" class="form-label">Subject 1</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" 
    name="course"  value="<%=sub.getSucourse() %>"required>
    </div>
  <div class="mb-3">
    <label for="subject1" class="form-label">Subject 2</label>
    <input type="text" class="form-control" id="exampleInputPassword1"  
    name="subject1" value="<%=sub.getSuSubject1() %>" required>
  </div>
  <div class="mb-3">
    <label for="subject1" class="form-label">Subject 2</label>
    <input type="text" class="form-control" id="exampleInputPassword1"  
    name="subject2"  value="<%=sub.getSuSubject2() %>"required>
  </div>

 
<div class="text-center">
  <button type="submit" class="btn btn-primary">Edit</button></div>
</form>

</div>



</div>


</div>
</body>
</html>