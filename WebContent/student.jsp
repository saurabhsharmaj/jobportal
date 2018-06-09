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
	<div class="row container" align="center">
		<input type="hidden" name="SId" class="form-control" value="<%=student.getSId() %>">
		<div class="col-lg-6">
			<div class="form-group"><input type="text" name="FirstName" class="form-control" placeholder="Enter First Name"></div>
			<div class="form-group"><input type="text" name="LastName" class="form-control" value="<%=student.getLastName() %>" placeholder="Enter last Name"></div>
			<div class="form-group"><input type="text" name="SRollNo" class="form-control" value="<%=student.getSRollNo() %>" placeholder="Enter Student Roll No."></div>
			<div class="form-group"><input type="text" name="SMobile" class="form-control" value="<%=student.getSMobile() %>" placeholder="Enter Student Contact No."></div>
			<div class="form-group"><input type="text" name="SEmail" class="form-control" value="<%=student.getSEmail() %>" placeholder="Enter your email"></div>
			<div class="form-group"><input type="text" name="FatherName" class="form-control" value="<%=student.getFatherName() %>" placeholder="Enter Father's Name"></div>
			<div class="form-group"><input type="text" name="FatherContact" class="form-control" value="<%=student.getFatherContact() %>" placeholder="Enter Father's Contact No."></div>
			<div class="form-group"><input type="text" name="MotherName" class="form-control" value="<%=student.getMotherName() %>" placeholder="Enter Mother's Name"></div>
			<div class="form-group"><input type="text" name="MotherConntact" class="form-control" value="<%=student.getMotherContact() %>" placeholder="Enter Mother's Contact No."></div>
			
			<div class="form-group row">
				<div class="col-lg-2">Gender :</div>
					<div class="col-lg-2"><input type="radio" name="SGender" value="<%=student.getSGender() %>" checked="checked">Male</div>
					<div class="col-lg-3"><input type="radio" name="SGender" value="<%=student.getSGender() %>">Female</div>
				</div>
			
			<div class="row form-group">
				<div class="col-lg-2">Branch :</div>
				<div class="col-lg-5">
<<<<<<< HEAD
					<select name="SBranch">
						<option value="<%=student.getSBranch() %>">Computer Science</option>
						<option value="<%=student.getSBranch() %>">Electrical Engineering</option>
						<option value="<%=student.getSBranch() %>">Electronics Engineering</option>
						<option value="<%=student.getSBranch() %>">Civil Engineering</option>
						<option value="<%=student.getSBranch() %>">Mechanical Engineering</option>
=======
					<select>
						<option>Computer Science And Engineering</option>
						<option>Electrical Engineering</option>
						<option>Electronics Engineering</option>
						<option>Civil Engineering</option>
						<option>Mechanical Engineering</option>
