
<%@page import="com.bit.hostel.model.Student"%>
<%@page import="java.util.*"%>
<div id="page-wrapper">
	<%
				List<Student> studentList = (List<Student>) request.getAttribute("list");

				if (request.getAttribute("list") != null) {
					studentList = (List<Student>) request.getAttribute("list");
				} else {
					studentList = new ArrayList<Student>();
				}
			%>
	<div style="padding-top: 10px"></div>		
	<div class="row">
	<h1>Student Details</h1>
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">DataTables Advanced Tables</div>
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
												style="width: 71px;" aria-sort="ascending">SID</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Browser: activate to sort column ascending"
												style="width: 91px;">First Name</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending"
												style="width: 81px;">Last Name</th>	
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending"
												style="width: 81px;">Branch</th>											
												<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending"
												style="width: 81px;">Section</th>											
																				
										</tr>
									</thead>
									<tbody>
						<%
							if (studentList.size() > 0) {
								for (int i = 0; i < studentList.size(); i++) {
						%>
								<tr class="gradeA odd" role="row">
									<td><%=studentList.get(i).getSID()%></td>
									<td><%=studentList.get(i).getFirstName()%></td>
									<td><%=studentList.get(i).getLastName()%></td>
									<td><%=studentList.get(i).getsBranch()%></td>
								   <td><%=studentList.get(i).getSection()%></td>
								</tr>	
						<%
							}
							} else {
						%>
						<td colspan="5" align="center">No Data Available</td>
						<%
							
						}%>
										
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