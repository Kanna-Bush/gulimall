package com.myproject.gulimall.member.dao;

import com.myproject.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author linkai
 * @email lk644606288@163.com
 * @date 2024-09-08 12:34:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
