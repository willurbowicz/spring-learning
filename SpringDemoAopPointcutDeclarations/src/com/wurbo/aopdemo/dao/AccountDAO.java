package com.wurbo.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.wurbo.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + ": Doing my DB work: Add Account");
	}
	
	public boolean doWork()
	{
		System.out.println(getClass() + ": doWork");
		return true;
	}
}
