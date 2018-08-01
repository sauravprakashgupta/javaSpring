package com.sauravcodeblog.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	//@Before("execution(public String com.sauravcodeblog.Model.Circle.getName())")
	//This executes only when the Circle Class getName method is called
	
//	 @Before("execution(public String get*(..))")
	// This executes only when any method has 'get' in their name. We have getName for both Circle and Triangle types
	// But instead of String return type if we use '*' wildcard then get*() method of ShapeService class is also called which has Circle and Triangle and return types.
	// So Basically you can use wildcard everywhere in method signature, method_name, return type, argument list, 
	// To specify wildcard in argument list in a method, we use '..' for 0 or more argument and '*' for 1 or more argument.
	
	// If you do not want to use PointCuts and perform the same task, just comment-on line 31 and below and comment-off line 13 and line 25. 
	@Before("allGetters()")
	public void LoggingAdvice() {
		System.out.println("Advice Run, Get method Call");
	}
	
//	@Before("execution(* get*(..))")
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
}
