package com.duanwl.hgshop.dao;

import java.util.List;

import com.duanwl.hgshop.pojo.Brand;




public interface BrandDao {

	List<Brand> queryAll();

	Brand findById(int id);

}
