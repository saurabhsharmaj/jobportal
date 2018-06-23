 <%@page import="com.bit.hostel.model.Leave"%>
<%@page import="java.util.*"%>
<div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Student</h1>
                </div>
               		<%
				List<Leave> userList = (List<Leave>) request.getAttribute("leaves");

				if (request.getAttribute("leaves") != null) {
					userList = (List<Leave>) request.getAttribute("leaves");
				} else {
					userList = new ArrayList<Leave>();
				}
			%>

			<div style="padding-top: 10px"></div>		
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Leave(s) applied</div>
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
												style="width: 71px;" aria-sort="ascending">Leave Id
												</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Browser: activate to sort column ascending"
												style="width: 91px;">Purpose</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending"
												style="width: 81px;">Remark</th>	
												<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Browser: activate to sort column ascending"
												style="width: 91px;">In-Time</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending"
												style="width: 81px;">Out-Time</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending"
												style="width: 81px;">Approved By</th>		
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending"
												style="width: 81px;">Status</th>
											<th class="sorting" tabindex="0"
												aria-controls="dataTables-example" rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending"
												style="width: 81px;">Update On</th>									
										</tr>
									</thead>
									<tbody>

						<%
							if (userList.size() > 0) {
								for (int i = 0; i < userList.size(); i++) {
						%>
						<tr>							
							<td><%=userList.get(i).getId()%></td>
							<td><%=userList.get(i).getPurpose()%></td>
							<td><%=userList.get(i).getRemark()%></td>
							<td><%=userList.get(i).getIntime()%></td>
							<td><%=userList.get(i).getOutTime()%></td>
							<td><%=userList.get(i).getApprovedBy().getUsername()==null?" - ":userList.get(i).getApprovedBy().getUsername()%></td>
							<td><%=userList.get(i).getStatus()%></td>
							<td><%=userList.get(i).getUpdatedOn()%></td>
						</tr>
						<%
							}
							} else {
						%>
						<td colspan="8" align="center">No Data Available</td>
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
            </div>
          
        </div>
        <!-- /#page-wrapper -->