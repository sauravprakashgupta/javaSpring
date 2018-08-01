package com.sauravcodeblog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sauravcodeblog.ShapeService.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//		ShapeService shape = (ShapeService) ctx.getBean("shapeService");
		ShapeService shape = ctx.getBean("shapeService", ShapeService.class);
		//same as above, either user type casting or mention it in over loaded method
		System.out.println(shape.getCircle().getName());
	

	}

}
