package com.atguigu.guli.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.guli.pms.entity.SpuCommentEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品评价
 *
 * @author suxiaosu
 * @email sxs@atguigu.com
 * @date 2020-03-09 22:57:28
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageVo queryPage(QueryCondition params);
}

