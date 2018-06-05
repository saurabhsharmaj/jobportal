<%@page import="jobportal.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 	<link rel="shortcut icon" href="logo.PNG">
	<title>Job Portal Home</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
  </head>
<body>

			<%
			response.setHeader("cache-control", "no-cache, no-store, must-revalidate");
			if(session.getAttribute("username")==null){
				request.setAttribute("msg", " Please Login First.");
				request.getRequestDispatcher("index.jsp").forward(request, response);}
			%>
			

<div class="row">
		
			<div class="col-lg-1">
				<form action="LogIn" method="get">
					<input type="submit" name="Logout" value="Logout">		
				</form>
			</div>
			<div class="col-lg-5"><%=request.getAttribute("LogIn")==null?"":request.getAttribute("LogIn")%></div>
		
</div>


<%=request.getAttribute("resultmsg")==null?"-":request.getAttribute("resultmsg") %>
<div class="container">

<%
User user;
if(request.getAttribute("user") != null){
  	user = (User)request.getAttribute("user");
} else {
	user=new User();
}
%>
	<div class="row">
		<div class ="col-lg-4">
					<form action="users" method="post">
							<input type="hidden" name="userId" value="<%=user.getUserId()%>">
							<div class="form-group">
								<input  type="text" name="username" class="form-control" value="<%=user.getUsername() %>" placeholder="enter username">
							</div>
							<div class="form-group">
								<input type="password"  name="password" class="form-control" value="<%=user.getPassword() %>" placeholder="enter password">
							</div>
							<div class="form-group">
								<input type="text"  name="email" class="form-control" value="<%=user.getEmail()%>" placeholder="enter email">
							</div>
							<div class="form-group">
							<div class="row">
								<div class="col-lg-6">
								<%if(request.getAttribute("action") !=null && request.getAttribute("action").equals("edit")) {%>							
									<input type="submit"  class="form-control" value="edit">
								<%} else { %>
									<input type="submit"  class="form-control" value="save">
								<%} %>
								</div>
								<div class="col-lg-6">
								<input type="reset"  class="form-control" value="reset">
								</div>
							</div>	
								
							</div>
					</form>
		<div>
			<form action="search">
					<div><input type="text" name="search" placeholder="search username here" class="form-control"></div>
					<div><input type="submit" name="submit" value="Search" class="form-control"></div>
			</form>
		
		</div>
		</div>
		
		<div class="table-responsive col-lg-6">
			<table class="table-striped">
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
					<td><a href="./useraction?action=delete&userId=<%=users.get(i).getUserId()%>">
							<img src="./images/delete.png">
						</a>
						<a href="./useraction?action=edit&userId=<%=users.get(i).getUserId()%>">
							<img src="./images/edit.png">
						</a>
					</td>
				</tr>
			<%}
				}%>
			</table>
		</div>
	</div>
	
	

	
	
	
	
	
</div>
</body>
</html>