package com.atguigu.guli.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.guli.pms.entity.SpuInfoDescEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu信息介绍
 *
 * @author suxiaosu
 * @email sxs@atguigu.com
 * @date 2020-03-09 22:57:28
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageVo queryPage(QueryCondition params);
}

