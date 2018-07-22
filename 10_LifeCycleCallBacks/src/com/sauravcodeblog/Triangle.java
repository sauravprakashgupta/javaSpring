package com.sauravcodeblog;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{
//public class Triangle{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public void draw() {
		System.out.println("Triangle Drawn with points -"+ 
				"("+pointA.getX() +','+pointA.getY()+")"+
				"("+pointB.getX() +','+pointB.getY()+")"+
				"("+pointC.getX() +','+pointC.getY()+")"
				);
	}
	
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
	
	
//METHOD1
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean init method called for triangle");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean destroy method called for triangle");
		
	}
	
	
//	METHOD2
	public void myInit() {
		System.out.println("my custom init method called for triangle");
	}
	
	public void myDestroy() {
		System.out.println("my custom destroy method called for triangle");
	}
}
