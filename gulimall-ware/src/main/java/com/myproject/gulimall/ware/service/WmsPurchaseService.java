package com.myproject.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myproject.gulimall.common.utils.PageUtils;
import com.myproject.gulimall.ware.entity.WmsPurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author linkai
 * @email lk644606288@163.com
 * @date 2024-09-08 13:10:05
 */
public interface WmsPurchaseService extends IService<WmsPurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

