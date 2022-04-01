package com.cybage.service;

import java.util.List;

import com.cybage.dao.ProductDaoImpl;
import com.cybage.model.Product;

public class ProductSerImpl implements ProductSer{
	ProductDaoImpl productDao=new ProductDaoImpl();
	
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return productDao.getProductById(productId);
	}

	public int addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.addProduct(product);
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDao.getAllProduct();
	}

	public int deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return productDao.deleteProduct(productId);
	}

}
