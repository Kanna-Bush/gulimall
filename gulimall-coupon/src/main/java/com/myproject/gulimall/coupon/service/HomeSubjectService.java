package com.myproject.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myproject.gulimall.common.utils.PageUtils;
import com.myproject.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author linkai
 * @email lk644606288@163.com
 * @date 2024-09-08 12:13:31
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

