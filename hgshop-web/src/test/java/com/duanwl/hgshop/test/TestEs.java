package com.duanwl.hgshop.test;

import org.apache.dubbo.config.annotation.Reference;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.duanwl.hgshop.controller.ElSearchUtil;
import com.duanwl.hgshop.pojo.EsSpu;
import com.duanwl.hgshop.pojo.Spu;
import com.duanwl.hgshop.pojo.SpuVo;
import com.duanwl.hgshop.service.SpuService;
import com.github.pagehelper.PageInfo;

@ContextConfiguration("classpath:test-consumer.xml")
@RunWith(SpringRunner.class)
public class TestEs {
	
	@Reference
	SpuService spuService;
	
	@Autowired
	ElSearchUtil<EsSpu> esUtil;
	
	@Test
	public void createIndex() {
		
		SpuVo spuVo = new SpuVo();
		
		spuVo.setPageSize(100);
		// 从数据库中获取数据
		PageInfo<Spu> pageInfo = spuService.list(spuVo);
		pageInfo.getList().forEach(spu->{
			//
			EsSpu esSpu = new EsSpu(spu);
			// 调用工具类保存到ES当中
			
			esUtil.saveObject(esSpu.getId().toString(), esSpu);
		});
		
	}

}
