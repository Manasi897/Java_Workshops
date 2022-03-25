package com.cybage.cms.service;

import java.util.List;


import com.cybage.cms.model.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer);
	List<Customer> getAllCustomer();
	Customer getCustomerById(int id);
	Customer updateCustomer(Customer customer, int id);
	void deleteCustomer(int id);
	Customer getByName(String name);
}
