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
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
  </head>
<body>

<div class="container">
<a href="users">users</a>
	<div class="row">
		<div class ="col-lg-4">
					<form action="users" method="post">
							<div class="form-group">
								<input  type="text" name="username" class="form-control" placeholder="enter username">
							</div>
							<div class="form-group">
								<input type="password"  name="password" class="form-control" placeholder="enter password">
							</div>
							<div class="form-group">
								<input type="text"  name="email" class="form-control" placeholder="enter email">
							</div>
							<div class="form-group">							
								<input type="submit"  class="form-control" value="save">
							</div>
					</form>
		</div>
		<div class="col-lg-6">
			<table>
			<tr>
			<th>id</th>
			<th>username</th>
			<th>password</th>
			<th>email</th>
			<th>Action</th>
			</tr>
			
			<%
			if(request.getAttribute("users") != null){
				List<User> users = (List<User>)request.getAttribute("users");
				for(int i=0; i < users.size(); i++){
			%>
				<tr>
					<td><%=users.get(i).getUserId() %></td>
					<td><%=users.get(i).getUsername() %></td>
					<td><%=users.get(i).getPassword() %></td>
					<td><%=users.get(i).getEmail() %></td>
					<td><a href="./deleteuser?userId=<%=users.get(i).getUserId()%>">delete</a></td>
				</tr>
			<%}
				}%>
			</table>
		</div>
	</div>
</div>
</body>
</html>