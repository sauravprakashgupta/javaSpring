package com.sauravcodeblog;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

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
//		System.out.println("Point is ("+center.getX()+","+center.getY()+")");
		System.out.println(this.messageSource.getMessage("circle.point", new Object[]{center.getX(), center.getY()}, "myDefault Points", null));

		String mesg = this.messageSource.getMessage("circleClass.example",null,"Default Message here",null);
		System.out.println(mesg);
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
