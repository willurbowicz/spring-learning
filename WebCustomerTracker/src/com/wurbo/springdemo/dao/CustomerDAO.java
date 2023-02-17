package com.wurbo.springdemo.dao;

import java.util.List;

import com.wurbo.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

}
