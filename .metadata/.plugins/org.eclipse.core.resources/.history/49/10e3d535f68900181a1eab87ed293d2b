package com.sauravcodeblog;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape{
	
	public Point getCenter() {
		return center;
	}
	
	@Resource(name="pointB")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	private Point center;
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
		System.out.println("Point is ("+center.getX()+","+center.getY()+")");
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Circle init function called");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Circle destroy function called");
	}
	

}
