package com.cybage.cms.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.cms.model.Customer;
import com.cybage.cms.service.CustomerService;



@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/save")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
		return new ResponseEntity<Customer>(customerService.saveCustomer(customer),HttpStatus.CREATED);
	}
	
	@GetMapping("/list")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	@GetMapping("/getCustomer/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id){
		return new ResponseEntity<Customer>(customerService.getCustomerById(id),HttpStatus.OK);
		
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") int id, @RequestBody Customer customer){
		return new ResponseEntity<Customer>(customerService.updateCustomer(customer,id),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") int id){
		customerService.deleteCustomer(id);
		return new  ResponseEntity<Customer>(HttpStatus.OK);
	}
	
	@GetMapping("/search/{name}")
	public  ResponseEntity<Customer> getByName(@PathVariable("name") String name){
		return new ResponseEntity<Customer>(customerService.getByName(name),HttpStatus.OK);
	}
}
