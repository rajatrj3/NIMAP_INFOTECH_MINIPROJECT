package com.springrest.springrest.service;

import java.util.List;


import com.springrest.springrest.entities.Product;

public interface ProductService {
	
public List<Product> getProduct();

	
	public Product getProduct(long ProdId);
	
	public Product addProduct(Product product);


	public Product UpdateProduct(Product product);


	public void deleteProduct(long parseLong);

}
