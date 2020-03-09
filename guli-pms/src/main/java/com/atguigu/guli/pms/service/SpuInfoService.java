package com.atguigu.guli.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.guli.pms.entity.SpuInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu信息
 *
 * @author suxiaosu
 * @email sxs@atguigu.com
 * @date 2020-03-09 22:57:28
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

