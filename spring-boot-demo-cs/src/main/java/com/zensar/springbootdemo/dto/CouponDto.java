package com.zensar.springbootdemo.dto;




public class CouponDto {

	private int couponId;
	private String couponCode;
	private String couponExpireDate;
	
	public CouponDto() {
		super();
	}
	
	public CouponDto(int couponId, String couponCode, String couponExpireDate) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.couponExpireDate = couponExpireDate;
	}
	
	public int getCouponId() {
		return couponId;
	}
	
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	
	public String getCouponCode() {
		return couponCode;
	}
	
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	
	public String getCouponExpireDate() {
		return couponExpireDate;
	}
	
	public void setCouponExpireDate(String couponExpireDate) {
		this.couponExpireDate = couponExpireDate;
	}
	
	@Override
	public String toString() {
		return "CouponDto [couponId=" + couponId + ", couponCode=" + couponCode + ", couponExpireDate="
				+ couponExpireDate + "]";
	}
	
	
	
}
