<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import=" org.hibernate.Session" %>
      <%@ page import="  com.phase.helper.FactoryProvider" %>
       <%@ page import="java.util.List" %>
       <%@ page import="org.hibernate.Transaction" %>
       <%@ page import=" com.phase.Entity.LAClass" %>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Class</title>
<%@include file="link.jsp" %>
</head>
<body>
<div class="container-fluid m-0 p-0">
<%@include file="navbar.jsp" %>

<div class="row">



<div class="col-md-4 offset-md-4 my-4 py-2">
<div class="my-1 py-1 text-center"><h4>Edit Class</h4></div>
<% int subid=Integer.parseInt(request.getParameter("c_id").trim());
Session sessionupdateforSubject=FactoryProvider.getfactory().openSession();
LAClass laclass=(LAClass)sessionupdateforSubject.get(LAClass.class, subid);

%>
<form action="ClassUpdateServlet" method="post">
<input value="<%=laclass.getCid() %>" name="cid" type="hidden"/>
  <div class="mb-3">
    <label for="coursename" class="form-label">Class Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name" 
    value="<%= laclass.getcName() %>">
    </div>
  <div class="mb-3">
    <label for="subject1" class="form-label">Batch Name</label>
    <input type="text" class="form-control" id="exampleInputPassword1"  name="batch" value="<%=laclass.getbName()%>">
  </div>
   <div class="mb-3">
    <label for="subject1" class="form-label">Period No</label>
    <input type="text" class="form-control" id="exampleInputPassword1"  name="period" value="<%=laclass.getPeriod_No()%>">
  </div>
  <div class="mb-3">
    <label for="subject1" class="form-label">Teacher</label>
    <select class="form-select" aria-label="Default select example" name="select1" value="<%=laclass.getCteacher()%>">
<option selected>Open this select menu</option>
  <option value="Mehak M Chaudhari">Mehak M Chaudhari</option>
  <option value="Sulabh Somi gadha	">Sulabh Somi gadha	</option>
  <option value="Mehak M Chaudhari">Mehak M Chaudhari</option>  
   <option value="Soni martha">Soni martha</option>	
   <option value="Pallavi Dexhit">Pallavi Dexhit	</option>	
</select>
  </div>
    <div class="mb-3">
    <label for="subject1" class="form-label">Subject</label>
    <select class="form-select" aria-label="Default select example" name="select2" value="<%=laclass.getCsubject()%>">
 <option selected>Open this select menu</option>
  <option value="English">English</option>
  <option value="Math">Math</option>
  <option value="Science">Science</option>
  <option value="Social Studies">Social Studies</option>
  <option value="Hindi">Hindi</option>
   <option value="Hindi">Hindi</option>
</select>
  </div>
  <div class="mb-3">
    <label for="subject1" class="form-label">Date</label>
    <input type="date" class="form-control" id="exampleInputPassword1"  name="date" value="<%=laclass. getDate()%>">
  </div>
  
<div class="text-center">
  <button type="submit" class="btn btn-primary">Submit</button></div>
</form>

</div>



</div>
</div>

</body>
</html>