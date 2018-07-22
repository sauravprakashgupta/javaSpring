package com.sauravcodeblog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Shape shape1 = (Shape) context.getBean("triangle");
		Shape shape2 = (Shape) context.getBean("circle");
		shape1.draw();
		shape2.draw();
	}
}
 