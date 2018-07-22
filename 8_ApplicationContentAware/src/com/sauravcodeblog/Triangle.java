package com.sauravcodeblog;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	
	public void draw() {
		System.out.println("Triangle Drawn with points -"+ 
				"("+pointA.getX() +','+pointA.getY()+")"+
				"("+pointB.getX() +','+pointB.getY()+")"+
				"("+pointC.getX() +','+pointC.getY()+")"
				);
	}
	Triangle(Point _pointA,Point _pointB,Point _pointC){
		this.pointA = _pointA;
		this.pointB = _pointB;
		this.pointC = _pointC;
	}
	@Override
	public void setApplicationContext(ApplicationContext _context) throws BeansException {
		// TODO Auto-generated method stub
		this.context = _context;
	}
	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("Bean name is "+beanName);
	}
}
