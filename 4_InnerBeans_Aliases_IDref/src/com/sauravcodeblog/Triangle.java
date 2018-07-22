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
	Triangle(Point _pointA,Point _pointB,Point _pointC){
		this.pointA = _pointA;
		this.pointB = _pointB;
		this.pointC = _pointC;
	}
}
