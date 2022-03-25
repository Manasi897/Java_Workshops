package com.cybage.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cybage.cms.model.Address;
import com.cybage.cms.model.Customer;

public interface AddressRepository extends JpaRepository<Address,Integer> {
	
}
