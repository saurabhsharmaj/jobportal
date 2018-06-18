
<%@page import="com.bit.hostel.model.Staff"%>
<%@page import="java.util.*"%>

<div id="page-wrapper">
	<div class="panel-body">
		<div class="row">
			<h1>Staff Details</h1>

 				<%
					List<Staff> list = (List<Staff>) request.getAttribute("list");

					if (request.getAttribute("list") != null) {
						list = (List<Staff>) request.getAttribute("list");
					} else {
						list = new ArrayList<Staff>();
					}
				%>				
<div style="padding-top: 10px"></div>		
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading"><button><a href ="./staffServlet?action=add"class="btn">Add Staff</a></button>
				</div>
				<!-- /.panel-heading -->
				<div class="panel-body">
					<div id="dataTables-example_wrapper"
						class="dataTables_wrapper form-inline dt-bootstrap no-footer">
						
						<div class="row">
							<div class="col-sm-12">
								<table width="100%"
									class="table table-striped table-bordered table-hover dataTable no-footer dtr-inline"
									id="dataTables-example" role="grid"
									aria-describedby="dataTables-example_info" style="width: 100%;">
									<thead>
										<tr role="row">
										<th class="sorting_asc" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Rendering engine: activate to sort column descending"
												style="width: 71px;" aria-sort="ascending">Staff Id</th>
												<th class="sorting_asc" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Rendering engine: activate to sort column descending"
												style="width: 71px;" aria-sort="ascending">Staff Name</th>
											<th class="sorting_asc" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Rendering engine: activate to sort column descending"
												style="width: 71px;" aria-sort="ascending">Contact</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Browser: activate to sort column ascending"
												style="width: 91px;">Email Id</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending"
												style="width: 81px;">Gender</th>	
											<th class="sorting_asc" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Rendering engine: activate to sort column descending"
												style="width: 71px;" aria-sort="ascending">Department</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Browser: activate to sort column ascending"
												style="width: 91px;">Staff Type</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending"
												style="width: 81px;">DOB</th>	
											<th class="sorting_asc" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Rendering engine: activate to sort column descending"
												style="width: 71px;" aria-sort="ascending">Updated On</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Browser: activate to sort column ascending"
												style="width: 91px;">Updated By</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending"
												style="width: 81px;">Status</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending"
												style="width: 81px;">Action</th>	
																				
										</tr>
									</thead>
									<tbody>
				
							<%
								if (list.size() > 0) {
									for (int i = 0; i < list.size(); i++) {
							%>
							<tr>
								<td><%=list.get(i).getStaffId()%></td>
								<td><%=list.get(i).getStaffname()%></td>
								<td><%=list.get(i).getContact()%></td>
								<td><%=list.get(i).getEmail()%></td>
								<td><%=list.get(i).getGender()%></td>
								<td><%=list.get(i).getDepartment()%></td>
								<td><%=list.get(i).getStafftype()%></td>
								<td><%=list.get(i).getDateofbirth()%></td>
								<td><%=list.get(i).getUpdatedOn()%></td>
								<td><%=list.get(i).getUpdatedby()%></td>
								<td><%=list.get(i).getStatusenum()%></td>

					            <td><a href="./staffServlet?action=delete&id=<%=list.get(i).getStaffId()%>">
							      Delete
						           </a>
						           <a href="./staffServlet?action=edit&id=<%=list.get(i).getStaffId()%>">
							      Edit
						           </a>
					            </td>



							</tr>
							<%
								}
								} else {
							%>
							<td colspan="11" align="center">No Data Available</td>
							<%
								}
							%>
										
									</tbody>
								</table>
						    </div>
						</div>
						
					</div>
					<!-- /.table-responsive -->
				</div>
				<!-- /.panel-body -->
			</div>
			<!-- /.panel -->
		</div>
		<!-- /.col-lg-12 -->
	</div>

</div>