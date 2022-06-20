package com.zensar.springboot.service;

import java.util.List;

import com.zensar.springboot.dto.ProductDto;

public interface ProductService {
	public ProductDto getProduct(int productId);

	public List<ProductDto> getAllProducts(int pageNumber, int pageSize);

	public ProductDto insertProduct(ProductDto productDto);

	public void updateProduct(int productId, ProductDto product);

	public void deleteProduct(int productId);

	List<ProductDto> getByProductName(String productName);

	List<ProductDto> findByProductNameAndProductPrice(String productName, int price);

}
