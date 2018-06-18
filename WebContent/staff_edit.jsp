<%@page import="com.bit.hostel.model.Staff"%>
<%=request.getAttribute("resultmsg")==null?"-":request.getAttribute("resultmsg") %>

<%
Staff staff;
if(request.getAttribute("staff") != null){
  	staff = (Staff)request.getAttribute("staff");
} else {
	staff=new Staff();
}
%>

<div id="page-wrapper">
	<div class="panel-body">
		<div class="row">


			<h1>Add New Staff</h1>

			<form action="staffServlet" method="post">
				<div class="well">

					<div class="row">

						<input type="hidden" name="staffid">

						<div class="form-group col-lg-4 ">
							<label for="staffname">Staff Name</label> <input type="text"
								name="staffname" class="form-control"
								placeholder="Enter Staff Name" value="<%=staff.getStaffname()==null?"":staff.getStaffname() %>" required>
						</div>

						<div class="form-group col-lg-4">
							<label for="contact">Contact</label> <input type="text"
								name="contact" class="form-control"
								placeholder="Enter Contact No" value="<%=staff.getContact()==null?"":staff.getContact() %>">
						</div>

						<div class="form-group col-lg-4">
							<label for="email">Email Id</label> <input type="text"
								name="email" class="form-control" placeholder="Enter Email Id" value="<%=staff.getEmail()==null?"":staff.getEmail() %>">
						</div>




						<div class="form-group col-lg-4">
							<label for="gender">Gender</label>
							<div class="form-control">
								<input type="radio" name="gender" checked="checked" value="Male">Male
								<input type="radio" name="gender" value="Female">Female
							</div>
						</div>


						<div class="form-group col-lg-4">
							<label for="department">Department</label> <select
								name="department" class="form-control">
								<option>Computer Science</option>
								<option>Electrical Engineering</option>
								<option>Electronics Engineering</option>
								<option>Civil Engineering</option>
								<option>Mechanical Engineering</option>
							</select>
						</div>



						<div class="form-group col-lg-4">
							<label for="stafftype">Staff Type</label> <select
								name="stafftype" class="form-control">
								<option>HOD</option>
								<option>Professor</option>
								<option>Assistant Professor</option>
								<option>Lab Incharge</option>
								<option>Lab Assistant</option>
							</select>


						</div>

						<div class="form-group col-lg-4">
							<label for="dateofbirth">Date Of Birth</label> <input type="text"
								name="dateofbirth" class="form-control" placeholder="Enter DOB">
						</div>

					</div>


					<div class="row">
						<div class="form-group col-lg-2">


							<%
									if (request.getAttribute("action") != null && request.getAttribute("action").equals("edit")) {
								%>
							<button type="submit" class="form-control btn btn-success"
								value="edit">Edit</button>
							<%
									} else {
								%>
							<button type="submit" class="form-control btn btn-success"
								value="save">Save</button>
							<%
									}
								%>
						</div>


						<div class="form-group col-lg-2">
							<button type="reset" class="form-control btn btn-success"
								value="reset">Reset</button>
						</div>

					</div>

				</div>



			</form>

		</div>
	</div>

</div>