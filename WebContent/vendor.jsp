<%@page import="java.util.ArrayList"%>
<%@page import="jobportal.model.Vendor"%>
<%@page import="java.util.List"%>
<jsp:include page="header.jsp"></jsp:include>

<body>

<div class="container" align="center" >
 	<div class="row">
 	  <form action="Vendor" method="post">
 	  <input type="hidden" name="userId" >
							<div class="form-group">
								<input  type="text" name="vendorname" class="form-control"  placeholder="enter vendor Name">
							</div>
							<div class="form-group">
								<input  type="text" name="vendorid" class="form-control"  placeholder="enter vendor Id">
							</div>
							<div class="form-group">
							   <input type="button" class="btn btn-info" value="Enter" onclick="location.href = './Vendor'">
							</div>
							
 	  
 	  </form>
 			<%
 			List<Vendor> vendors;
			if(request.getAttribute("vendors") != null){
		  	vendors = (List<Vendor>)request.getAttribute("vendors");
			} else {
			vendors=new ArrayList<Vendor>();
			}    
		%>
 	</div>
    </div>
</body>
</html>