package com.duanwl.hgshop.dao;

import java.util.List;


import com.duanwl.hgshop.pojo.Category;
/**
 * 
 * @ClassName: CategoryDao 
 * @Description: TODO
 * @author: 段文龙
 * @date: 2020年6月28日 下午6:46:26
 */
public interface CategoryDao {

	int add(Category category);

	int update(Category category);

	int delete(int id);

	 List<Category>  list(int parentId);

}
