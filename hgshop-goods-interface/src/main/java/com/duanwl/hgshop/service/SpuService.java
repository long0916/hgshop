package com.duanwl.hgshop.service;

import com.duanwl.hgshop.pojo.Spu;
import com.duanwl.hgshop.pojo.SpuVo;
import com.github.pagehelper.PageInfo;

/**
 * spu的管理
 * @author 45466
 *
 */
public interface SpuService {
	
	int add(Spu spu);
	int update(Spu spu);
	int delete(int[] ids);
	
	PageInfo<Spu> list(SpuVo spuvo);
	
	Spu getById(int id);
	

}
