package com.myproject.gulimall.coupon.dao;

import com.myproject.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author linkai
 * @email lk644606288@163.com
 * @date 2024-09-08 12:13:32
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
