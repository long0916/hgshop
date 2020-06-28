package com.duanwl.hgshop.dao;

import java.util.List;


import com.duanwl.hgshop.pojo.Brand;
/**
 * 
 * @ClassName: BrandDao 
 * @Description: TODO
 * @author: 段文龙
 * @date: 2020年6月28日 下午6:46:22
 */
public interface BrandDao {

	List<Brand> queryAll();

	Brand findById(int id);

}
