package com.duanwl.hgshop.controller;

import java.util.Date;


import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.aggregation.AggregatedPage;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.duanwl.hgshop.pojo.Category;
import com.duanwl.hgshop.pojo.EsSpu;
import com.duanwl.hgshop.pojo.Sku;
import com.duanwl.hgshop.pojo.Spu;
import com.duanwl.hgshop.pojo.SpuVo;
import com.duanwl.hgshop.service.CategoryService;
import com.duanwl.hgshop.service.SkuService;
import com.duanwl.hgshop.service.SpuService;
import com.github.pagehelper.PageInfo;

/**
 * 首页相关
 * @author 45466
 *
 */
@Controller

public class IndexController {
	
	
	@Reference
	SpuService spuService;
	
	@Reference
	SkuService skuService;
	
	@Reference
	CategoryService catService;
	
	
	@Autowired
	ElSearchUtil<EsSpu> esUtil;
	
	// duiredist 进行操练做
	@Autowired
	RedisTemplate<String, PageInfo<Spu>> redisTemplate;
	
	
	@RequestMapping({"/","index"})
	public String index(HttpServletRequest request,SpuVo spuVo) {
	
		JSON.toJSONString(spuVo);
		
		
		spuVo.setPageSize(12);
		request.setAttribute("spuVo", spuVo);
		
		System.out.println("");
		
		// 高频度访问 需要使用缓存
		if(spuVo.getPageNum()==1 && spuVo.getCategoryId()==0 ) {
			
			// 判断缓存中是否存在
			Boolean hasKey = redisTemplate.hasKey("firstPage");
			ValueOperations<String, PageInfo<Spu>> opsForVal = redisTemplate.opsForValue();
			if(hasKey) {
				PageInfo<Spu> pageInfo = opsForVal.get("firstPage");
				request.setAttribute("pageInfo", pageInfo);
				return "index";
			}else {
				// 缓存中不存在，去数据库当中获取
				PageInfo<Spu> pageInfo = spuService.list(spuVo);
				//
				opsForVal.set("firstPage", pageInfo, 3000,TimeUnit.SECONDS);
				request.setAttribute("pageInfo", pageInfo);
				return "index";
			}
			//低频 还是使用传统的方式
		}else {
			
			PageInfo<Spu> pageInfo = spuService.list(spuVo);
			request.setAttribute("pageInfo", pageInfo);
			return "index";
		}
		
	}
	
	@RequestMapping("spu")
	public String spuDetail(HttpServletRequest request,int spuId) {
		
		// 获取spu 的信息
		Spu spu = spuService.getById(spuId);
		// 获取sku的列表
		List<Sku> skuList = skuService.listDetailBySpu(spuId);
		System.out.println("spu is " + spu);
		System.out.println("sku is " + skuList);
		request.setAttribute("spu", spu);
		request.setAttribute("skuList", skuList);
		return "spudetail";
	}
	
	@RequestMapping("catData")
	@ResponseBody
	public List<Category> getData(){
		// 获取到所有分类的数据
		 List<Category> categories = catService.list(0);
		 return categories;
		
	}
	
	
	@RequestMapping("query")
	public String query(HttpServletRequest request,SpuVo spuVo ) {
		
		Date startTime = new Date();
		
		
		AggregatedPage<EsSpu> page = esUtil.queryObjects(EsSpu.class, spuVo.getPageNum(), spuVo.getPageSize(), 
				new String[] {"goodsName","caption","categoryName","brandName"}, spuVo.getKey());
		
		request.setAttribute("page", page);
		request.setAttribute("spuVo", spuVo);
		Date endTime = new Date();
		long consumerTime  = endTime.getTime() - startTime.getTime();
		
		request.setAttribute("consumerTime", consumerTime);
		
		return "query";
	}

}
