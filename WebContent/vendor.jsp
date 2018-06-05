<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container" align="center">
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
							   <button type="button" class="btn btn-primary" >Enter</button>
							</div>
							
 	  
 	  </form>
 	</div>
    </div>
</body>
</html>