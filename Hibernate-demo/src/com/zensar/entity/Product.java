package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product 
{
	@Id               //making productId as primary key
	private int productId;
	private String productName;
	private int productCost;
	public Product() {
		super();
	}
	public Product(int productId, String productName, int productCost) {
		super();
		this.productId =productId;
		this.productName =productName;
		this.productCost =productCost;
		
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
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	
		@Override
		public String toString() {
			return "product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost +"]";
		}
	
	
}

