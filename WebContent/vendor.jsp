<jsp:include page="header.jsp"></jsp:include>
<body>

<div class="container" align="center" >
 	<div class="row">
 	  <form action="Vendor" method="post">
 	  <input type="hidden" name="userId" >
							<div class="form-group">
								<input  type="text" name="vendorname" class="form-control"  placeholder="enter vendorname">
							</div>
							<div class="form-group">
								<input  type="text" name="vendorid" class="form-control"  placeholder="enter vendorid">
							</div>
							<div class="form-group">
							   <input type="button" class="btn btn-info" value="Enter" onclick="location.href = 'http://localhost:8080/jobportal/VendorServelet'">
							</div>
							
 	  
 	  </form>
 	</div>
    </div>
</body>
</html>