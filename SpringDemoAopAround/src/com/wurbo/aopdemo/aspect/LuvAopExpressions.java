package com.wurbo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {

	@Pointcut("execution(* com.wurbo.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	// create pointcut for getter methods
	@Pointcut("execution(* com.wurbo.aopdemo.dao.*.get*(..))")
	public void getters() {}
	
	// create pointcut for setter methods
	@Pointcut("execution(* com.wurbo.aopdemo.dao.*.set*(..))")
	public void setters() {}
	
	// create pointcut: include package... exclude getters/setters
	@Pointcut("forDaoPackage() && !(getters() || setters())")
	public void forDaoPackageNoGetterSetter() {}
	
}
