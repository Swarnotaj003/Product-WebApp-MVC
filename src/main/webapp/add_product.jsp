<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product WebApp : Add Product</title>
</head>
<body>
<h1>Add Product :</h1>
<%
    if(request.getParameter("addStatus") != null && request.getParameter("addStatus").equals("success")) {
%>
        <h3>Product added successfully!</h3>
<%
    }
%>
<form action = "ProductController" method="post">
	<label>Product Id:</label>
	<input type="text" name="pid"><br>
	<label>Product Name:</label>
	<input type="text" name="pname"><br>
	<label>Product Category:</label>
	<input type="text" name="pcategory"><br>
	<label>Product Quantity:</label>
	<input type="number" name="pqty"><br>
	<label>Product Price:</label>
	<input type="number" step = "0.5" name="pprice"><br>
	<label>Product Image:</label>
	<input type="file" name="pimage"><br>
	<input type="submit" value="Add Product">
	<input type="reset" value="Clear">
</form>
</body>
</html>