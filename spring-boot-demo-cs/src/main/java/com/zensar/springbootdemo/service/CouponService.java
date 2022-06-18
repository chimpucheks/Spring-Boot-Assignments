package com.zensar.springbootdemo.service;

import java.util.List;

import com.zensar.springbootdemo.dto.CouponDto;
import com.zensar.springbootdemo.entity.Coupon;

public interface CouponService {

	public CouponDto getCoupon(int couponId);

	public List<CouponDto> getAllCoupons(int pageNumber, int pageSize);

	public CouponDto insertCoupon(CouponDto couponDto);

	public void updateCoupon(int couponId, CouponDto coupon);

	public void deleteCoupon(int couponId);

	
	List<CouponDto> getByCouponCode(String couponCode);
	
	List<CouponDto> findByCouponCodeAndCouponExpireDate(String couponCode, String expdate);
	
	
	
}
