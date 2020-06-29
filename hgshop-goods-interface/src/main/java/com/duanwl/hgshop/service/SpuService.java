package com.duanwl.hgshop.service;

import com.duanwl.hgshop.pojo.Spu;
import com.duanwl.hgshop.pojo.SpuVo;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: SpuService 
 * @Description: spu的管理
 * @author: 段文龙
 * @date: 2020年6月29日 下午7:40:48
 */
public interface SpuService {
	
	int add(Spu spu);
	int update(Spu spu);
	int delete(int[] ids);
	
	PageInfo<Spu> list(SpuVo spuvo);
	
	Spu getById(int id);
	

}
