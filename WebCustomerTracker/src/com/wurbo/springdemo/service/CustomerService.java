package com.wurbo.springdemo.service;

import java.util.List;

import com.wurbo.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);
}
