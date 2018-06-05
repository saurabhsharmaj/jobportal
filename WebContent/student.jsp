<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Portal</title>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<body>
<div class="row" align="center"> <div class="col-lg-12"><h1>Student Registration Portal</h1></div></div>
<form action="StudentReg" method="post">
<div class="row container">
<div class="col-lg-6">
<div class="form-group"><input type="text" name="FName" class="form-control" placeholder="Enter First Name"></div>
<div class="form-group"><input type="text" name="LName" class="form-control" placeholder="Enter Last Name"></div>
<div  class="form-group"><input type="text" name="Email" class="form-control" placeholder="Enter Your Email"></div>
<div class="form-group"><input type="text" name="Student Contact No" class="form-control" placeholder="Enter Your Contact Number"></div>
</div>
<div class="col-lg-6">
<div class="form-group"><input type="text" name="Father's Name" class="form-control" placeholder="Enter Father's Name"></div>
<div class="form-group"><input type="text" name="Father's Contact No" class="form-control" placeholder="Enter Father's Contact No"></div>
</div>
<div class="col-lg-6">
<div class="form-group"><input type="text" name="Mother's Name" class="form-control" placeholder="Enter Mother's Name"></div>
<div class="form-group"><input type="text" name="Mother's Contact No" class="form-control" placeholder="Enter Mother's Contact No"></div>
</div>
<div class="form-group row">
<div class="col-lg-2">Gender :</div>
<div class="form-group"><input type="radio" name="Gender" checked="checked">Male</div>
<div class="form-group"><input type="radio" name="Gender" checked="checked">Female</div>
</div>

</form>

</body>
</html>