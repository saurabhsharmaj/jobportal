<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
	<link rel="shortcut icon" href="logo.PNG">

<title>Insert title here</title>
</head>
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