<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="model.bean.ProductBean" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product WebApp : View Products</title>
</head>

<body>
	<h1>View Details:</h1>
	<table border=1>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Category</th>
			<th>Quantity</th>
			<th>Price</th>
			<th>Image</th>
		</tr>
		<% List<ProductBean> dlist = (List<ProductBean>)request.getAttribute("data");
			try{
				for (ProductBean data:dlist) {
		%>	
		<tr>
			<td><%=data.getId() %></td>
			<td><%=data.getName() %></td>
			<td><%=data.getCategory()%></td>
			<td><%=data.getQty() %></td>
			<td><%=data.getPrice() %></td>
			<td><img src="images/<%=data.getImage() %>" width="150" height="100"></td>
		</tr>
		<%		}
			} catch(Exception e) {
				System.out.println("Error in listing the products!");
				e.printStackTrace();
			} %>
	</table>
</body>
</html>