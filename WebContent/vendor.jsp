<%@page import="java.util.ArrayList"%>
<%@page import="jobportal.model.Vendor"%>
<%@page import="java.util.List"%>
<jsp:include page="header.jsp"></jsp:include>

<body>

<div class="container">
 	<div class="row">
 	
	 	<div class="offset-lg-4  col-lg-4" >
		 	  <form action="Vendor" method="post">
		 	  <input type="hidden" name="userId" >
									<div class="form-group">
										<input  type="text" name="Vendorname" class="form-control"  placeholder="enter vendor Name">
									</div>
									<div class="form-group">
										<input  type="text" name="Vendorid" class="form-control"  placeholder="enter vendor Id">
									</div>
									<div class="form-group" style="text-align: center;">
									  <input type="submit">
									</div>
									
		 	  
		 	  </form>
	 			
	 			<%
	 			List<Vendor> vendors = new ArrayList<Vendor>();
				if(request.getAttribute("vendors") != null){
					vendors = (List<Vendor>)request.getAttribute("vendors");
				}   
			%>
	 	</div>
 	</div>
 	<div class="offset-lg-4  col-lg-4" >
 		<table class="table-striped">
			<tr>
			<th>Vendorid</th>
			<th>Vendorname</th>
			
			<th>email</th>
			<th>Action</th>
			</tr>
			
			<%
			if(request.getAttribute("vendors") != null){
			   
				for(int i=0; i < vendors.size(); i++){
			%>
				<tr>
					<td><%=vendors.get(i).getVendorid() %></td>
					<td><%=vendors.get(i).getVendorname() %></td>
					
					<td>-</td>
					<td><a href="./VendorAction?action=delete&Vendorid=<%=vendors.get(i).getVendorid() %>">
							<img src="./images/delete.png">
						</a>
						<a href="./VendorAction?action=edit&Vendorid=<%=vendors.get(i).getVendorid() %>">
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