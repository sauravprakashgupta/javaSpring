package com.sauravcodeblog;

import java.util.Iterator;
import java.util.List;

public class Triangle {
	private List<Point> points;
	
	public void draw() {
		for (Point point : points) {
			System.out.println("Points is (" + point.getX() +","+point.getY()+")");
		}
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
}
