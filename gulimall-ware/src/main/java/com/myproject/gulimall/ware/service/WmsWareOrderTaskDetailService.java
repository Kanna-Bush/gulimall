package com.myproject.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myproject.gulimall.common.utils.PageUtils;
import com.myproject.gulimall.ware.entity.WmsWareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author linkai
 * @email lk644606288@163.com
 * @date 2024-09-08 13:10:05
 */
public interface WmsWareOrderTaskDetailService extends IService<WmsWareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

