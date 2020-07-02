package com.duanwl.hgshop.service.impl;

import java.util.List;


import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.duanwl.hgshop.dao.CartDao;
import com.duanwl.hgshop.pojo.Cart;
import com.duanwl.hgshop.service.CartService;

/**
 * 
 * @ClassName: CartServiceImpl 
 * @Description: TODO
 * @author: 段文龙
 * @date: 2020年7月2日 上午10:29:44
 */
@Service(interfaceClass = CartService.class)
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartDao cartDao;
	
	@Override
	public int add(Cart cart) {
		// TODO Auto-generated method stub
		return cartDao.add(cart);
	}

	@Override
	public int delete(int[] ids) {
		// TODO Auto-generated method stub
		return cartDao.delete(ids);
	}

	@Override
	public List<Cart> list(int uid) {
		// TODO Auto-generated method stub
		return cartDao.list(uid);
	}

	@Override
	public List<Cart> ListByIds(int[] ids) {
		// TODO Auto-generated method stub
		return  cartDao.lists(ids);
	}

}
