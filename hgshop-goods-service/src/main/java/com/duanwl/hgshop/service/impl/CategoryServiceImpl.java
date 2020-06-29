package com.duanwl.hgshop.service.impl;

import java.util.List;


import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.duanwl.hgshop.dao.CategoryDao;
import com.duanwl.hgshop.pojo.Category;
import com.duanwl.hgshop.service.CategoryService;

/**
 * 
 * @ClassName: CategoryServiceImpl 
 * @Description: 分类管理的服务
 * @author: 段文龙
 * @date: 2020年6月29日 下午7:41:42
 */
@Service(interfaceClass = CategoryService.class)
public class CategoryServiceImpl  implements CategoryService {

	@Autowired
	CategoryDao catDao;
	
	@Override
	public int add(Category category) {
		// TODO Auto-generated method stub
		return catDao.add(category);
	}

	@Override
	public int udpate(Category category) {
		// TODO Auto-generated method stub
		return catDao.update(category);
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return catDao.delete(id);
	}

	@Override
	public  List<Category>  list(int parentId) {
		// TODO Auto-generated method stub
		return catDao.list(parentId);
	}

}