>>>>>>> branch 'master' of https://github.com/saurabhsharmaj/jobportal.git
					</select>
				</div>
			</div>
			
				<div class="form-group"><input type="text" name="SAddressP" class="form-control" value="<%=student.getSAddressP() %>" placeholder="Enter Permanent Address"></div>
			<div class="form-group"><input type="text" name="SAddressC" class="form-control" value="<%=student.getSAddressC() %>" placeholder="Enter Current Address"></div>
			<div class="form-group"><input type="text" name="SCity" class="form-control" value="<%=student.getSCity() %>" placeholder="Enter City"></div>
			<div class="form-group"><input type="text" name="SState" class="form-control" value="<%=student.getSState() %>" placeholder="Enter State"></div>
			<div class="form-group"><input type="date" name="SDOB" class="form-control" value="<%=student.getSDOB() %>" placeholder="Enter your DOB"></div>
			<div class="form-group"><input type="text" name="S10Th" class="form-control" value="<%=student.getS10Th() %>" placeholder="Enter 10th Percent"></div>
			<div class="form-group"><input type="text" name="S12Th" class="form-control" value="<%=student.getS12Th() %>" placeholder="Enter 12th Percent"></div>
			<div class="form-group"><input type="text" name="SDeploma" class="form-control" value="<%=student.getSDeploma() %>" placeholder="Enter Deploma Field"></div>
			<div class="form-group"><input type="text" name="SPercent" class="form-control" value="<%=student.getSPercent() %>" placeholder="Enter Deploma Percent"></div>
			<div class="form-group"><input type="text" name="SJee" class="form-control" value="<%=student.getSJee() %>" placeholder="jEE"></div>
			<div class="form-group"><input type="text" name="SDirect" class="form-control" value="<%=student.getSDirect() %>" placeholder="Direct Admition"></div>
			<div class="form-group"><input type="text" name="SYear" class="form-control" value="<%=student.getSYear() %>" placeholder="Enter Current Year"></div>
			<div class="form-group"><input type="text" name="SEnum" class="form-control" value="<%=student.getSEnum() %>" placeholder="Enter Current Year"></div>
			<div class="form-group"><input type="text" name="UpdatedOn" class="form-control" value="<%=student.getUpdatedOn() %>" placeholder="Enter Current Year"></div>
			<div class="form-group"><input type="text" name="UpdatedBy" class="form-control" value="<%=student.getUpdatedBy() %>" placeholder="Enter Current Year"></div>
			
			
		</div>	
			
		<div class="col-lg-6">
			
			
			
			
		</div>
		
			<div class="col-lg-12" align="center"><input type="submit" ></div>
		
	</div>
	</form><hr>
	
	<div class="row container-Fluid">
			<div class="table-responsive col-lg-12">
			<table class="table-striped">
			<tr>
			<th>Student Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Branch</th>
			<th>Student Contact</th>
			<th>Gender</th>
			<th>Roll No</th>
			<th>Email</th>
			<th>Permanent Address</th>
			<th>Current Address</th>
			<th>City</th>
			<th>State</th>
			<th>DOB</th>
			<th>10Th</th>
			<th>12Th</th>
			<th>Deploma</th>
			<th>Deploma Percent</th>
			<th>Jee</th>
			<th>Direct</th>
			<th>Father's Name</th>
			<th>Mother's Name</th>
			<th>Father's Contact</th>
			<th>Mother's Contact</th>
			<th>Year</th>
			<th>Updated On</th>
			<th>Updated By</th>
			<th>Action</th>
			</tr>
			
			<%
			if(request.getAttribute("students") != null){
			    List<Student> students = (List<Student>)request.getAttribute("students");
				for(int i=0; i < students.size(); i++){
			%>
				<tr>
					<td><%=students.get(i).getSId() %></td>
					<td><%=students.get(i).getFirstName() %></td>
					<td><%=students.get(i).getLastName() %></td>
					<td><%=students.get(i).getSMobile() %></td>
					<td><%=students.get(i).getSGender() %></td>
					<td><%=students.get(i).getSRollNo() %></td>
					<td><%=students.get(i).getSEmail() %></td>
					<td><%=students.get(i).getSAddressP() %></td>
					<td><%=students.get(i).getSAddressC() %></td>
					<td><%=students.get(i).getSCity() %></td>
					<td><%=students.get(i).getSState() %></td>
					<td><%=students.get(i).getSDOB() %></td>
					<td><%=students.get(i).getS10Th() %></td>
					<td><%=students.get(i).getS12Th() %></td>
					<td><%=students.get(i).getSDeploma() %></td>
					<td><%=students.get(i).getSPercent() %></td>
					<td><%=students.get(i).getSJee() %></td>
					<td><%=students.get(i).getSDirect() %></td>
					<td><%=students.get(i).getFatherName() %></td>
					<td><%=students.get(i).getMotherName() %></td>
					<td><%=students.get(i).getFatherContact() %></td>
					<td><%=students.get(i).getMotherContact() %></td>
					<td><%=students.get(i).getSYear() %></td>
					<td><%=students.get(i).getUpdatedOn() %></td>
					<td><%=students.get(i).getUpdatedBy() %></td>
					
					<td><a href="./StudentAction?action=delete&SId=<%=students.get(i).getSId()%>">
							<img src="./images/delete.png">
						</a>
						<a href="./StudentAction?action=edit&SId=<%=students.get(i).getSId()%>">
							<img src="./images/edit.png">
						</a>
					</td>
				</tr>
			<%}
				}%>
			</table>
		</div>
<<<<<<< HEAD
	</div>
=======
	</div>
	
>>>>>>> branch 'master' of https://github.com/saurabhsharmaj/jobportal.git
</body>
</html>