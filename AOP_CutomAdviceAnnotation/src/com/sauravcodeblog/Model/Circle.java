package com.sauravcodeblog.Model;

import com.sauravcodeblog.aspect.Loggable;

public class Circle {
	private String name;

	@Loggable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("The Circle setter method is called");
		throw(new RuntimeException());
	}
}
