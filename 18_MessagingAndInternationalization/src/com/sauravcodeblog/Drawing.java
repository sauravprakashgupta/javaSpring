package com.sauravcodeblog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.registerShutdownHook();
		Shape shape1 = (Shape) context.getBean("triangle");
		Shape shape2 = (Shape) context.getBean("circle");
		shape1.draw();
		shape2.draw();
		String mesg = context.getMessage("drawingClass.example",null,"Default Message here",null);
		System.out.println(mesg);				
	}
}
 