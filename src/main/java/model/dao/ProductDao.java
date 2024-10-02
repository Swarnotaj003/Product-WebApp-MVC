package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import misc.ConnectionProvider;
import model.bean.ProductBean;

public class ProductDao {
	Connection con = ConnectionProvider.createCon();
	PreparedStatement pstm;
	ResultSet rs;
	
	public int insert(ProductBean pbean) {
		String id = pbean.getId();
		String name = pbean.getName();
		String category = pbean.getCategory();
		int qty = pbean.getQty();
		double price = pbean.getPrice();
		String image = pbean.getImage();		

		int i = 0;
		try {
			pstm = con.prepareStatement("INSERT INTO product VALUES(?,?,?,?,?,?)");
			pstm.setString(1, id);
			pstm.setString(2, name);
			pstm.setString(3, category);
			pstm.setInt(4, qty);
			pstm.setDouble(5, price);
			pstm.setString(6, image);
			i = pstm.executeUpdate();
		} catch(Exception e) {
			System.out.println("Error in inserting the data!");
		}
		return i;
	}
	
	public List<ProductBean> getAllData() {
		String id = null;
		String name = null;
		String category = null;
		int qty = 0;
		double price = 0;
		String image = null;
		
		List<ProductBean> plist = new ArrayList<>();
		try {
			pstm = con.prepareStatement("SELECT * FROM product");
			rs = pstm.executeQuery();
			while (rs.next()) {
				id = rs.getString(1);
				name = rs.getString(2);
				category = rs.getString(3);
				qty = rs.getInt(4);
				price = rs.getDouble(5);
				image = rs.getString(6);
				ProductBean pb = new ProductBean(id, name, category, qty, price, image);
				plist.add(pb);
			}
		} catch (Exception e) {
			System.out.println("Error in fetching products!");
			e.printStackTrace();
		}
		return plist;
	}
}
