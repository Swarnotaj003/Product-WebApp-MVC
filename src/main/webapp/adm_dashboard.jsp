<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product WebApp : Dashboard</title>
<meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width" />
    <link rel="stylesheet" href="css/adm_nav.css" />
    <style>
		.card {
		  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
		  transition: 0.3s;
		  width: 40%;
		  display: inline-block;
		}
		
		.card:hover {
		  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
		}
		
		.container {
		  padding: 2px 16px;
		}
	</style>
</head>
<body>
 
  <div class="nav">
  <input type="checkbox" id="nav-check">
  <div class="nav-header">
    <div class="nav-title">
      Dashboard
    </div>
  </div>
  <div class="nav-btn">
    <label for="nav-check">
      <span></span>
      <span></span>
      <span></span>
    </label>
  </div>

  <div class="nav-links">
    <a href="#" target="_self">Home</a>
    <a href="admin_login.jsp" target="_self">Logout</a>
  </div>
</div>


<div class="card">

  <img src="images/add_logo.jpg" alt="Avatar" style="width:100%">
  <div class="container">
  <a href="add_product.jsp">
    <b>Add Item</b> 
   </a>
  </div>
</div>

<div class="card">

  <img src="images/view_logo.jpg" alt="Avatar" style="width:100%">
  <div class="container">
  <a href="ProdViewController">
    <b>View Item</b>
   </a>
  </div>
  </div>

</body>
</html>