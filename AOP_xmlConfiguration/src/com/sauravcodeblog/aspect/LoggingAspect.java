package com.sauravcodeblog.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


public class LoggingAspect {
	Object returnValue = null;
	
	public Object allAroundAdvice(ProceedingJoinPoint pjp) {
		try {
			System.out.println("Before advice :");
			returnValue =  pjp.proceed();
			System.out.println("After returning");
		}catch(Throwable e) {
			System.out.println("After Throwing");
		}
		System.out.println("After Finally");
		return returnValue;
	}
	
	public void allGetters() {}

}