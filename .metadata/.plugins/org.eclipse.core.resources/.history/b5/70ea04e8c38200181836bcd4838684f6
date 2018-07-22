package com.sauravcodeblog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		context.registerShutdownHook();
		
		Shape triangle = (Shape)context.getBean("triangle");
		triangle.draw();
		
		System.out.println("Drawing Circle");
		Shape circle = (Shape)context.getBean("circle");
		circle.draw();
	}
}