package com.sauravcodeblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{
	
	public Point getCenter() {
		return center;
	}
	
	@Autowired
//	@Qualifier("circleRelated")
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

}
