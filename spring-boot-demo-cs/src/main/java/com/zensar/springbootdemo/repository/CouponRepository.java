package com.zensar.springbootdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.springbootdemo.entity.Coupon;


public interface CouponRepository extends JpaRepository<Coupon,Integer> {
 
	@Query(value="select *from coupon where  coupon_code=:code",nativeQuery=true)
	List<Coupon>test(@Param("code")String couponCode);

	@Query("from Coupon s where s.couponCode=?1 and s.couponExpireDate=?2")
	List<Coupon> test1(@Param("code")String couponCode,@Param("expdate")String expdate);
	
	
	
	
}
