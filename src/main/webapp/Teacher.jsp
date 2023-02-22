<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<form action="AddTeacher" method="post">
  <div class="mb-3">
    <label for="coursename" class="form-label">Teacher Full Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="fname">
    </div>
  <div class="mb-3">
    <label for="subject1" class="form-label">Teacher Qualification</label>
    <input type="text" class="form-control" id="exampleInputPassword1"  name="Qualification">
  </div>
  <div class="mb-3">
    <label for="subject1" class="form-label">Teacher Age</label>
    <input type="text" class="form-control" id="exampleInputPassword1"  name="age">
  </div>
<div class="text-center">
  <button type="submit" class="btn btn-primary">Submit</button></div>
</form>

</div>



</div>

</div>

</body>
</html>