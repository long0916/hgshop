package com.duanwl.hgshop.dao;

import com.duanwl.hgshop.pojo.User;

public interface UserDao {

	User findUserById(Integer uid);

	int add(User user);

	User findUser(User user);

	User findByName(String name);

}
