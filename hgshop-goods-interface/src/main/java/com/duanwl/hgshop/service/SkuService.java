package com.duanwl.hgshop.service;

import com.duanwl.hgshop.pojo.Sku;

import com.duanwl.hgshop.pojo.SkuVo;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: SkuService 
 * @Description: sku的管理
 * @author: 段文龙
 * @date: 2020年6月29日 下午7:40:37
 */
public interface SkuService {
	
	int add(Sku sku);
	int update(Sku sku);
	int delete(int[] ids);
	
	PageInfo<Sku> list(SkuVo skuvo);
	
	Sku getById(int id);
	

}
