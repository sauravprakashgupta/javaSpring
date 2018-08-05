package com.sauravcodeblog.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.sauravcodeblog.Model.Circle;

@Aspect
public class LoggingAspect {
	
	@Before("allCircleMethods")
//	this will cause all methods in Circle class (getter/setter/etc) to be executed
	public void LoggingAdvice(JoinPoint joinPoint) {
//		System.out.println(joinPoint.toString());
		System.out.println(joinPoint.getTarget());
		Circle circleObj = (Circle)joinPoint.getTarget();
	}

//	@Before("args(String)")
//	public void stringArgumentMethods() {
//		System.out.println("A method that takes String argument is called");
//	}

	@Before("args(name)")
	//by using name, we not giving it variable type, we are saying what will be the name of the variable, the variable type will be declared in the method below
	public void stringArgumentMethods(String name) {
		//here by using String name in stringArgumentMethods() we have mentioned that a variable of type String. 
		System.out.println("A method that takes String argument is called " +name);
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	@Pointcut("within(com.sauravcodeblog.Model.Circle)")
	public void allCircleMethods() {}
}