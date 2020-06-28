package com.duanwl.hgshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @ClassName: MainController 
 * @Description: TODO
 * @author: 段文龙
 * @date: 2020年6月28日 下午6:46:58
 */

@Controller
public class MainController {
	
	@RequestMapping({"/","main","index"})
	public String main() {
		return "main";
	}
	
}
