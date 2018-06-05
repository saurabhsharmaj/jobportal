<%@page import="jobportal.Student"%>
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
<title>Student Portal</title>
</head>

<div class="row" align="center"> <div class="col-lg-12"><h1>Student Registration Portal</h1></div></div>
<form action="StudentReg" method="post">
<div class="row container">
<div class="col-lg-6">
<div class="form-group"><input type="text" name="FName" class="form-control" placeholder="Enter First Name"></div>
<div class="form-group"><input type="text" name="LName" class="form-control" placeholder="Enter Last Name"></div>
<div  class="form-group"><input type="text" name="Email" class="form-control" placeholder="Enter Your Email"></div>
<div class="form-group"><input type="text" name="Student Contact No" class="form-control" placeholder="Enter Your Contact Number"></div>
</div>
<div class="col-lg-6">
<div class="form-group"><input type="text" name="Father's Name" class="form-control" placeholder="Enter Father's Name"></div>
<div class="form-group"><input type="text" name="Father's Contact No" class="form-control" placeholder="Enter Father's Contact No"></div>
</div>
<div class="col-lg-6">
<div class="form-group"><input type="text" name="Mother's Name" class="form-control" placeholder="Enter Mother's Name"></div>
<div class="form-group"><input type="text" name="Mother's Contact No" class="form-control" placeholder="Enter Mother's Contact No"></div>
</div>
<div class="form-group row">
<div class="col-lg-2">Gender :</div>
<div class="form-group"><input type="radio" name="Gender" checked="checked">Male</div>
<div class="form-group"><input type="radio" name="Gender" checked="checked">Female</div>
</div>

</form>


		<%
			Student student;
			if(request.getAttribute("student") != null){
		  	student = (Student)request.getAttribute("student");
			} else {
			student=new Student();
			}    
		%>

	<div class="row" align="center"><div class="col-lg-12"><h1>Student Registration Portal</h1></div></div>
	<form action="Student" method="post">
	<div class="row container">
	
		<div class="col-lg-6">
			<div class="form-group"><input type="text" name="First_Name" class="form-control" placeholder="Enter First Name"></div>
			<div class="form-group"><input type="number" name="S_Mobile" class="form-control" placeholder="Enter Student Contact No."></div>
			<div class="form-group"><input type="text" name="Father's_Name" class="form-control" placeholder="Enter Father's Name"></div>
			<div class="form-group"><input type="text" name="Mother's_Name" class="form-control" placeholder="Enter Mother's Name"></div>
			<div class="form-group"><input type="text" name="RollNo" class="form-control" placeholder="Enter Student Roll No."></div>
			<div class="form-group row">
				<div class="col-lg-2">Gender :</div>
					<div class="col-lg-2"><input type="radio" name="gender" checked="checked">Male</div>
					<div class="col-lg-3"><input type="radio" name="gender">Female</div>
				</div>
			
			<div class="row form-group">
				<div class="col-lg-2">Branch :</div>
				<div class="col-lg-5">
					<select>
						<option>Computer Science</option>
						<option>Electrical Engineering</option>
						<option>Electronics Engineering</option>
						<option>Civil Engineering</option>
						<option>Mechanical Engineering</option>
					</select>
				</div>
			</div>
		</div>	
			
		<div class="col-lg-6">
			<div class="form-group"><input type="text" name="Last_Name" class="form-control" placeholder="Enter last Name"></div>
			<div class="form-group"><input type="text" name="S_email" class="form-control"  placeholder="Enter your email"></div>
			<div class="form-group"><input type="text" name="Father'sContact" class="form-control" placeholder="Enter Father's Contact No."></div>
			<div class="form-group"><input type="text" name="Mother'sConntact" class="form-control" placeholder="Enter Mother's Contact No."></div>
		</div>
		
			<div class="col-lg-12" align="center"><input type="submit" ></div>
		
	</div>
	</form><hr>
	
	<div class="row container">
			<div class="table-responsive col-lg-12">
			<table class="table-striped">
			<tr>
			<th>Studednt Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Student Contact</th>
			<th>Action</th>
			</tr>
			
			<%
			if(request.getAttribute("students") != null){
			    List<Student> students = (List<Student>)request.getAttribute("students");
				for(int i=0; i < students.size(); i++){
			%>
				<tr>
					<td><%=students.get(i).getS_Id() %></td>
					<td><%=students.get(i).getFirst_Name() %></td>
					<td><%=students.get(i).getLast_Name() %></td>
					<td><%=students.get(i).getS_Mobile() %></td>
					<td><a href="./useraction?action=delete&userId=<%=students.get(i).getS_Id()%>">
							<img src="./images/delete.png">
						</a>
						<a href="./useraction?action=edit&userId=<%=students.get(i).getS_Id()%>">
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