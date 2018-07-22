package com.sauravcodeblog;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext ap = null;
	
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A = (" +getPointA().getX()+", " + getPointA().getY()+ " )");
		System.out.println("Point B = (" +getPointB().getX()+", " + getPointB().getY()+ " )");
		System.out.println("Point C = (" +getPointC().getX()+", " + getPointC().getY()+ " )");
		
		System.out.println("#######################################");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext _ap) throws BeansException {
		this.ap = _ap;
		Triangle t = (Triangle)ap.getBean("triangle");
		System.out.println("I m from setApplicationContext ");
		t.draw();
		System.out.println("Point C = (" +getPointC().getX()+", " + getPointC().getY()+ " )");
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		//Some code here
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("======================================");
		System.out.println("I am from setBeanName");
		System.out.println("Bean Name is " +beanName);
		System.out.println("======================================");
	}
}
