<%@page import="jobportal.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
	<link rel="shortcut icon" href="logo.PNG">
	<title>Job Portal Index</title>
</head>
<body>
		<%=request.getAttribute("errormsg")==null?"":request.getAttribute("errormsg")%>
		<%=request.getAttribute("msg")==null?"":request.getAttribute("msg")%>
<br>
<br>		
<div class="row">
		<div class ="col-lg-4">
					<form action="LogIn" method="post">
							<div class="form-group">
								<input  type="text" name="username" class="form-control"  placeholder="enter username">
							</div>
							<div class="form-group">
								<input type="password"  name="password" class="form-control"  placeholder="enter password">
							</div>
							
							<div class="form-group">
								<input type="submit"  name="login" class="form-control" value="Login">
								
							</div>
					</form>
		<div>
	<br>
<br>
		<%=request.getAttribute("LogOut")==null?"":request.getAttribute("LogOut")%>
</body>
</html>