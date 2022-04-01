package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Product;
import com.cybage.utility.JDBCUtility;

public class ProductDaoImpl implements ProductDao {

	public Product getProductById(int productId) {
		Product product=null;
		
		try
		{
			Connection con=JDBCUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from productmanagemnet where id = ?");
			ps.setInt(1, productId);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				product = new Product(rs.getInt("id"),rs.getString("productName"),rs.getDouble("productPrice"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return product;
	}

	public int addProduct(Product product) {
		// TODO Auto-generated method stub
		int status=0;
		try
		{
			Connection con=JDBCUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into productmanagement values(?,?,?)");
			ps.setInt(1, product.getId());
			ps.setString(2, product.getProductName());
			ps.setDouble(3, product.getProductPrice());
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
	}

	public List<Product> getAllProduct() {
		List<Product> productList=new ArrayList<Product>();
		try
		{
			Connection con=JDBCUtility.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from productmanagement");
			
			while(rs.next())
			{
				Product product = new Product(rs.getInt("id"),rs.getString("productName"),rs.getDouble("productPrice"));
				productList.add(product);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return productList;
	}

	public int deleteProduct(int productId) {
		// TODO Auto-generated method stub
		int status=0;
		try
		{
			Connection con=JDBCUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from productmanagement where id=?");
			ps.setInt(1, productId);
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
