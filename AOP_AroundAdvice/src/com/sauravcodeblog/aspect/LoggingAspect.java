package com.sauravcodeblog.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class LoggingAspect {
	Object returnValue = null;
	@Around("allGetters()")
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

@Pointcut("execution(* * get*(..))")
public void allGetters(){}
}

//If you want to return the target value then you can use Object return type. Else you can keep the code with void return type and do not use returnValue