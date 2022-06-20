package com.zensar.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.zensar.springboot.dto.ProductDto;
import com.zensar.springboot.entity.Product;
import com.zensar.springboot.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@Override
	public ProductDto getProduct(int productId) {
		Product product = productRepository.findById(productId).get();

		// ProductDto dto=mapToDto(product);
		return modelMapper.map(product, ProductDto.class);
	}

	@Override
	public List<ProductDto> getAllProducts(int pageNumber, int pageSize)
	{
		//List<Product> listOfProducts = productRepository.findAll();
		
		List<ProductDto> listOfProductDto = new ArrayList<ProductDto>();

		Page<Product> findAll = productRepository
				.findAll(PageRequest.of(pageNumber, pageSize, Sort.by(Direction.DESC, "productName")));

		// Page<Product> findAll = productRepository.findAll(PageRequest.of(pageNumber,
		// pageSize,Sort.by(Direction.ASC,"productName")));

		List<Product> content = findAll.getContent();

		for (Product product : content) {
			// listOfProductDto.add(mapToDto(product));
			listOfProductDto.add(modelMapper.map(product, ProductDto.class));

		}
		return listOfProductDto;
	}

	@Override
	public ProductDto insertProduct(ProductDto productDto) {
		// Product product=mapToEntity(productDto);
		Product product = modelMapper.map(productDto, Product.class);
		Product insertProduct = productRepository.save(product);
		// ProductDto mapToDto=mapToDto(insertProduct);
		return modelMapper.map(insertProduct, ProductDto.class);

	}

	@Override
	public void updateProduct(int productId, ProductDto productDto) {
		// Product product=mapToEntity(productDto);

				Product product = modelMapper.map(productDto, Product.class);
				productRepository.save(product);
		
	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);
		
	}

	@Override
	public List<ProductDto> getByProductName(String productName) {
		List<ProductDto> productDtos = new ArrayList<>();
		List<Product> products = productRepository.test(productName);
		for (Product product : products)
			productDtos.add(modelMapper.map(product, ProductDto.class));
		return productDtos;
	}

	@Override
	public List<ProductDto> findByProductNameAndProductPrice(String productName, int price) {
		List<ProductDto> productDtos = new ArrayList<>();
		List<Product> products = productRepository.test1(productName, price);
		for (Product product : products)
			productDtos.add(modelMapper.map(product, ProductDto.class));
		return productDtos;
	}
	/*
	 * public ProductDto mapToDto(Product product) { ProductDto dto = new
	 * ProductDto(); dto.setProductId(product.getProductId());
	 * dto.setProductName(product.getProductName());
	 * dto.setProductPrice(product.getProductPrice()); return dto; }
	 * 
	 * public Product mapToEntity(ProductDto productDto) { Product product=new
	 * Product(); product.setProductId(productDto.getProductId());
	 * product.setProductName(studentDto.getProductName());
	 * product.setProductPrice(studentDto.getProductPrice()); return product; }
	 */
}
