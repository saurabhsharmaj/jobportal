<%@page import="jobportal.model.Student"%>
<%@page import="java.util.List"%>
<jsp:include page="header.jsp"></jsp:include>
<body>
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
			<div class="form-group"><input type="text" name="S_Mobile" class="form-control" placeholder="Enter Student Contact No."></div>
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
						<option>Computer Science And Engineering</option>
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
			<th>Student Id</th>
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
					<td><a href="./StudentAction?action=delete&S_Id=<%=students.get(i).getS_Id()%>">
							<img src="./images/delete.png">
						</a>
						<a href="./StudentAction?action=edit&S_Id=<%=students.get(i).getS_Id()%>">
							<img src="./images/edit.png">
						</a>
					</td>
				</tr>
			<%}
				}%>
			</table>
		</div>
	</div>
	
</body>
</html>