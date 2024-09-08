package com.myproject.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myproject.gulimall.common.utils.PageUtils;
import com.myproject.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author linkai
 * @email lk644606288@163.com
 * @date 2024-09-05 17:32:57
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

