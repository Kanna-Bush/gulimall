package com.myproject.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myproject.gulimall.common.utils.PageUtils;
import com.myproject.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author linkai
 * @email lk644606288@163.com
 * @date 2024-09-08 12:13:32
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

