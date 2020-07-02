package com.duanwl.hgshop.service;

import java.util.List;


import com.duanwl.hgshop.pojo.Cart;

/**
 * 
 * @ClassName: CartService 
 * @Description: 购物车服务
 * @author: 段文龙
 * @date: 2020年7月2日 下午4:55:21
 */
public interface CartService {
	
	int add(Cart cart);
	
	int delete(int[] ids);
	/**
	 * 
	 * @param uid 用户id
	 * @return
	 */
	List<Cart> list(int uid);
	
	List<Cart> ListByIds(int[] ids);

	/**
	 * 根据购物车id 生成订单
	 * @param cartIds
	 * @param uid
	 * @return
	 */
	int createOrder(int[] cartIds, String address ,Integer uid);
	
	
	

}
