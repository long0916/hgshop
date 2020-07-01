package com.duanwl.hgshop;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @ClassName: StartUserService 
 * @Description: 启动服务
 * @author: 段文龙
 * @date: 2020年6月30日 下午5:47:47
 */
public class StartUserService {
	
	public static void main(String[] args) throws IOException {
		System.out.println("启动用户服务");
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-dubbo-provider.xml",
				"classpath:applicationContext-dao.xml");
		System.out.println("启动用户完成，可以开始调用服务");
		// 进行阻塞
		System.in.read();
		
	}

}
