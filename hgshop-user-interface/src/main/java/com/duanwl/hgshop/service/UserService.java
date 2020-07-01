package com.duanwl.hgshop.service;

import com.duanwl.hgshop.pojo.User;

/**
 * 
 * @ClassName: UserService 
 * @Description: TODO
 * @author: 段文龙
 * @date: 2020年6月30日 下午8:32:48
 */
public interface UserService {
	
	// 注册
	User register(User user);
	
	// 登录
	User login(User user);
	
	// 根据用户名查找用户是否存在，  注册时候的唯一性验证使用
	User getUserByName(String name);

}
