package com.cybage.service;

import java.util.List;

import com.cybage.model.Product;

public interface ProductSer {

	Product getProductById(int productId);
	int addProduct(Product product);
	List<Product> getAllProduct();
	int deleteProduct(int productId);
}
