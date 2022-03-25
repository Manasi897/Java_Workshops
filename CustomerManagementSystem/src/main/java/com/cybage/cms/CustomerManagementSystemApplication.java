package com.cybage.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.cybage.cms")
@EnableJpaRepositories(basePackages="com.cybage.cms.repository")
@EntityScan(basePackages = "com.cybage.cms.model")
public class CustomerManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManagementSystemApplication.class, args);
	}

}
