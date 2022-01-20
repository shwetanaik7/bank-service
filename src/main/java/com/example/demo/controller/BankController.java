package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.BCustomerService;


@RestController
public class BankController {
	@Autowired
	
    BCustomerService customerService;
	
	@GetMapping("/customer")
		Iterable<Customer> getCustomers() {
			return customerService.getCustomers();
		}
	
	@PostMapping("/customer")
	void createCustomer(@RequestBody Customer customer)
	{
		System.out.println(customer.getName());
		customerService.saveCustomer(customer);
	}
	

}
