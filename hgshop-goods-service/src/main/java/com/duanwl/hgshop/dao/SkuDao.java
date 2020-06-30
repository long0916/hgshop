package com.duanwl.hgshop.dao;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import com.duanwl.hgshop.pojo.Sku;
import com.duanwl.hgshop.pojo.SkuVo;
import com.duanwl.hgshop.pojo.SpecOption;

/**
 * sku 的curd
 * @author 45466
 *
 */
public interface SkuDao {

	int insert(Sku sku);
	int insertSpecOption(@Param("skuId")  int id, @Param("opt") SpecOption specOption);
	

	int delete(int[] ids);
	int deleteSpecOption(int ...id);

	int update(Sku sku);	

	// 获取详情进行回显
	Sku findById(int id);
	List<Sku> list(SkuVo skuvo);



	

}
