package com.duanwl.hgshop.dao;

import java.util.List;


import com.duanwl.hgshop.pojo.Spu;
import com.duanwl.hgshop.pojo.SpuVo;

/**
 * 
 * @author 45466
 *
 */
public interface SpuDao {

	int add(Spu spu);

	int update(Spu spu);

	int delete(int[] ids);

	List<Spu> list(SpuVo spuvo);

	Spu findById(int id);

}
