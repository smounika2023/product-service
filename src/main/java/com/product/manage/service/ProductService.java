package com.product.manage.service;

import com.product.manage.model.ProductModel;

public interface ProductService {
	
	public void createProduct(ProductModel productModel);

	public void updateProduct(ProductModel productModel);

	public void deleteByProductId(int ProductId);

	public ProductModel findByProductId(int ProductId);

}
