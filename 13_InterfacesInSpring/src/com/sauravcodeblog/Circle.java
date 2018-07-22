package com.sauravcodeblog;

public class Circle implements Shape{
	
	public Point getCenter() {
		return center;
	}
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
