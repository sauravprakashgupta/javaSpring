package com.sauravcodeblog.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters() && allCircleMethods")
	public void LoggingAdvice() {
		System.out.println("Advice Run, Get method Call");
	}
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
//	@Pointcut("execute(* * com.sauravcodeblog.Model.Circle.*(..))")
//	@Pointcut("within(com.sauravcodeblog.Model..)")
	@Pointcut("within(com.sauravcodeblog.Model.Circle)")
	public void allCircleMethods() {}
}