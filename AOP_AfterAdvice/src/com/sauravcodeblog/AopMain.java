package com.sauravcodeblog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sauravcodeblog.ShapeService.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shape = ctx.getBean("shapeService", ShapeService.class);
		shape.getCircle().setName("Stupid Name");
//		shape.getCircle().setNameAndReturn("Stupid Name");
	}
}
