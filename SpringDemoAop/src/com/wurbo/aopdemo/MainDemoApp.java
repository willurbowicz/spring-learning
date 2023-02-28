package com.wurbo.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wurbo.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// call the business method
		theAccountDAO.addAccount();
		
		// do it again!
		System.out.println("\n let's call it again! \n");
		theAccountDAO.addAccount();
		
		// close the context
		context.close();
	}

}
