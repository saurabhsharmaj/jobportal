<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="header.jsp"></jsp:include>
<body>
<h1>Staff Module</h1> 
<form action="StaffLogin" method ="post">
<div class ="container">
<div class ="row">
<div class ="form-group table">

<div class="col-lg-6">

<input type="text" name="username" placeholder="Enter User Name" class="form-control">
</div>

<div class="col-lg-6">

<input type="password" name="password" placeholder="Enter Password" class="form-control">
</div>

<div class="col-lg-6">

<input type="submit" name="submit" plceholder="Submit" class="form-control">
</div>

</div>
</div>
</div>
</form>
</body>
</html>