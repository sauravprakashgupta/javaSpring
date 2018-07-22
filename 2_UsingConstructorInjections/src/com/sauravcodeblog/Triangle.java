package com.sauravcodeblog;

public class Triangle {
	private String type;
	public void draw() {
		System.out.println(this.type + " Triangle Drawn");
	}
	Triangle(String _type){
		this.type = _type;
	}
}
