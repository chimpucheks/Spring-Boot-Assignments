package com.zensar.springbootdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity

/*
 * @NamedQueries(value= {@NamedQuery(name="Coupon.test1",
 * query="from Coupon s where s.couponCode=?1 and s.couponExpireDate=?2")})
 * 
 * @NamedNativeQuery(name = "Student.test", query =
 * "select *from coupon where  coupon_code=?1",resultClass=Coupon.class)
 */
public class Coupon {

	@Id
	private int couponId;
	private String couponCode;
	private String couponExpireDate;

	public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coupon(int couponId, String couponCode, String couponExpireDate) {
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
		return "Coupon [couponId=" + couponId + ", couponCode=" + couponCode + ", couponExpireDate=" + couponExpireDate
				+ "]";
	}

}
