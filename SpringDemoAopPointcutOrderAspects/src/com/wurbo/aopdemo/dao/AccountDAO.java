package com.wurbo.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.wurbo.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + ": Doing my DB work: Add Account");
	}
	
	public boolean doWork()
	{
		System.out.println(getClass() + ": doWork");
		return true;
	}

	public String getName() {
		System.out.println(getClass() + ": getName");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": setName");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": getServiceCode");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": setServiceCode");
		this.serviceCode = serviceCode;
	}
}
