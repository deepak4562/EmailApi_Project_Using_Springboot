<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send Email</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container ">
		<div class="row mt-5">
			<div class="col-md-6 offset-md-3">
			<h2>Send Email </h2>
			<form action="myform" method="post">
			<input type="email" name="to" placeholder="to:" class="form-control" id="exampleInputEmail1"  ><br>
			<input type="text" name="subject" placeholder="Subject:" class="form-control" ><br>
			<input type="text" name="body" placeholder="Body:" class="form-control" ><br>
			
			<input type="submit" value="Send" class="btn btn-primary">
			</form>
			
			</div>
			</div>
			</div>

</body>
</html>