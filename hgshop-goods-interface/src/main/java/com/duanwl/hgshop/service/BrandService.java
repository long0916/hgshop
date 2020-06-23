package com.duanwl.hgshop.service;

import java.util.List;

import com.duanwl.hgshop.pojo.Brand;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: BrandService 
 * @Description: 品牌管理
 * @author: 段文龙
 * @date: 2020年6月23日 下午6:47:43
 */
public interface BrandService {

	int add(Brand brand);
	
	int update(Brand brand);
	
	int delete(int[] ids);
	
	PageInfo<Brand> list(Brand brand);
	
	List<Brand> list();
	
	Brand getById(int id);
	
}
