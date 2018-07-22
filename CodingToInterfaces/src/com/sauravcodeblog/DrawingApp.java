package com.sauravcodeblog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
//		System.out.println("I m from Drawing Class");
		triangle.draw();
	}
}