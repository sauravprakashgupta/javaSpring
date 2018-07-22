package com.sauravcodeblog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Triangle triangle = (Triangle) context.getBean("myTriangleAlias");
		triangle.draw();
	}
}
