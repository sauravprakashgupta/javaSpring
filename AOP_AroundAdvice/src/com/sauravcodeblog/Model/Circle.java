package com.sauravcodeblog.Model;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("The Circle setter method is called");
		throw(new RuntimeException());
	}
}
