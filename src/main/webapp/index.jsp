<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Subject</title>
<%@include file="link.jsp" %>
</head>
<body>
<div class="container-fluid m-0 p-0">

<div class="row">



<div class="col-md-4 offset-md-4 my-4 py-2">
<div class="my-1 py-1 text-center"><h4>Admin Login</h4></div>
<form action="AdminLoginServlet" method="post">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">

  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="pass">
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</div>



</div>


</div>
</body>
</html>