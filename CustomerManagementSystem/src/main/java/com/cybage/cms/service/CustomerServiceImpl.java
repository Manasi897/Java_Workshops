package com.cybage.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.cms.model.Customer;
import com.cybage.cms.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepo;
	
	

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerRepo.findById(id).get();
	}

	@Override
	public Customer updateCustomer(Customer customer, int id) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(id);
	}

	@Override
	public Customer getByName(String name) {
		// TODO Auto-generated method stub
		return customerRepo.findByName(name);
	}
}
