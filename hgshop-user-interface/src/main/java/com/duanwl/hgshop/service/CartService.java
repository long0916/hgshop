package com.duanwl.hgshop.service;

import java.util.List;


import com.duanwl.hgshop.pojo.Cart;

/**
 * 
 * @ClassName: CartService 
 * @Description: 购物车服务
 * @author: 段文龙
 * @date: 2020年7月2日 上午10:27:19
 */
public interface CartService {
	
	int add(Cart cart);
	
	int delete(int[] ids);
	//uid
	List<Cart> list(int uid);
	
	List<Cart> ListByIds(int[] ids);
	
	
	

}
