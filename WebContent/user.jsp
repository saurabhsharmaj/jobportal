
<%@page import="com.bit.hostel.model.User"%>
<%@page import="java.util.*"%>
<div id="page-wrapper">
	<div class="panel-body">
		<div class="row">
		<h1>User Details</h1>
			<%
				List<User> userList = (List<User>) request.getAttribute("list");

				if (request.getAttribute("list") != null) {
					userList = (List<User>) request.getAttribute("list");
				} else {
					userList = new ArrayList<User>();
				}
			%>

			<div style="padding-top: 10px"></div>		
	<div class="row">
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
												style="width: 71px;" aria-sort="ascending">User Id
												engine</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Browser: activate to sort column ascending"
												style="width: 91px;">Username</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending"
												style="width: 81px;">Password</th>	
												<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Browser: activate to sort column ascending"
												style="width: 91px;">Email</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending"
												style="width: 81px;">Image Path</th>											
										</tr>
									</thead>
									<tbody>

						<%
							if (userList.size() > 0) {
								for (int i = 0; i < userList.size(); i++) {
						%>
						<tr>
							<td><%=userList.get(i).getUserId()%></td>
							<td><%=userList.get(i).getUsername()%></td>
							<td><%=userList.get(i).getPassword()%></td>
							<td><%=userList.get(i).getEmail()%></td>
							<td><%=userList.get(i).getImgpath()%></td>
						</tr>
						<%
							}
							} else {
						%>
						<td colspan="5" align="center">No Data Available</td>
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