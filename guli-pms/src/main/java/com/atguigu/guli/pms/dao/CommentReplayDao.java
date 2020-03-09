package com.atguigu.guli.pms.dao;

import com.atguigu.guli.pms.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author suxiaosu
 * @email sxs@atguigu.com
 * @date 2020-03-09 22:57:28
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
