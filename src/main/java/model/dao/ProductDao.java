package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import misc.ConnectionProvider;
import model.bean.ProductBean;

public class ProductDao {
	Connection con;
	PreparedStatement pstm;
	
	public int insert(ProductBean pbean)
	{
		String id=pbean.getId();
		String name=pbean.getName();
		String category=pbean.getCategory();
		int qty=pbean.getQty();
		double price=pbean.getPrice();
		String image=pbean.getImage();
		
		con = ConnectionProvider.createCon();
//		System.out.println(con);
		int i = 0;
		try {
			pstm=con.prepareStatement("insert into product values(?,?,?,?,?,?)");
			pstm.setString(1, id);
			pstm.setString(2, name);
			pstm.setString(3, category);
			pstm.setInt(4,qty);
			pstm.setDouble(5, price);
			pstm.setString(6, image);
			i = pstm.executeUpdate();
		} catch(Exception e) {
			System.out.println("Error in inserting the data!");
		}
		return i;
	}
	
}

