package com.zensar.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity



/*
 * @NamedQueries(value= {@NamedQuery(name="Product.test1",
 * query="from Product s where s.productName=?1 and s.productPrice=?2")})
 * 
 * @NamedNativeQuery(name = "Product.test", query =
 * "select *from product where  product_name=?1",resultClass=Product.class)
 * 
 */
public class Product 
{
	@Id
	private int productId;
	private String productName;
	private int productPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}


	

}
