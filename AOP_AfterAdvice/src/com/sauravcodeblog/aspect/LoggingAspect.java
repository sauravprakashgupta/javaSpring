package com.sauravcodeblog.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.sauravcodeblog.Model.Circle;

@Aspect
public class LoggingAspect {
	
//	@After("args(name)")
//	public void stringArgumentMethods(String name) {
//		System.out.println("A method that takes String argument is called " +name);
//	}
	
//	@AfterReturning("args(name)")
	@AfterReturning(pointcut="args(name)",returning="returningString")
	public void stringArgumentMethods(String name, String returningString) {
		System.out.println("A method that takes String argument is called " +name +"\nThe output value is "+returningString);
	}
	//Now suppose you want to make this more generic for Any method which can return any type of output. What you can do is replace String return type with Object return type in 'String returningString' 
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void exceptionAdvice(String name, RuntimeException ex) {
		System.out.println("An exception has been thrown");
		System.out.println("the thrown exception is "+ex);
	}
}