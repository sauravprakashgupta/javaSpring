package com.sauravcodeblog;

public class Triangle {
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
	
//	Triangle(Point _pointA,Point _pointB,Point _pointC){
//		this.pointA = _pointA;
//		this.pointB = _pointB;
//		this.pointC = _pointC;
//	}
//	NOTE: to autowire using the constructor we need to use the 'autowire = "constructor"' must be specified in bean definition.

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
	
}