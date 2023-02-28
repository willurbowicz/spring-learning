package com.wurbo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Pointcut("execution(* com.wurbo.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	// create pointcut for getter methods
	@Pointcut("execution(* com.wurbo.aopdemo.dao.*.get*(..))")
	private void getters() {}
	
	// create pointcut for setter methods
	@Pointcut("execution(* com.wurbo.aopdemo.dao.*.set*(..))")
	private void setters() {}
	
	// create pointcut: include package... exclude getters/setters
	@Pointcut("forDaoPackage() && !(getters() || setters())")
	private void forDaoPackageNoGetterSetter() {}
	
	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>> Executing @Before advice on method");
	}
	
	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\n=====>>> Performing API Analytics");
	}
}
