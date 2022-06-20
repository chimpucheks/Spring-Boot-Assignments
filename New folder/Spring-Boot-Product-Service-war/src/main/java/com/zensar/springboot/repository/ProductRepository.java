package com.zensar.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

	

	@Query(value="select *from product where  product_name=:name",nativeQuery=true)
	List<Product>test(@Param("name")String productName);

	@Query("from Product s where s.productName=?1 and s.productPrice=?2")
	List<Product> test1(@Param("name")String productName,@Param("price")int price);
	
}
