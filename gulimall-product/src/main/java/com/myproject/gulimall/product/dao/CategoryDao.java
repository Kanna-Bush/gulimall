package com.myproject.gulimall.product.dao;

import com.myproject.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author linkai
 * @email lk644606288@163.com
 * @date 2024-09-05 17:32:57
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
